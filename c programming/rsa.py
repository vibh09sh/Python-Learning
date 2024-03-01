from cryptography.hazmat.primitives.asymmetric import rsa
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.backends import default_backend

# Generate RSA key pair (public and private keys)
key = rsa.generate_private_key(
    public_exponent=65537, key_size=2048, backend=default_backend()
)

# Export the public key to a PEM format
public_key = key.public_key()
public_pem = public_key.public_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PublicFormat.SubjectPublicKeyInfo,
)

# Export the private key to a PEM format (for demonstration purposes)
private_pem = key.private_bytes(
    encoding=serialization.Encoding.PEM,
    format=serialization.PrivateFormat.TraditionalOpenSSL,
    encryption_algorithm=serialization.NoEncryption(),
)

# Print the public key and private key (for demonstration purposes)
print("Public Key (PEM format):")
print(public_pem.decode())
print("\nPrivate Key (PEM format):")
print(private_pem.decode())

# Text to encrypt
plaintext = b"Hello, RSA!"

# Encrypt using the public key
ciphertext = public_key.encrypt(
    plaintext,
    padding.OAEP(
        mgf=padding.MGF1(algorithm=padding.MGF1.ALGORITHMS.SHA256),
        algorithm=padding.OAEP(algorithm=padding.OAEP.ALGORITHMS.SHA256),
        label=None,
    ),
)

# Decrypt using the private key
decrypted_text = key.decrypt(
    ciphertext,
    padding.OAEP(
        mgf=padding.MGF1(algorithm=padding.MGF1.ALGORITHMS.SHA256),
        algorithm=padding.OAEP(algorithm=padding.OAEP.ALGORITHMS.SHA256),
        label=None,
    ),
)

print("\nOriginal Text:", plaintext.decode())
print("Decrypted Text:", decrypted_text.decode())
