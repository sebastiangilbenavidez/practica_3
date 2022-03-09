/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author Sebastian gil
 */
public abstract class VehicleBuilder {
    Vehicle vehicle;

    public VehicleBuilder() {
    }
    
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public abstract void setCore();
}
