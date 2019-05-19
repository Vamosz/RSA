package pkg;

import java.math.BigInteger;

class FastPower {

    static BigInteger fastPower(BigInteger base, BigInteger exponent, BigInteger mod) {
        int i = 0;
        BigInteger result = BigInteger.valueOf(1);
        BigInteger[] prime = new BigInteger[500];
        BigInteger[] mods = new BigInteger[500];


        while (exponent.compareTo(BigInteger.valueOf(0)) > 0) {
            prime[i] = exponent.mod(BigInteger.valueOf(2));
            exponent = exponent.divide(BigInteger.valueOf(2));
            i++;
        }

        mods[0]=base;

        for (int j = 1; j < i; j++) {
            mods[j]=mods[j-1].modPow(BigInteger.valueOf(2),mod);
        }

        for (int j = 0; j < i; j++) {
            if(prime[j].equals(BigInteger.valueOf(1)))
                result=result.multiply(prime[j].multiply(mods[j]));
        }

        result=result.mod(mod);

        return result;
    }

}
