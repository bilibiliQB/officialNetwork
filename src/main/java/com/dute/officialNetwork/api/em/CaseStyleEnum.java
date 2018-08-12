package com.dute.officialNetwork.api.em;

public enum CaseStyleEnum {
    QB(0,"全部",""),
    HXD(1,"后现代","后现代"),
    JY(2,"简约","简约"),
    TY(3,"田园","田园"),
    ZS(4,"中式","中式"),
    OS(5,"欧式","欧式"),
    DZH(6,"地中海","地中海"),
    DNY(7,"东南亚","东南亚"),
    HD(8,"混搭","混搭"),
    MS(9,"美式","美式");

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

    CaseStyleEnum(Integer areaFlag, String areaContent,String arerValue) {
        this.areaFlag = areaFlag;
        this.areaContent = areaContent;
        this.arerValue = arerValue;
    }

    public static CaseStyleEnum get(String areaContent){
        for (CaseStyleEnum caseStyleEnum : CaseStyleEnum.values()) {
            if (caseStyleEnum.areaContent.equals(areaContent)) {
                return caseStyleEnum;
            }
        }
        return null;
    }

    public static CaseStyleEnum get(Integer areaFlag){
        for (CaseStyleEnum caseStyleEnum : CaseStyleEnum.values()) {
            if (caseStyleEnum.areaFlag.equals(areaFlag)) {
                return caseStyleEnum;
            }
        }
        return null;
    }
}
