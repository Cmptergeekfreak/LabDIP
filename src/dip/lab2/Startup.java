package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;


/**
 
 * @cmptergeekfreak
 */
public class Startup {
   public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        TipCalculator firstTip = new FoodServiceTipCalculator(ServiceQuality.GOOD,100.25);
        TipCalculator secondTip = new BaggageServiceTipCalculator(ServiceQuality.FAIR, 4);
        
        TipCalculator[] tips = {firstTip, secondTip};
        
        TipCalculatorService tc = new TipCalculatorService();
        
        for(int i = 0; i < tips.length; i++){
            System.out.println("Tip " + (i+1)+":" + nf.format(tc.getTheTipForService(tips[i])));
        }
    }

}
