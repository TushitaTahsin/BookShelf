package com.sust.bookshelf;

import java.io.Serializable;

public class Request implements Serializable {
    private String username;
    private String bookTitle;
    private String returndate;

    public Request(String username, String bookTitle, String returndate, long status, String parent) {
        this.username = username;
        this.bookTitle = bookTitle;
        this.returndate = returndate;
        this.status = status;
        this.parent = parent;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    private long status;

    public long getStatus() {
        return status;
    }

    private String parent;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Request() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
