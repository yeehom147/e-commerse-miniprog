package com.yeehom.ecommerseminiprog.entity;

import com.yeehom.ecommerseminiprog.enums.RegType;

/**
 * Created by kongxq on 2017/5/28.
 */
public class RegularEntity {

    private boolean isMatch;

    private RegType matchType;

    private String matchContent;

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }

    public RegType getMatchType() {
        return matchType;
    }

    public void setMatchType(RegType matchType) {
        this.matchType = matchType;
    }

    public String getMatchContent() {
        return matchContent;
    }

    public void setMatchContent(String matchContent) {
        this.matchContent = matchContent;
    }

    @Override
    public String toString() {
        return "RegularEntity{" +
                "isMatch=" + isMatch +
                ", matchType='" + matchType + '\'' +
                ", matchContent='" + matchContent + '\'' +
                '}';
    }
}
