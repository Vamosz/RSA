package pkg;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        KeyPair keys = new KeyPair();
        keys.PrimePair();
        System.out.println("Az n: "+keys.n+"\nA d: "+keys.d+"\nAz e: "+keys.e);

        System.out.print("Add meg a titkosítandó üzenetet: ");
        String message=sc.nextLine();

        System.out.println();

        BigInteger[] cryptic=Encrypt.Encryption(keys,message);
        String message2= Decrypt.Decryption(keys,cryptic);
        //char[] messages= new char[message2.length];

        for (int i = 0; i < cryptic.length; i++) {
            System.out.print(cryptic[i]);
        }


        System.out.println();

        System.out.println(message2);

        /*for (int i = 0; i < message2.length; i++) {
            messages[i]=(char) message2[i];
            System.out.print(messages[i]);
        }*/


    }
}