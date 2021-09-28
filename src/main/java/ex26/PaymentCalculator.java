package ex26;

public class PaymentCalculator
{
    public static int calculateMonthsUntilPaidOff(int b, int apr, int p)
    {
        double i = (double) apr / 365.0;
        double calc = (-1.0/30.0) * Math.log(1.0 + (double) b/p * (1.0 - Math.pow(1.0 + i, 30)) / Math.log(1.0 + i));
        System.out.println(calc);
        return (int) calc;
    }
}