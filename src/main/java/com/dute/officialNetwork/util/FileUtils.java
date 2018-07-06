package com.dute.officialNetwork.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
    public static String checkFileName(MultipartFile fileName){
        //允许上传的文件类型
        String fileType = "pdf,gif,png,jpg,jpeg";
        String ext = FilenameUtils.getExtension(fileName.getOriginalFilename());

        if (StringUtils.isEmpty(ext)||!fileType.contains(ext.toLowerCase())) {
            throw new RuntimeException("文件格式不正确");
        }

        //生成随机字符串
        String uuid = IdGen.uuid();

        //生成新文件名
        String newFileName = uuid + "." + ext;

        return newFileName;

    }
}
