package model;

import java.time.LocalDate;

public class ParkingController{

    private int carSpaces;
    private int bikeSpaces;
    private LocalDate today;

    public ParkingController() {
        this.carSpaces = 100;
        this.bikeSpaces = 200;
        today = LocalDate.now();
    }

        
}