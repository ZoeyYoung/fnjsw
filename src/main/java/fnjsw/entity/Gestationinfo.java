package fnjsw.entity;

import java.util.Date;

public class Gestationinfo {
    private Integer id;

    private Integer ocaid;

    private Date servicetime;

    private String serviceresult;

    private String serviceperson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOcaid() {
        return ocaid;
    }

    public void setOcaid(Integer ocaid) {
        this.ocaid = ocaid;
    }

    public Date getServicetime() {
        return servicetime;
    }

    public void setServicetime(Date servicetime) {
        this.servicetime = servicetime;
    }

    public String getServiceresult() {
        return serviceresult;
    }

    public void setServiceresult(String serviceresult) {
        this.serviceresult = serviceresult;
    }

    public String getServiceperson() {
        return serviceperson;
    }

    public void setServiceperson(String serviceperson) {
        this.serviceperson = serviceperson;
    }
}