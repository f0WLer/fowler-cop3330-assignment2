package ex26;

public class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(int b, int i, int p)
    {
        return -(1/30) * Math.log(1 + b/p * (1 - (1 + i)^30)) / Math.log(1 + i);
    }
}