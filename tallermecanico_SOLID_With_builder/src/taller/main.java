/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Queue;
import persona.*;
import utilities.Utilities;
import registros.Logs;
import vehicles.*;

/**
 *
 * @author Ganso
 */
public class main {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Queue registeredqueues = new Queue();
        int numbermenu = 0;
        while (numbermenu != 3) {
            numbermenu = Utilities.inputInteger(
                    "\n 1. new log"
                    + "\n 2. show logs"
                    + "\n 3. close"
            );
            switch (numbermenu) {
                case 1:
                    registeredqueues.addInLine(makeregister());
                    break;
                case 2:
                    registeredqueues.showAll();
                    break;
                case 3:
                    JOptionPane.showConfirmDialog(null, "everything went well");
                    numbermenu = 3;
                    break;

            }
        }

    }

    public static Logs makeregister() {

        PersonBuilder client = new ClientBuilder();
        client.setCore();

        PersonBuilder employee = new EmployeeBuilder();
        employee.setCore();

        String message = "want to add a damage? \n 1. add \n 2 to continue";
        int numberwhile = Utilities.inputInteger(message);
        ArrayList<String> damage = new ArrayList<String>(1
        );
        while (numberwhile == 1) {
            damage.add(Utilities.inputString("describe the damage"));

            numberwhile = Utilities.inputInteger(message);
        }
        String mensaje = "type vehicle \n 1. motorcycle \n 2. car";
        VehicleBuilder vehicle;
        if (Utilities.inputInteger(mensaje) == 1) {
            vehicle = new MotorcycleBuilder();
        } else {
            vehicle = new CarBuilder();
        }
        vehicle.setCore();
        Logs newlog = new Logs(damage, (Client) client.getPerson(), (Employee) employee.getPerson(), (Vehicle) vehicle.getVehicle());
        return newlog;

    }

}
