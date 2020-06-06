package com.company;

public class Seat {
    private String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean seatReserve() {
        if(!this.reserved){
            this.reserved = true;
            System.out.println("Seat "+seatNumber+" reserved");
            return true;
        }else{
            return false;
        }
    }
    public boolean seatCancel(){
        if(!this.reserved){
            this.reserved = true;
            System.out.println("Reservation of seat "+seatNumber+" cancelled");
            return true;
        }else{
            return false;
        }
    }
}
