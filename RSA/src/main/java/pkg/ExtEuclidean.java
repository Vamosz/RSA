package pkg;

import java.math.BigInteger;

public class ExtEuclidean {
            BigInteger Y,X;

    public  void EXTEuclidean(BigInteger a, BigInteger b) {
        BigInteger firstrow[] = new BigInteger[40];
        BigInteger secondrow[] = new BigInteger[40];
        BigInteger thirdrow[] = new BigInteger[40];
        BigInteger fourthrow[] = new BigInteger[40];

        firstrow[0] = a;
        firstrow[1] = b;
        secondrow[0] = BigInteger.ZERO;
        secondrow[1] = a.divide(b);
        thirdrow[0] = BigInteger.ONE;
        thirdrow[1] = BigInteger.ZERO;
        fourthrow[0] = BigInteger.ZERO;
        fourthrow[1] = BigInteger.ONE;

        int i = 2;
        while (!firstrow[i - 1].equals(BigInteger.ZERO)) {
            firstrow[i] = firstrow[i - 2].mod(firstrow[i - 1]);
            secondrow[i] = firstrow[i - 2].divide(firstrow[i - 1]);
            thirdrow[i] = (thirdrow[i - 1].multiply(secondrow[i - 1])).add(thirdrow[i - 2]);
            fourthrow[i] = (fourthrow[i - 1].multiply(secondrow[i - 1])).add(fourthrow[i - 2]);
            i++;
        }

        X = (BigInteger.ONE.negate()).pow(i - 1).multiply(fourthrow[i - 2]);
         Y = (BigInteger.ONE.negate()).pow(i - 1).multiply(fourthrow[i - 2]);


    }
}
