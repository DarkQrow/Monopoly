package com.CawCawStudio.AuthChoice.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class POST {

    @SerializedName("headers")
    @Expose
    private String headers;
    @SerializedName("botToken")
    @Expose
    private String botToken;

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getBotToken() {
        return botToken;
    }

    public void setBotToken(String botToken) {
        this.botToken = botToken;
    }

}