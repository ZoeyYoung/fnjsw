package fnjsw.entity;

import java.util.Date;

public class Familyplanningcertificate {
    private Integer id;

    private Integer ocaid;

    private String filename;

    private Date uploadtime;

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}