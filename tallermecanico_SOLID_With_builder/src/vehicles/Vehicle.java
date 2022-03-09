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
public class Vehicle {

    private String vehiclelicenseplate;
    private String makevehicle;
    private int yearvehicle;

    public Vehicle(String vehiclelicenseplate, String makevehicle, int yearvehicle) {
        this.vehiclelicenseplate = vehiclelicenseplate;
        this.makevehicle = makevehicle;
        this.yearvehicle = yearvehicle;
    }

    public void setMakevehicle(String makevehicle) {
        this.makevehicle = makevehicle;
    }

    public void setVehiclelicenseplate(String vehiclelicenseplate) {
        this.vehiclelicenseplate = vehiclelicenseplate;
    }

    public void setYearvehicle(int yearvehicle) {
        this.yearvehicle = yearvehicle;
    }

    public String getMakevehicle() {
        return makevehicle;
    }

    public String getVehiclelicenseplate() {
        return vehiclelicenseplate;
    }

    public int getYearvehicle() {
        return yearvehicle;
    }


}
