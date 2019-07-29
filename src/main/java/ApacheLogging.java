import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ApacheLogging {
    static final Logger log =
            LogManager.getLogger(ApacheLogging.class.getName());

    public static void main(String[] args) {
        int age = 60;
        double retirementFund = 10000;
        int yearsInRetirement = 20;
        String name = "David Johnson";
        for (int i=age; i <= 65; i++){
            calculate(retirementFund, 0.1);
        }
        double monthlyPension = retirementFund / yearsInRetirement /12;
        System.out.println(name + " will have $" + monthlyPension +  " per month for retirement.");
        if (monthlyPension < 100) {
            log.fatal("monthly pension is too low.");
        }
    }

    public static void calculate(double fundAmount, double rate){
        log.traceEntry();
        fundAmount = fundAmount * (1 + rate);
        log.info("fund amount = " + fundAmount);
        log.traceExit();
    }
}
