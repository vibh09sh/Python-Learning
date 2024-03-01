import hashlib

# Text for which you want to calculate the SHA-1 digest
text = "Hello, SHA-1!"

# Create a SHA-1 hash object
sha1 = hashlib.sha1()

# Update the hash object with the text
sha1.update(text.encode())

# Calculate the SHA-1 digest
digest = sha1.hexdigest()

print("SHA-1 Digest:", digest)
