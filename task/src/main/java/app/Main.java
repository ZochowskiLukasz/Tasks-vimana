package app;

import entity.Car;
import entity.EngineType;

public class Main {
    public static void main(String[] args) {
        // Lista rzeczy które dodałbym rozwijając "program" ale nie ma ich w poleceniu :) -->
        // TODO 1. Jeśli samochód jedzie (ma prędkość) więcej niż 5km/h - nie można go zgasić
        // TODO 2. Jeśli samochód nie ma "range" to nie można wykonać metody "drive"
        // TODO 3. Dodać maksymalny "range" powyżej którego nie możemy wykonać metody "fuel".
        // TODO 4. Jeśli samochód jedzie lub jest włączony, to nie można wykonać metody "start"
        // TODO 5. Jeśli samochód jest wyłączony, to nie można wykonać metody "putOut".

        Car elec = new Car(2017,"Toyota", EngineType.ELECTRIC);
        elec.start();
        elec.drive(5);
        elec.fuel(200);
    }
}
