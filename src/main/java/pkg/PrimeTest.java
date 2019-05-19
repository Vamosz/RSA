package pkg;

import java.math.BigInteger;

class PrimeTest {

    static boolean millerRabin(BigInteger number) {
        int s = 0;
        BigInteger number_clone = number;
        if (number_clone.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
            return false;
        else {
            number_clone = number_clone.subtract(BigInteger.valueOf(1));
            while (number_clone.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                s++;
                number_clone = number_clone.divide(BigInteger.valueOf(2));
            }

            BigInteger d = number_clone;
            if (FastPower.fastPower(BigInteger.valueOf(2), d, number).equals(BigInteger.valueOf(1)))
                return true;

            BigInteger res = FastPower.fastPower(BigInteger.valueOf(2), d, number);

            for (int i = 0; i < s; i++) {
                BigInteger helper = FastPower.fastPower(res, BigInteger.valueOf(1), number);
                if (helper.equals(number.subtract(BigInteger.valueOf(1))))
                    return true;
                if (helper.pow(2).mod(number).equals(number.subtract(BigInteger.valueOf(1)))) {
                    return true;
                }
            }


        }
        return false;
    }
}


