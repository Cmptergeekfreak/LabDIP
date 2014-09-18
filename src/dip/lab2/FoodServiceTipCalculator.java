package dip.lab2;

/**
 
 * @author cmptergeekfreak
 * 
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double bill;
    private ServiceQuality serviceQuality;
    

    public FoodServiceTipCalculator(ServiceQuality y, double billAmt) {
        this.setServiceRating(y);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = getServiceQuality().getTipServiceRate()
                        * this.getBill(); 
        
        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
    
    public final double getBill() {
        return bill;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
