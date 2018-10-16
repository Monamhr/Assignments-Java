/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author mona
 */
public class TriangleAnalyzer 
{
    // Instance variables
    private double sideA; // Lengths of the 3 sides of a triangle
    private double sideB;
    private double sideC;   
    
    // Create triangle of lengths sideA, sideB and sideC
    public TriangleAnalyzer(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public String toString()
    {
        return sideA + "," + sideB + "," + sideC;
    }
     
    // Right angle triangle
    public boolean Right()
    {
        if ((sideA * sideA) == ((sideB * sideB) + (sideC * sideC)))
        {
            return true;
        }
        else if ((sideB * sideB) == ((sideA * sideA) + (sideC * sideC)))
        {
            return true;
        }
        else if (((sideC * sideC) == ((sideB * sideB) + (sideA * sideA))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Obtuse Triangle
    public boolean Obtuse()
    {
        if(((sideA + sideB) *(sideA + sideB)) <= (sideC * sideC))
        {
            return true;
        }
        else if(((sideB + sideC) *(sideB + sideC)) <= (sideA * sideA))
        {
            return true;
        }
        if(((sideC + sideA) + (sideC + sideA)) <= (sideB * sideB)) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    // Get the area of a triangle
    public double getArea()
    {
        /**Area using the Heron's formula
         * s = half perimeter
         * area = the squareroot of (s(s -a) (s - b) (s-c))
         * where, a, b and c are the length of the sides
         */
        double halfPerim = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(halfPerim * ( halfPerim - sideA) * (halfPerim - sideB)
                        * (halfPerim - sideC));
        return area;
    }
    // Type of a triangle
    public String triangleType()
    {
        if ((sideA < (sideB + sideC)) || (sideB < (sideA + sideC)) || (sideC < (sideA + sideB)))
        {
            return ("\n\tNot a  triangle");
        }
        else if (sideA == sideB  && sideA == sideC)
        {    
            return ("\n\tEquilateral Triangle");
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC)
        {
            if (Right() == true)
            {
                return ("\n\tAn isosceles Right Angle Triangle");
            }
            else if (Obtuse() == true)
            {
                return ("\n\tAn isosceles Obtuse Triangle");
            }
            else 
            {
                return ("\n\tAn isosceles Acute Triangle");
            }
        }
                 
    }
    
}

