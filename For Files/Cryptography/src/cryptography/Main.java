package cryptography;

public class Main 
{
    
    public static void main(String[] args) 
    {
        try
        {
            String original = "d:\\pb.mp4";
            String secured= "d:\\secured_pb.mp4";
            String regained= "d:\\again_pb.mp4";
            String textKey = "secure MY data";
            String key = KeyManager.generateKey(textKey);

            Encryptor.encrypt(original, secured, key);
            Decryptor.decrypt(secured, regained, key);
            System.out.println("OK");
        }
        catch(Exception ex)
        {
            System.out.println("Err:"+ ex);
        }
    }
    
}
