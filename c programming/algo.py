from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
from Crypto.Protocol.KDF import PBKDF2
from Crypto.Cipher import AES
import base64

# AES encryption function
def aes_encrypt(key, plaintext):
    cipher = AES.new(key, AES.MODE_EAX)
    ciphertext, tag = cipher.encrypt_and_digest(plaintext.encode())
    return base64.b64encode(cipher.nonce + ciphertext + tag)

# AES decryption function
def aes_decrypt(key, ciphertext):
    data = base64.b64decode(ciphertext)
    nonce = data[:16]
    ciphertext = data[16:-16]
    tag = data[-16:]

    cipher = AES.new(key, AES.MODE_EAX, nonce=nonce)
    plaintext = cipher.decrypt_and_verify(ciphertext, tag)
    return plaintext.decode()

# Example usage
password = "your_password"
salt = get_random_bytes(16)
key = PBKDF2(password, salt, dkLen=32, count=1000000)  # Key derivation with PBKDF2

plaintext = "Hello, Rijndael AES!"
ciphertext = aes_encrypt(key, plaintext)
print("Ciphertext:", ciphertext)

decrypted_text = aes_decrypt(key, ciphertext)
print("Decrypted Text:", decrypted_text)
