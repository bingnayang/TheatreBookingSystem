package com.company;

import java.util.*;

public class Theatre {
    private String theatreRoomNumber;
    private List<Seat> seats = new ArrayList<>();

    // Anonymous inner class
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            }else if(seat1.getPrice() > seat2.getPrice()){
                return 1;
            }else{
                return 0;
            }
        }
    };

    public Theatre(String theatreRoomNumber, int numRows, int seatsPerRow) {
        this.theatreRoomNumber = theatreRoomNumber;

        // Generate seats number
        int lastRow = 'A' + (numRows - 1);
        for(char row='A'; row<=lastRow; row++){
            for(int seatNum=1; seatNum<=seatsPerRow;seatNum++){
                double price = 12.00;
                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;
                }else if((row > 'F') || (seatNum < 4 || seatNum > 9)){
                    price = 7.00;
                }

                if(theatreRoomNumber == "IMAX"){
                    Seat seat = new Seat(row + String.format("%02d",seatNum),price+2.00);
                    seats.add(seat);
                }else{
                    Seat seat = new Seat(row + String.format("%02d",seatNum),price);
                    seats.add(seat);
                }
            }
        }
    }

    public String getTheatreRoomNumber() {
        return theatreRoomNumber;
    }

    public void setTheatreRoomNumber(String theatreRoomNumber) {
        this.theatreRoomNumber = theatreRoomNumber;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber,0.0);
        int foundSeat = Collections.binarySearch(seats,requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).seatReserve();
        }else {
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
    }

    // For Testing
    public Collection<Seat> getSeats(){
        return seats;
    }
}
