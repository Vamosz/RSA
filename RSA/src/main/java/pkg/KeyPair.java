package pkg;

import java.math.BigInteger;

public class KeyPair {

        BigInteger e,d,n,p,q,phi_n;

        public void PrimePair(){

            p = KeyGeneration();
            q = KeyGeneration();

            n = p.multiply(q);
           phi_n=Euler.Euler(p,q);



            for(BigInteger i = BigInteger.valueOf(2); i.compareTo(phi_n) < 0; i = i.add(BigInteger.ONE)) {
                if(Euclidean.Euclidean(phi_n,i).equals(BigInteger.ONE)) {
                    e = i;
                    break;
                }
            }

            /*BigInteger k =BigInteger.ONE;
            while (!((BigInteger.ONE.add(k.multiply(phi_n)).mod(e)).equals(BigInteger.ZERO)) ){
                d = BigInteger.ONE.add(k.multiply(phi_n)).divide(e);
                //System.out.println(d);
                k=k.add(BigInteger.ONE);
            }*/

            ExtEuclidean eu = new ExtEuclidean();
            eu.EXTEuclidean(phi_n,e);
            if((eu.Y).compareTo(BigInteger.valueOf(0))<0)
                d=phi_n.add(eu.Y);
            else
                d=eu.Y;

        }


    public BigInteger KeyGeneration(){
            int SizeOfBit = 200;
        BigInteger key = new BigInteger(SizeOfBit, new java.util.Random());
        Boolean prime = false;

        while (prime != true) {

            if(key.isProbablePrime(1))
                prime=true;
            else {
                key = new BigInteger(SizeOfBit, new java.util.Random());
            }
        }



        return key;
    }
}
