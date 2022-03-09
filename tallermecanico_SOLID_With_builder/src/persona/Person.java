/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Sebastian gil
 */
public class Person {

    private String FullName;
    private int DNI;

    public Person(String name, int DNI) {
        this.FullName = name;
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public String getFullName() {
        return FullName;
    }

}
