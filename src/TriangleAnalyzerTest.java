
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mona
 */
public class TriangleAnalyzerTest 
{
    public static void main(String args[])
    {
        // Get input from the user
        String input = JOptionPane.showInputDialog(
                "Enter side one for sideA");

        double sideA  = Double.parseDouble(input);   // take input as double
        
        input = JOptionPane.showInputDialog(
                    "Enter side two for sideB");
        double sideB = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(
                "Enter side three for sideC");
        double sideC = Double.parseDouble(input);
        
        //Create Triangle Analyzer object
        TriangleAnalyzer triangle = new TriangleAnalyzer(sideA, sideB, sideC);
        System.out.println("A triangle with sides of " + triangle.toString() 
                        + "\nThe triangle is of type " + triangle.triangleType()
                        + "\nArea of the triangle is " + 
                        + String.format("%7.2f", triangle.getArea());
        
        
    }
    
}
