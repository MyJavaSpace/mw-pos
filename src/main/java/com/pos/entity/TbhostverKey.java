package com.pos.entity;

public class TbhostverKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbhostver.fsFileName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsFileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbhostver.fsHost
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    private String fsHost;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbhostver.fsFileName
     *
     * @return the value of tbhostver.fsFileName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsFileName() {
        return fsFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbhostver.fsFileName
     *
     * @param fsFileName the value for tbhostver.fsFileName
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsFileName(String fsFileName) {
        this.fsFileName = fsFileName == null ? null : fsFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbhostver.fsHost
     *
     * @return the value of tbhostver.fsHost
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public String getFsHost() {
        return fsHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbhostver.fsHost
     *
     * @param fsHost the value for tbhostver.fsHost
     *
     * @mbggenerated Fri Mar 03 15:37:51 CST 2017
     */
    public void setFsHost(String fsHost) {
        this.fsHost = fsHost == null ? null : fsHost.trim();
    }
}