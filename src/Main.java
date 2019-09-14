public class Main {
    public static void main(String[] args) {
        int amountinRegular = 100;
        int amountinHigh = 1000;
        int amountinSpecial = 10_000;

        int percentInRegular = 1;
        int percentInHigh = 5;
        int percentInSpecial = 30;

        int result = (amountinRegular * percentInRegular
                + amountinHigh * percentInHigh +
                amountinSpecial * percentInSpecial) / 100;

        System.out.println(result);
    }
}
