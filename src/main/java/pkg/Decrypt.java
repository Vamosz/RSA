package pkg;

import java.math.BigInteger;

class Decrypt {
    static String Decryption(KeyPair key, BigInteger[] crypted){

        long[] temp = new long[crypted.length];
        StringBuilder message= new StringBuilder();



        for (int i = 0; i < crypted.length; i++) {
            temp[i]=Chinese.ChiReminder(key,crypted[i]).longValue();
        }
        for (long l : temp) {
            message.append((char) l);
        }


        return message.toString();
    }
}
