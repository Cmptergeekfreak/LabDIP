package dip.lab1;

import javax.swing.JOptionPane;

/**

 * @cmptergeekfreak
 */
public class HRService {
   
    private Employee employee;
    
    public HRService (Employee e){
        employee = e;
    }

    HRService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }

    
    
 }

