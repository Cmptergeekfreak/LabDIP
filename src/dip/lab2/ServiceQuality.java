/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author Joe
 */
public enum ServiceQuality {
    
    GOOD(0.30), 
    FAIR(0.10), 
    POOR(0.00);
        
    private  double tipServiceRate;
        
    ServiceQuality(double t){
       tipServiceRate = t;
        }
        
     public double getTipServiceRate(){
        return tipServiceRate;
        }
 };
    

