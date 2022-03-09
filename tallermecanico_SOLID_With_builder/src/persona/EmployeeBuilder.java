/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import utilities.Utilities;

/**
 *
 * @author Sebastian gil
 */
public class EmployeeBuilder extends PersonBuilder{

    @Override
    public void setCore() {
       String nameemployee = Utilities.inputString("enter employee name");

        int DNIemployee = Utilities.inputInteger("type the customer's DNI");

        this.person = new Employee(nameemployee, DNIemployee);
    }
    
}
