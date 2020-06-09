package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Theatre floorOne = new Theatre("IMAX", 10,14);
	    Theatre floorTwo = new Theatre("Standard Room One", 8, 12);

	    List<Seat> priceSeats = new ArrayList<>(floorOne.getSeats());
//        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
//        priceList(priceSeats);
//
//        List<Seat> priceSeats2 = new ArrayList<>(floorTwo.getSeats());
//        Collections.sort(priceSeats2, Theatre.PRICE_ORDER);
//        priceList(priceSeats2);

        if(floorOne.reserveSeat("D06")){
            for(Seat seat : priceSeats){
                if(seat.getSeatNumber().equals("D06")){
                    System.out.println("Please pay: $"+seat.getPrice()+" for "+seat.getSeatNumber());
                }
            }
        }else{
            System.out.println("Seat already reserved");
        }
    }
    public static void priceList(List<Seat> list){
        for(Seat seat : list){
            System.out.print(" "+seat.getSeatNumber()+" $"+seat.getPrice());
        }
        System.out.println();
        System.out.println("==========================");
    }
}
