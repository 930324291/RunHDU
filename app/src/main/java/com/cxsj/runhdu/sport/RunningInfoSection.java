package com.cxsj.runhdu.sport;

import com.chad.library.adapter.base.entity.SectionEntity;

public class RunningInfoSection extends SectionEntity<RunningInfo> {

    public RunningInfo runningInfo;
    private String header;
    private String times;

    public RunningInfoSection(boolean isHeader, String header) {
        super(isHeader, header);
        this.header = header;
    }

    public RunningInfoSection(RunningInfo info) {
        super(info);
        runningInfo = info;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
