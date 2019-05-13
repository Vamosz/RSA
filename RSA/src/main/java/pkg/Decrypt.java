package pkg;

import java.math.BigInteger;

public class Decrypt {
    public static String Decryption(KeyPair key, BigInteger[] crypted){

        long[] temp = new long[crypted.length];
        String message="";

        for (int i = 0; i < crypted.length; i++) {
           temp[i]=crypted[i].modPow(key.d,key.n).longValue();
        }

        for (int i = 0; i < temp.length; i++) {
            message+=(char)temp[i];
        }



       /* for (int i = 0; i < crypted.length; i++) {
            temp[i]=Chinese.ChiReminder(key,crypted[i]).longValue();
        }
        for (int i = 0; i < temp.length; i++) {
            message+=(char)temp[i];
        }
 */
        /*for (int i = 0; i < message.length; i++) {
            message[i]=fastPower.fastPower(cryptic[i],key);
        }*/

        return message;
    }
}
