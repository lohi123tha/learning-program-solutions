public class Forecast {

    // Recursive function to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) return presentValue;
        return futureValue(presentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;  // initial investment
        double growthRate = 0.08;     // 8% annual growth
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f%n", years, result);
    }
}
