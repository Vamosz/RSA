package pkg;

import java.math.BigInteger;

public class fastPower {

    public static BigInteger fastPower(BigInteger szam, KeyPair key) {
        BigInteger result = BigInteger.ONE;
        BigInteger kitevo = key.d;
        while (kitevo.compareTo(BigInteger.valueOf(0)) > 0) {
            if ((kitevo.and(BigInteger.ONE)).compareTo(BigInteger.valueOf(1)) == 0)
                result = result.multiply(szam);

            szam = szam.multiply(szam).mod(key.n);
            kitevo = kitevo.shiftRight(1).mod(key.n);
        }
        return result;
    }
}
