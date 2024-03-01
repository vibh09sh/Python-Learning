import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {
    public static void main(String[] args) {
        String text = "Hello, SHA-1!";

        try {
            // Create a MessageDigest instance for SHA-1
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

            // Update the MessageDigest with the text bytes
            sha1.update(text.getBytes());

            // Calculate the SHA-1 digest
            byte[] digest = sha1.digest();

            // Convert the digest to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println("SHA-1 Digest: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
