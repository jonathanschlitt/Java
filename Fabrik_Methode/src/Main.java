import java.util.Scanner;

import fahrzeugHersteller.Bordcomputer;
import fahrzeugHersteller.FactoryForDevices;
import radioZulieferer.Radio;
import usbZulieferer.UsbPlayer;
import cdZulieferer.CD;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        // Erzeugung der Devices mit Fabrik Methode

        FactoryForDevices factory = new FactoryForDevices();

        final Radio radio = factory.createRadio();

        final CD cd = factory.createCD();

        final UsbPlayer usb = factory.createUSB();

        // Übergeben der Devices an den Konstruktor

        final Bordcomputer bc = new Bordcomputer(radio, cd, usb);

        Scanner sc = new Scanner(System.in);

        while (true) {

            // bc.showOptions();

            int input = 0;

            System.out.println(
                    "Please choose an option of the list above. || Enter -1 to change device. || Enter -2 to show options again.");

            input = sc.nextInt();

            // if (input == -1) {
            // bc.changeDevice();
            // }

            switch (input) {
                case -1:
                    bc.changeDevice();
                    break;
                case -2:
                    bc.showOptions();
                    break;
                default:
                    bc.enterOption(input);
            }

        }

    }

}