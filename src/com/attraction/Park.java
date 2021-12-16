package com.attraction;

import java.util.Date;

public class Park extends Attraction{

    private String name;
    private Date openTime;
    private Date closeTime;

    public Park() {
    }

    public Park(Ticket ticketing) {
        super(ticketing);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", openTime='" + openTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                '}';
    }
}
