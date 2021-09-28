package ex26.Java;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        double n = (-(1.0/30.0) * Math.log(1 + (b/p) * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));
        return n;
    }
}
