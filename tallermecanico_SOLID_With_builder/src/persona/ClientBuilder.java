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
public  class ClientBuilder extends PersonBuilder{

    @Override
    public void setCore() {
        String nameclient = Utilities.inputString("enter the customer's name");
        int DNIClient = Utilities.inputInteger("type the customer's DNI");
        this.person = new Client(nameclient, DNIClient);
                }
    
    
}
