package pkg;

import java.math.BigInteger;

public class Euclidean {

    public static BigInteger Euclidean(BigInteger a, BigInteger b){

        BigInteger tabla[]=new BigInteger[40];

        tabla[0]=a;
        tabla[1]=b;

        int i=2;

        while(!tabla[i-1].equals(BigInteger.ZERO))
        {
            tabla[i]=tabla[i-2].mod(tabla[i-1]);
            i++;
        }


        return tabla[i-2];
    }
}
