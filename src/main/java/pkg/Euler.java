package pkg;

import java.math.BigInteger;

class Euler {

    static BigInteger Euler(java.math.BigInteger p, java.math.BigInteger q){

        return p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
    }
}
