package com.company;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String theatreRoomNumber;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreRoomNumber, List<Seat> seats) {
        this.theatreRoomNumber = theatreRoomNumber;
        this.seats = seats;
    }

    public String getTheatreRoomNumber() {
        return theatreRoomNumber;
    }

    public void setTheatreRoomNumber(String theatreRoomNumber) {
        this.theatreRoomNumber = theatreRoomNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
