package com.roomservice.notification.rest;

public class Notify {

    private final long id;
    private final String content;

    public Notify(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}