/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author Ganso
 */
public class Car extends Vehicle {

    private String type;

    public Car(String MatriculaVehiculo, String marcaVehiculo,
            int anioVehiculo, String type) {
        super(MatriculaVehiculo, marcaVehiculo, anioVehiculo);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

}
