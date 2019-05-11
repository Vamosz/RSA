package pkg;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


        KeyPair keys = new KeyPair();
        keys.PrimePair();
        System.out.println("Az n: "+keys.n+"\nA d: "+keys.d+"\nAz e: "+keys.e);
        String message = "Helo";
        BigInteger[] cryptic=Encrypt.Encryption(keys,message);
        long[] message2= Decrypt.Decryption(keys,cryptic);
        for (int i = 0; i < cryptic.length; i++) {
            System.out.println(cryptic[i]+" ");
        }
        for (int i = 0; i < message2.length; i++) {
            System.out.print(message2[i]+" ");
        }


    }
}