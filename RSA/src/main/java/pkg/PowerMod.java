package pkg;

public class PowerMod {

    private static int printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            return number;
        }

        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
        return 0;
    }
}
