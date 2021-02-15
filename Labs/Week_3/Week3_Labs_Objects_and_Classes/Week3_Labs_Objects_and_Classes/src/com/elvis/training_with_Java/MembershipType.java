package com.elvis.training_with_Java;

public class MembershipType {
    private Integer tradeLimit=0;
    private String Membership;

    public String MembershipType(){
        return Membership = "None";
    }

    public Integer getTradeLimit() {
        return tradeLimit;
    }

    public void setTradeLimit(Integer tradeLimit) {
        this.tradeLimit = tradeLimit;
    }

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String value) {
        this.Membership = value;
    }
}
