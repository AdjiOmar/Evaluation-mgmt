package com.niit.evaluation_mgmt.model;

import java.util.Objects;

public class Message {

    private String de;
    private String message;
    private String a;

    public Message() {
    }

    public Message(String de, String message, String a) {
        this.de = de;
        this.message = message;
        this.a = a;
    }

    public String getDe() {
        return this.de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getA() {
        return this.a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Message de(String de) {
        setDe(de);
        return this;
    }

    public Message message(String message) {
        setMessage(message);
        return this;
    }

    public Message a(String a) {
        setA(a);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Message)) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(de, message.de) && Objects.equals(message, message.message)
                && Objects.equals(a, message.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(de, message, a);
    }

    @Override
    public String toString() {
        return "{" +
                " de='" + getDe() + "'" +
                ", message='" + getMessage() + "'" +
                ", a='" + getA() + "'" +
                "}";
    }

}