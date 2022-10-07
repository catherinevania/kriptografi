package caesarCipher;

import java.util.*;

public class encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input plaintext dan shift value
        System.out.println("Masukkan text yang akan dienkripsi : ");
        String plaintext = input.nextLine();
        System.out.println("Masukkan angka untuk menentukan pergeseran huruf : ");
        int shift = input.nextInt();

        String ciphertext = ""; //untuk menampung text yang sudah dienkripsi
        char alphabet;

        for(int i=0; i < plaintext.length();i++) {
            alphabet = plaintext.charAt(i);

            // jika alphabet huruf kecil
            if(alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }

            // jika alphabet huruf besar
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                alphabet = (char) (alphabet + shift);
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println("Encrypted : " + ciphertext);

        plaintext = ciphertext;
        ciphertext = "";
        shift = -shift;
        for(int i=0; i < plaintext.length();i++) {
            // Shift one character at a time
            alphabet = plaintext.charAt(i);

            // jika alphabet huruf kecil
            if(alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            // jika alphabet huruf besar
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                alphabet = (char) (alphabet + shift);
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println("Decrypted :" + ciphertext);
    }
}
