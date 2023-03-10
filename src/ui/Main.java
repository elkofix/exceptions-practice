package ui;

import java.util.Scanner;

import model.ParkingController;

public class Main {
    private Scanner sc;
    private ParkingController control;
    public Main(){
        sc = new Scanner(System.in);
        control = new ParkingController();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startService();

    }

    public void startService(){
        System.out.println("Bienvenido al parqueadero, ¿Ingresa en (1) carro o (2) moto? \n\n"+
        "Digite el numero de opcion:");
        sc.nextInt();
    }
}
