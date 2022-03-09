/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian gil
 */
public class Utilities {

    public static String inputString(String title) {
        boolean flag = false;
        String date = "";
        do {
            try {
                
                date = JOptionPane.showInputDialog(title);
                flag = false;
                
                return date;
            } catch (NumberFormatException e) {
                flag = true;
                if(date == null){
                    flag = false;
                }
                viewMessage("some value was expected");

            }
        } while (flag);
        return date;
    }
       public static int inputInteger(String title) {
        boolean flag = false;
        do {
            try {
                
                String date = JOptionPane.showInputDialog(title);
                flag = false;
                int number = Integer.parseInt(date);
                return number;
            } catch (NumberFormatException e) {
                flag = true;
                
                viewMessage("invalid number");

            }
        } while (flag);
        return 0;
    }
    public static void viewMessage(String message){
        System.out.println(message);
    }
}
