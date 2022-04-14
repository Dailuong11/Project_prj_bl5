/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vu Dai Luong
 */
public class EndAttend {
    private int id;
    private String userName;
    private String endTime;
    private String date;
    private int total;

    public EndAttend() {
    }

    public EndAttend(int id, String userName, String endTime, String date, int total) {
        this.id = id;
        this.userName = userName;
        this.endTime = endTime;
        this.date = date;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "EndAttend{" + "id=" + id + ", userName=" + userName + ", endTime=" + endTime + ", date=" + date + ", total=" + total + '}';
    }
}
