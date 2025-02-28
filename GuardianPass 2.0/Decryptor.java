import java.io.*;

class Decryptor 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Decrypted passwords: ");
        FileInputStream fis = new FileInputStream("Hehe.txt");
            int currentByte;
            int index=0;
            while ((currentByte = fis.read()) != -1) 
            {
                char encryptedChar = (char) currentByte;
                if(encryptedChar == '\n')
                {
                    System.out.println();
                    index = 0;
                    continue;
                }
                char originalChar;
                if(index%2==0)
                {
                    originalChar = (char) (encryptedChar - 1);
                }
                else
                {
                    originalChar = (char) (encryptedChar - 2);
                }
                System.out.print(originalChar);
                index++;
            }
            System.out.println(); 
        fis.close();
    }
}
