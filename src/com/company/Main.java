package com.company;

public class Main {

    public static void main(String[] args) {
        Theatre floorOne = new Theatre("IMAX Room", 10,14);
	    Theatre floorTwo = new Theatre("Standard Room One", 8, 12);

	    floorOne.getSeats();
	    if(floorOne.reserveSeat("C18")){
            System.out.println("Please pay");
        }
//	    floorTwo.getSeats();
    }
}
