/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdc2;

import java.util.Scanner;

/**
 *
 * @author Manahil Khalid
 */
public class ApplyMCDC {
    public double LargestNumber(double n1, double n2, double n3, double n4){
        double returnNumber=0.0;
        if( n1 >= n2 && n1 >= n3 && n1 >= n4)
        {
            returnNumber=n1;
        }
        else if (n2 >= n1 && n2 >= n3 && n2 >= n4)
        {
            returnNumber=n2;
        }
        else if (n3 >= n1 && n3 >= n2 && n3 >= n4)
        {
            returnNumber=n3;
        } 
        else
        {
            returnNumber=n4;
        }
        return returnNumber;
    }
}
