package com.wasdkiller.taximeter;

public class TripDetails {

    String distance;
    String price;
    String waitingTime;
    String startingLongitude;
    String stringLatitude;
    String endingLongitude;
    String endingLatitude;

    public TripDetails(){

    }

    public TripDetails(String distance, String price, String waitingTime, String startingLongitude, String stringLatitude, String endingLongitude, String endingLatitude) {
        this.distance = distance;
        this.price = price;
        this.waitingTime = waitingTime;
        this.startingLongitude = startingLongitude;
        this.stringLatitude = stringLatitude;
        this.endingLongitude = endingLongitude;
        this.endingLatitude = endingLatitude;
    }

    public String getDistance() {
        return distance;
    }

    public String getPrice() {
        return price;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public String getStartingLongitude() {
        return startingLongitude;
    }

    public String getStringLatitude() {
        return stringLatitude;
    }

    public String getEndingLongitude() {
        return endingLongitude;
    }

    public String getEndingLatitude() {
        return endingLatitude;
    }
}
