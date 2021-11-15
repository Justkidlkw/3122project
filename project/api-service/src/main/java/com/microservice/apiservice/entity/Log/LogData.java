package com.microservice.apiservice.entity.Log;


import lombok.Data;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class LogData {

    private String type;
    private String action;
    private String createdAt;

    public LogData(String type, String action) {
        this.type = type;
        this.action = action;

        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");

        this.createdAt = formatter1.format(ts) + "T" + formatter2.format(ts) + "Z";
    }
}
