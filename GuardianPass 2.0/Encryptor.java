import java.io.*;
import java.util.Scanner;

class Encryptor 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to encrypt: ");
        String password = sc.nextLine();

        FileOutputStream fos = new FileOutputStream("Hehe.txt",true);
        for (int i = 0; i < password.length(); i++) 
        {
            char currentChar = password.charAt(i);
            char encryptedChar;
            if(i%2==0)
            {
                encryptedChar = (char) (currentChar + 1);
                fos.write(encryptedChar);
            }
            else
            {
                encryptedChar = (char) (currentChar + 2);
                fos.write(encryptedChar);
            }   
        }
        File f =new File("Hehe.txt");
        if(f.length() != 0)
        {
            fos.write('\n');
        }
        
        System.out.println("Password encrypted and written to file.");
        sc.close();
        fos.close();
    }
}