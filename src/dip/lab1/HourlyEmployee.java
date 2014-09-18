package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

     private int hourlyRate;
     private int totalHrsForYear;
     private int annualSalary;
     

    public HourlyEmployee(int hourlyRate, int totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }

    /**
     * @return the hourlyRate
     */
    public int gethourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the totalHrsForYear
     */
    public int gettotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * @param totalHrsForYear the totalHrsForYear to set
     */
    public void setTotalHrsForYear(int totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    /**
     * @return the annualSalary
     */
    public int getannualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setannualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

}
