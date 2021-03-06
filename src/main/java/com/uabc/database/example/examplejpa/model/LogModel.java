package com.uabc.database.example.examplejpa.model;

import java.util.Date;

public class LogModel {


    private int id;
    private String date;
    private String details;
    private String username;
    private String url;


    public LogModel() {

    }

    public LogModel(int id, String date, String details, String username, String url) {
        this.id = id;
        this.date = date;
        this.details = details;
        this.username = username;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "id=" + id +
                ", date=" + date +
                ", details='" + details + '\'' +
                ", username='" + username + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
