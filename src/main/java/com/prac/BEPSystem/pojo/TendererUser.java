package com.prac.BEPSystem.pojo;

/**
 * 招标者用户类
 */
public class TendererUser {
    private Integer tenderer_id;
    private String tenderer_name;
    private String tenderer_password;
    private Integer tenderer_tel;
    private String tenderer_description;





    public Integer getTenderer_id() {
        return tenderer_id;
    }

    public void setTenderer_id(Integer tenderer_id) {
        this.tenderer_id = tenderer_id;
    }

    public String getTenderer_name() {
        return tenderer_name;
    }

    public void setTenderer_name(String tenderer_name) {
        this.tenderer_name = tenderer_name;
    }

    public String getTenderer_password() {
        return tenderer_password;
    }

    public void setTenderer_password(String tenderer_password) {
        this.tenderer_password = tenderer_password;
    }

    public Integer getTenderer_tel() {
        return tenderer_tel;
    }

    public void setTenderer_tel(Integer tenderer_tel) {
        this.tenderer_tel = tenderer_tel;
    }

    public String getTenderer_description() {
        return tenderer_description;
    }

    public void setTenderer_description(String tenderer_description) {
        this.tenderer_description = tenderer_description;
    }


    @Override
    public String toString() {
        return "TendererUser{" +
                "tenderer_id=" + tenderer_id +
                ", tenderer_name='" + tenderer_name + '\'' +
                ", tenderer_password='" + tenderer_password + '\'' +
                ", tenderer_tel=" + tenderer_tel +
                ", tenderer_description='" + tenderer_description + '\'' +
                '}';
    }
}
