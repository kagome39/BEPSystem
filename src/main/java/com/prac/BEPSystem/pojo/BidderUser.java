package com.prac.BEPSystem.pojo;

/**
 * 投标者用户类
 */
public class BidderUser {
    private Integer bidder_id;
    private String bidder_name;
    private String bidder_password;
    private Integer bidder_tel;
    private String bidder_description;


    public Integer getBidder_id() {
        return bidder_id;
    }

    public void setBidder_id(Integer bidder_id) {
        this.bidder_id = bidder_id;
    }

    public String getBidder_name() {
        return bidder_name;
    }

    public void setBidder_name(String bidder_name) {
        this.bidder_name = bidder_name;
    }

    public String getBidder_password() {
        return bidder_password;
    }

    public void setBidder_password(String bidder_password) {
        this.bidder_password = bidder_password;
    }

    public Integer getBidder_tel() {
        return bidder_tel;
    }

    public void setBidder_tel(Integer tbidder_tel) {
        this.bidder_tel = tbidder_tel;
    }

    public String getBidder_description() {
        return bidder_description;
    }

    public void setBidder_description(String bidder_description) {
        this.bidder_description = bidder_description;
    }


    @Override
    public String toString() {
        return "BidderUser{" +
                "bidder_id=" + bidder_id +
                ", bidder_name='" + bidder_name + '\'' +
                ", bidder_password='" + bidder_password + '\'' +
                ", bidder_tel=" + bidder_tel +
                ", bidder_description='" + bidder_description + '\'' +
                '}';
    }
}
