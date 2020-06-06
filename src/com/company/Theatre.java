package com.company;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String theatreRoomNumber;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreRoomNumber, int numRows, int seatsPerRow) {
        this.theatreRoomNumber = theatreRoomNumber;

        int lastRow = 'A' + (numRows - 1);
        for(char row='A'; row<=lastRow; row++){
            for(int seatNum=1; seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
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
        Seat requestedSeat = null;
        for(Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null){
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
        return requestedSeat.seatReserve();
    }

    // For Testing
    public void getSeats(){
        for(Seat seat: seats){
            System.out.print(seat.getSeatNumber()+" ");
        }
        System.out.println();
    }
}
