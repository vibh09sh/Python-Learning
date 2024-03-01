import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public
class DESExample
{
public
    static void main(String[] args)
    {
        try
        {
            // Example key and plaintext
            String key = "133457799BBCDFF1";
            String plaintext = "0123456789ABCDEF";

            // Convert the key and plaintext to byte arrays
            byte[] keyBytes = hexStringToByteArray(key);
            byte[] plaintextBytes = hexStringToByteArray(plaintext);

            // Create a DES key from the key bytes
            DESKeySpec desKeySpec = new DESKeySpec(keyBytes);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

            // Create a DES cipher instance
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");

            // Initialize the cipher with the encryption mode and the secret key
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            // Encrypt the plaintext
            byte[] ciphertext = cipher.doFinal(plaintextBytes);

            // Print the ciphertext in hexadecimal format
            System.out.println("Ciphertext: " + byteArrayToHexString(ciphertext));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // Helper method to convert a hexadecimal string to a byte array
public
    static byte[] hexStringToByteArray(String hex)
    {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2)
        {
            data[i / 2] = (byte)((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    // Helper method to convert a byte array to a hexadecimal string
public
    static String byteArrayToHexString(byte[] bytes)
    {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes)
        {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}
