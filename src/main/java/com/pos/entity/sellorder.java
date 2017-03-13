package com.pos.entity;

public class sellorder extends sellorderKey {
    private Integer fiordercls;

    private Integer fiorderste;

    private String fsnote;

    private String fsupdatetime;

    private String fscreatetime;

    private String fscreateuserid;

    private String fscreateusername;

    private String fsdatasrckind;

    private String fssrcverno;

    private Integer lver;

    public Integer getFiordercls() {
        return fiordercls;
    }

    public void setFiordercls(Integer fiordercls) {
        this.fiordercls = fiordercls;
    }

    public Integer getFiorderste() {
        return fiorderste;
    }

    public void setFiorderste(Integer fiorderste) {
        this.fiorderste = fiorderste;
    }

    public String getFsnote() {
        return fsnote;
    }

    public void setFsnote(String fsnote) {
        this.fsnote = fsnote == null ? null : fsnote.trim();
    }

    public String getFsupdatetime() {
        return fsupdatetime;
    }

    public void setFsupdatetime(String fsupdatetime) {
        this.fsupdatetime = fsupdatetime == null ? null : fsupdatetime.trim();
    }

    public String getFscreatetime() {
        return fscreatetime;
    }

    public void setFscreatetime(String fscreatetime) {
        this.fscreatetime = fscreatetime == null ? null : fscreatetime.trim();
    }

    public String getFscreateuserid() {
        return fscreateuserid;
    }

    public void setFscreateuserid(String fscreateuserid) {
        this.fscreateuserid = fscreateuserid == null ? null : fscreateuserid.trim();
    }

    public String getFscreateusername() {
        return fscreateusername;
    }

    public void setFscreateusername(String fscreateusername) {
        this.fscreateusername = fscreateusername == null ? null : fscreateusername.trim();
    }

    public String getFsdatasrckind() {
        return fsdatasrckind;
    }

    public void setFsdatasrckind(String fsdatasrckind) {
        this.fsdatasrckind = fsdatasrckind == null ? null : fsdatasrckind.trim();
    }

    public String getFssrcverno() {
        return fssrcverno;
    }

    public void setFssrcverno(String fssrcverno) {
        this.fssrcverno = fssrcverno == null ? null : fssrcverno.trim();
    }

    public Integer getLver() {
        return lver;
    }

    public void setLver(Integer lver) {
        this.lver = lver;
    }
}