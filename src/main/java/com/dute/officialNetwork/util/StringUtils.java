package com.dute.officialNetwork.util;


import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 字符串工具类, 继承org.apache.commons.lang3.StringUtils类
 *
 * @author ThinkGem
 * @version 2013-05-22
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    private static final char SEPARATOR = '_';
    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 以 t 为分隔符拼接 r，结果放到 s 上
     * @param s
     * @param t
     * @param r
     * @return
     */
    public static String join2(String s, String t, List<String> r) {
        if (r != null && r.size() > 0) {
            String z = r.get(0);
            r.remove(0);
            if (StringUtils.isEmpty(s)) {
                return join2(z, t, r);
            } else if (StringUtils.isEmpty(z)){
                return join2(s, t, r);
            } else {
                return join2(s+t+z, t, r);
            }
        }
        return StringUtils.isEmpty(s) ? "" : s;
    }

    /**
     * 转换为字节数组
     *
     * @param str
     * @return
     */
    public static byte[] getBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes(CHARSET_NAME);
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * 转换为字节数组
     *
     * @return
     */
    public static String toString(byte[] bytes) {
        try {
            return new String(bytes, CHARSET_NAME);
        } catch (UnsupportedEncodingException e) {
            return EMPTY;
        }
    }

    /**
     * 是否包含字符串
     *
     * @param str  验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inString(String str, String... strs) {
        if (str != null) {
            for (String s : strs) {
                if (str.equals(trim(s))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 替换掉HTML标签方法
     */
    public static String replaceHtml(String html) {
        if (isBlank(html)) {
            return "";
        }
        String regEx = "<.+?>";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(html);
        String s = m.replaceAll("");
        return s;
    }

    public static boolean isUrl(String resource) {
        return resource.matches("(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
    }

    public static boolean isNotUrl(String resource) {
        return !isUrl(resource);
    }

    /**
     * 替换为手机识别的HTML，去掉样式及属性，保留回车。
     *
     * @param html
     * @return
     */
    public static String replaceMobileHtml(String html) {
        if (html == null) {
            return "";
        }
        return html.replaceAll("<([a-z]+?)\\s+?.*?>", "<$1>");
    }

    /**
     * 缩略字符串（不区分中英文字符）
     *
     * @param str    目标字符串
     * @param length 截取长度
     * @return
     */
    public static String abbr(String str, int length) {
        if (str == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int currentLength = 0;
            for (char c : replaceHtml(StringEscapeUtils.unescapeHtml4(str)).toCharArray()) {
                currentLength += String.valueOf(c).getBytes("GBK").length;
                if (currentLength <= length - 3) {
                    sb.append(c);
                } else {
                    sb.append("...");
                    break;
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获得i18n字符串
     public static String getMessage(String code, Object[] args) {
     LocaleResolver localLocaleResolver = (LocaleResolver) SpringContextHolder.getBean(LocaleResolver.class);
     HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
     Locale localLocale = localLocaleResolver.resolveLocale(request);
     return SpringContextHolder.getApplicationContext().getMessage(code, args, localLocale);
     }
     */

    /**
     * 获得用户远程地址
     */
    public static String getRemoteAddr(HttpServletRequest request) {
        String remoteAddr = request.getHeader("X-Real-IP");
        if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("X-Forwarded-For");
        } else if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("Proxy-Client-IP");
        } else if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("WL-Proxy-Client-IP");
        }
        return remoteAddr != null ? remoteAddr : request.getRemoteAddr();
    }

    /**
     * 驼峰命名法工具
     *
     * @return toCamelCase("hello_world") == "helloWorld"
     */
    public static String toCamelCase(String s) {
        if (s == null) return null;

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s.length());

        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == SEPARATOR) {
                upperCase = true;
            } else if (upperCase) {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * 驼峰命名法工具
     *
     * @return toCapitalizeCamelCase("hello_world") == "HelloWorld"
     */
    public static String toCapitalizeCamelCase(String s) {
        if (s == null) return null;

        s = toCamelCase(s);

        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    /**
     * 驼峰命名法工具
     *
     * @return toUnderScoreCase("helloWorld") = "hello_world"
     */
    public static String toUnderScoreCase(String s) {
        if (s == null) return null;

        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean nextUpperCase = true;

            if (i < (s.length() - 1)) {
                nextUpperCase = Character.isUpperCase(s.charAt(i + 1));
            }

            if ((i > 0) && Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    sb.append(SEPARATOR);
                }

                upperCase = true;
            } else {
                upperCase = false;
            }

            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isDate(String str) {
        Pattern pattern = Pattern.compile("\\d{4}-[0-1]\\d-[0-3]\\d");
        return pattern.matcher(str).matches();
    }

    public static boolean isDate(String str, String format) {
        String patternStr = "";
        if (null == format || format.equals(""))
            return false;

        if (format.equals("yMd"))
            patternStr = "\\d{4}-[0-1]\\d-[0-3]\\d";
        else if (format.equals("yMdHms"))
            patternStr = "\\d{4}-[0-1]\\d-[0-3]\\d [0-2]\\d:[0-5]\\d:[0-5]\\d";
        else
            return false;

        Pattern pattern = Pattern.compile(patternStr);
        return pattern.matcher(str).matches();
    }

    public static boolean isTime(String str, String format) {
        String patternStr = "";
        if (null == format || format.equals(""))
            return false;

        if (format.equals("Hm"))
            patternStr = "[0-2]\\d:[0-5]\\d";
        else if (format.equals("Hms"))
            patternStr = "[0-2]\\d:[0-5]\\d:[0-5]\\d";
        else
            return false;

        Pattern pattern = Pattern.compile(patternStr);
        return pattern.matcher(str).matches();
    }



    public static String[] fromCron(String cronExp) {
        String[] c = cronExp.split(" ");
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(c[2]));
//		calendar.add(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, Integer.valueOf(c[1]));
        String beginTime = DateUtils.formatDate(calendar.getTime(), "HH:mm");
        String week = "*".equals(c[5]) ? "N" : c[5];
        return new String[]{beginTime, week};
    }

    // 根据Unicode编码完美的判断中文汉字和符号
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }




    /**
     * 计算字符串表达式
     *
     * @param engine
     * @param formula
     * @return
     */
    public static Object evalAsJavaScript(ScriptEngine engine, String formula) {
        if (engine == null) {
            engine = new ScriptEngineManager().getEngineByExtension("js");
        }
        try {
            return engine.eval(formula);
        } catch (ScriptException e) {
            throw new RuntimeException("计算出错", e);
        }
    }


    /**
     * 首字母转小写
     *
     * @param s 待转换的字符串
     * @return
     */
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    

    /**
     * 首字母转大写
     *
     * @param s 待转换的字符串
     * @return
     */
    public static String toisUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    
    /**
  	 * 转换为Boolean类型
  	 * 'true', 'on', 'y', 't', 'yes' or '1' (case insensitive) will return true. Otherwise, false is returned.
  	 */
  	public static Boolean toBoolean(final Object val){
  		if (val == null){
  			return false;
  		}
  		return BooleanUtils.toBoolean(val.toString()) || "1".equals(val.toString());
  	}
    
    /**
	 * 如果对象为空，则使用defaultVal值 
	 * 	see: ObjectUtils.toString(obj, defaultVal)
	 * @param obj
	 * @param defaultVal
	 * @return
	 */
    public static String toString(final Object obj, final String defaultVal) {
    	 return obj == null ? defaultVal : obj.toString();
    }
	


}
