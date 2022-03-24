package bootstrap;

import model.Series;
import util.MySeparator;

public class DataLoader {

    private static final String TXT = "---------------------------------";
    Series series = new Series();
    MySeparator separator = new MySeparator();

    public void load() {
        testSeriesNSum();
        separator.print(TXT);
        testSeriesFactorial();
        separator.print(TXT);
        testSeriesFibonacci();
    }

    public void testSeriesNSum() {
        for (int i = 0; i < 10; i++) {
            System.out.println(series.nSum(i));
        }
    }

    public void testSeriesFactorial() {
        for (int i = 0; i < 10; i++) {
            System.out.println(series.factorial(i));
        }
    }

    public void testSeriesFibonacci() {
        for (int i = 0; i < 10; i++) {
            System.out.println(series.fibonacci(i));
        }
    }
}
