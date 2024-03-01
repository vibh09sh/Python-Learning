from Crypto.Cipher import Blowfish
from Crypto.Random import get_random_bytes
import base64


def blowfish_encrypt(key, plaintext):
    cipher = Blowfish.new(key, Blowfish.MODE_ECB)
    plaintext_bytes = plaintext.encode()
    padded_plaintext = plaintext_bytes + (8 - len(plaintext_bytes) % 8) * b"\x00"
    ciphertext = cipher.encrypt(padded_plaintext)
    return base64.b64encode(ciphertext)


def blowfish_decrypt(key, ciphertext):
    cipher = Blowfish.new(key, Blowfish.MODE_ECB)
    ciphertext_bytes = base64.b64decode(ciphertext)
    plaintext_bytes = cipher.decrypt(ciphertext_bytes)
    return plaintext_bytes.rstrip(b"\x00").decode()


key = b"secret_key_12345"
plaintext = "Hello, Vibha Good Morning! How are you!"

ciphertext = blowfish_encrypt(key, plaintext)
print("Ciphertext:", ciphertext)

decrypted_text = blowfish_decrypt(key, ciphertext)
print("Decrypted Text:", decrypted_text)
