/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Pathum
 */
public class DegreeController {
    public static void Form(String name, String course) {
new Model.AddRecord().Form(name, course);
JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);    
}
    
}
