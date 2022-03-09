/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.util.ArrayList;
import utilities.Utilities;

/**
 *
 * @author Sebastian gil
 */
public class CarBuilder extends VehicleBuilder {

    @Override
    public void setCore() {

        String vehiclelicenseplate = Utilities.inputString(
                "vehicle registration number");

        String makevehicle = Utilities.inputString("make of vehicle");

        int yearvehicle = Utilities.inputInteger("year of vehicle");

        String type = Typevehicle.Car.name();
         

        this.vehicle = new Car(vehiclelicenseplate, makevehicle, yearvehicle,
                type);
    }

}
