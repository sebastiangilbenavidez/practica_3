/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.*;
import vehicles.*;

/**
 *
 * @author Ganso
 */
public class Logs {

    private ArrayList<String> damage;
    private Client client;
    private Employee employee;
    private Vehicle vehicle;


    public Logs() {

    }

    public Logs(ArrayList<String> damage, Client client, Employee employee, Vehicle vehicle) {
        this.damage = damage;
        this.client = client;
        this.employee = employee;
        this.vehicle = vehicle;
    }
    

    public Client getClient() {
        return client;
    }

    public ArrayList<String> getDamage() {
        return damage;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public void setDamage(ArrayList<String> damage) {
        this.damage = damage;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
     
    @Override
    public String toString() {
        String information = " client: " + client.getFullName()
                + "\n employee: " + employee.getFullName()
                + " \n vehicle: " + vehicle.getVehiclelicenseplate();
        information += "\n reported damages";
        for (String danio : damage) {
            information += "\n" + danio;
        }
        if (Motorcycle.class.isInstance(vehicle)) {
            information += "\n type of vehicle motorcycle";
        } else {
            information += "\n type of vehicle car";
        }
        return information;
    }

}
