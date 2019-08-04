package com.jet.dabo.model;

public class UserDB {

    private int userID_;
    private int gender_;
    private long createdTime_;

    public int getUserID() {
        return userID_;
    }

    public void setUserID(int value) {
        userID_ = value;
    }

    public int getGender() {
        return gender_;
    }

    public void setGender(int value) {
        gender_ = value;
    }

    public long getCreatedTime_() {
        return createdTime_;
    }

    public void setCreatedTime(long value) {
        createdTime_ = value;
    }
}
