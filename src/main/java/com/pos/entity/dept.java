package com.pos.entity;

public class Dept extends DeptKey {
    private String fsdeptname;

    private Integer fideptcls;

    private String fsprintername;

    private String fsprintername2;

    private Integer fiisbackbill;

    private Integer fiishurrybill;

    private Integer fiischangebill;

    private Integer fiistaskbill;

    private Integer fiisturnbill;

    private Integer fiisoneitemcut;

    private Integer fiprintcopies;

    private Integer fistatus;

    private String fsupdatetime;

    private String fsupdateuserid;

    private String fsupdateusername;

    public String getFsdeptname() {
        return fsdeptname;
    }

    public void setFsdeptname(String fsdeptname) {
        this.fsdeptname = fsdeptname == null ? null : fsdeptname.trim();
    }

    public Integer getFideptcls() {
        return fideptcls;
    }

    public void setFideptcls(Integer fideptcls) {
        this.fideptcls = fideptcls;
    }

    public String getFsprintername() {
        return fsprintername;
    }

    public void setFsprintername(String fsprintername) {
        this.fsprintername = fsprintername == null ? null : fsprintername.trim();
    }

    public String getFsprintername2() {
        return fsprintername2;
    }

    public void setFsprintername2(String fsprintername2) {
        this.fsprintername2 = fsprintername2 == null ? null : fsprintername2.trim();
    }

    public Integer getFiisbackbill() {
        return fiisbackbill;
    }

    public void setFiisbackbill(Integer fiisbackbill) {
        this.fiisbackbill = fiisbackbill;
    }

    public Integer getFiishurrybill() {
        return fiishurrybill;
    }

    public void setFiishurrybill(Integer fiishurrybill) {
        this.fiishurrybill = fiishurrybill;
    }

    public Integer getFiischangebill() {
        return fiischangebill;
    }

    public void setFiischangebill(Integer fiischangebill) {
        this.fiischangebill = fiischangebill;
    }

    public Integer getFiistaskbill() {
        return fiistaskbill;
    }

    public void setFiistaskbill(Integer fiistaskbill) {
        this.fiistaskbill = fiistaskbill;
    }

    public Integer getFiisturnbill() {
        return fiisturnbill;
    }

    public void setFiisturnbill(Integer fiisturnbill) {
        this.fiisturnbill = fiisturnbill;
    }

    public Integer getFiisoneitemcut() {
        return fiisoneitemcut;
    }

    public void setFiisoneitemcut(Integer fiisoneitemcut) {
        this.fiisoneitemcut = fiisoneitemcut;
    }

    public Integer getFiprintcopies() {
        return fiprintcopies;
    }

    public void setFiprintcopies(Integer fiprintcopies) {
        this.fiprintcopies = fiprintcopies;
    }

    public Integer getFistatus() {
        return fistatus;
    }

    public void setFistatus(Integer fistatus) {
        this.fistatus = fistatus;
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public String getFsupdateuserid() {
        return fsupdateuserid;
    }

    public void setFsupdateuserid(String fsupdateuserid) {
        this.fsupdateuserid = fsupdateuserid == null ? null : fsupdateuserid.trim();
    }

    public String getFsupdateusername() {
        return fsupdateusername;
    }

    public void setFsupdateusername(String fsupdateusername) {
        this.fsupdateusername = fsupdateusername == null ? null : fsupdateusername.trim();
    }
}