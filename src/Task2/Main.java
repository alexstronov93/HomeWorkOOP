package Task2;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        State[] states = State.values();
        for (State state : states){
            System.out.println(state);
        };

        Iron iron = new Iron(20.0);
        Water water = new Water(20.);
        Oxygen oxygen = new Oxygen(20.0);
        Scanner sc = new Scanner(System.in);
        double t;

        System.out.println("Chose your substance");
        String substance = sc.next();

        switch (substance) {
            case "Water":
                System.out.println("You chose Water, base temperature is:" + water.getTemperature() +
                        " current state is " + states[0]);
                System.out.println("Change temperature");
                t = sc.nextInt();
                water.heatUp(t);
                if (water.getTemperature() < 0) {
                    System.out.println("Now temperature is " + water.getTemperature() + " and state is " +
                            states[1]);
                } else if (water.getTemperature() >= 0 && water.getTemperature() < 100) {
                    System.out.println("Now temperature is " + water.getTemperature() + " and state is " +
                            states[0]);
                } else if (water.getTemperature() > 100) {
                    System.out.println("Now temperature is " + water.getTemperature() + " and state is " +
                            states[2]);

                }


                break;
            case "Iron":
                System.out.println("You chose Iron, base temperature is:" + iron.getTemperature() +
                        " base state is " + states[1]);
                System.out.println("Change temperature");
                t = sc.nextInt();
                iron.heatUp(t);
                if (iron.getTemperature() < 1500) {
                    System.out.println("Now temperature is " + iron.getTemperature() + " and state is " +
                            states[1]);
                } else if (iron.getTemperature() > 1500 && iron.getTemperature() < 2800) {
                    System.out.println("Now temperature is " + iron.getTemperature() + " and state is " +
                            states[0]);
                } else if (iron.getTemperature() > 2800) {
                    System.out.println("Now temperature is " + iron.getTemperature() + " and state is " +
                            states[2]);
                }
                break;

            case "Oxygen":
                System.out.println("You chose Oxygen, base temperature is:" + oxygen.getTemperature() +
                        " base state is " + states[2]);
                System.out.println("Change temperature");
                t = sc.nextInt();
                oxygen.heatUp(t);
                if (oxygen.getTemperature() < -183) {
                    System.out.println("Now temperature is " + oxygen.getTemperature() + " and state is " +
                            states[0]);
                } else if (oxygen.getTemperature() > -183) {
                    System.out.println("Now temperature is " + oxygen.getTemperature() + " and state is " +
                            states[2]);
                }
                break;

            case "0":
                System.out.println("Program over");
                break;
        }
    }

    public enum State {
        LIQUID,
        SOLID_MATTER,
        GAS
    }
}
