package pkg;

import java.math.BigInteger;

public class Decrypt {
    public static long[] Decryption(KeyPair key, BigInteger[] cryptic){

        long[] message = new long[cryptic.length];

        for (int i = 0; i < message.length; i++) {
            message[i]=cryptic[i].modPow(key.d,key.n).longValue();
        }

        /*for (int i = 0; i < message.length; i++) {
            message[i]=Chinese.ChiReminder(key,cryptic[i]);
        }*/

        /*for (int i = 0; i < message.length; i++) {
            message[i]=fastPower.fastPower(cryptic[i],key);
        }*/

        return message;
    }
}
