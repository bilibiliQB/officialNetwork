package com.dute.officialNetwork.api.em;

public enum CaseStyleEnum {
    QB(0,"全部",""),
    XD(1,"现代","现代"),
    TY(2,"田园","田园"),
    ZS(3,"中式","中式"),
    BO(4,"北欧","北欧"),
    DZH(5,"地中海","地中海"),
    RS(6,"日式","日式");

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
