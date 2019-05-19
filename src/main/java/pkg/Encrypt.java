package pkg;

import java.math.BigInteger;

class Encrypt {
    static BigInteger[] Encryption(KeyPair key, String message){

       BigInteger[] cryptic=new BigInteger[message.length()];
       long[] buffer  = new long[message.length()];

        for (int i = 0; i < buffer.length; i++) {
            buffer[i]= (long) message.charAt(i);
        }

        System.out.println();

        for (int i = 0; i < buffer.length; i++) {
            cryptic[i]=FastPower.fastPower(BigInteger.valueOf(buffer[i]),key.e,key.n);
            System.out.print(cryptic[i]);
        }

        return cryptic;
    }
}
