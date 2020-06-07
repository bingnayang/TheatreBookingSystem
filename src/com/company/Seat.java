package com.company;

import java.util.Comparator;
// To improve reserve seat method and its performance, implements Comparable
public class Seat implements Comparable<Seat> {
    private String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
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
