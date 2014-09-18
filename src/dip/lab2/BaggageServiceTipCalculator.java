package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private double CONVERT_TO_PERCENT= 1.00;
    private double BASE_TIP= 1.00;
    private String BASE_TIP_STRING = " base tip";
    private String BAG_COUNT_STRING = " bag count";
    private int baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;

    
    public BaggageServiceTipCalculator(ServiceQuality q, double bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);
        this.setBaseTipPerBag(BASE_TIP);
    }

    @Override
     public double getTip() {
        double tip = (baseTipPerBag * getBagCount())
                    * ((getServiceQuality().getTipServiceRate()+CONVERT_TO_PERCENT)
                    * getBagCount()); 
        
        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getBagCount() {
        return bagCount;
    }

    public final void setBagCount(double bagCount) {
        this.bagCount = (int) validateEntry(bagCount, BAG_COUNT_STRING);
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = (int) validateEntry(baseTipPerBag, BASE_TIP_STRING);
    }
    
    private double validateEntry(double e, String type){
        if(e < 0) {
            throw new IllegalArgumentException(
                    "error: " + type + " must be greater than or equal to zero");
        }
        return e;
    }

}
