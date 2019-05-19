package pkg;

import java.math.BigInteger;
import java.security.Key;

class Chinese {
    static BigInteger ChiReminder(KeyPair key, BigInteger C) {

        //1. step
        BigInteger c1, c2;
        c1 = FastPower.fastPower(C,key.d.mod(key.p.subtract(BigInteger.ONE)), key.p);
        c2 = FastPower.fastPower(C,key.d.mod(key.q.subtract(BigInteger.ONE)), key.q);
        //2. step
        BigInteger M = key.p.multiply(key.q);
        BigInteger m1, m2;
        m1 = key.p;
        m2 = key.q;
        //3.step
        BigInteger M1 = M.divide(m1);
        BigInteger M2 = M.divide(m2);
        //4.step
        ExtEuclidean Eu = new ExtEuclidean();
        if (m1.compareTo(m2) > 0)
            Eu.EXTEuclidean(m1, m2);
        else
            Eu.EXTEuclidean(m2, m1);

        BigInteger y1, y2;

        if (((Eu.X).multiply(M1)).mod(m1).equals(BigInteger.valueOf(1))) {
            y1=Eu.X;
            y2 = Eu.Y;
        } else{
            y1=Eu.Y;
            y2 = Eu.X;
        }


        return (((c1.multiply(y1).multiply(M1)).add(c2.multiply(y2).multiply(M2))).mod(M));
    }


}
