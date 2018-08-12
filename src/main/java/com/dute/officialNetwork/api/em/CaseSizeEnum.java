package com.dute.officialNetwork.api.em;

public enum CaseSizeEnum {
    ALL(0,"全部",""),
    YJ(1,"一居","一居"),
    LJ(2,"两居","两居"),
    SJ(3,"三居","三居"),
    SIJ(4,"四居","四居"),
    FS(5,"复式","复式"),
    BS(6,"别墅","别墅");

    private final Integer areaFlag;

    private final String areaContent;

    private final String arerValue;

    public String getArerValue() {
        return arerValue;
    }

    public Integer getAreaFlag() {
        return areaFlag;
    }

    public String getAreaContent() {
        return areaContent;
    }

    CaseSizeEnum(Integer areaFlag, String areaContent,String arerValue) {
        this.areaFlag = areaFlag;
        this.areaContent = areaContent;
        this.arerValue = arerValue;
    }

    public static CaseSizeEnum get(String areaContent){
        for (CaseSizeEnum caseSizeEnum : CaseSizeEnum.values()) {
            if (caseSizeEnum.areaContent.equals(areaContent)) {
                return caseSizeEnum;
            }
        }
        return null;
    }

    public static CaseSizeEnum get(Integer areaFlag){
        for (CaseSizeEnum caseSizeEnum : CaseSizeEnum.values()) {
            if (caseSizeEnum.areaFlag.equals(areaFlag)) {
                return caseSizeEnum;
            }
        }
        return null;
    }
}
