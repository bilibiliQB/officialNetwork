package com.dute.officialNetwork.api.em;

public enum CaseAreaEnum {
    AREA_ALL(0,"全部",""),
    AREA_LT_60(1,"小于60㎡","60"),
    AREA_GT_60_LT_80(2,"60㎡-80㎡","60-80"),
    AREA_GT_80_LT_100(3,"80㎡-100㎡","80-100"),
    AREA_GT_100_LT_120(4,"100㎡-120㎡","100-120"),
    AREA_GT_120_LT_150(5,"120㎡-150㎡","120-150"),
    AREA_GT_150(6,"大于150㎡","150");

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

    CaseAreaEnum(Integer areaFlag, String areaContent,String arerValue) {
        this.areaFlag = areaFlag;
        this.areaContent = areaContent;
        this.arerValue = arerValue;
    }

    public static CaseAreaEnum get(String areaContent){
        for (CaseAreaEnum caseAreaEnum : CaseAreaEnum.values()) {
            if (caseAreaEnum.areaContent.equals(areaContent)) {
                return caseAreaEnum;
            }
        }
        return null;
    }

    public static CaseAreaEnum get(Integer areaFlag){
        for (CaseAreaEnum caseAreaEnum : CaseAreaEnum.values()) {
            if (caseAreaEnum.areaFlag.equals(areaFlag)) {
                return caseAreaEnum;
            }
        }
        return null;
    }
}
