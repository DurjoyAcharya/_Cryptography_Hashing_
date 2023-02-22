**Ref:**
https://dev.java/learn/security/intro/
https://docs.oracle.com/en/java/javase/19/security/java-cryptography-architecture-jca-reference-guide.html#GUID-3E0744CE-6AC7-4A6D-A1F6-6C01199E6920

**Available Cryptography Standards in the JDK**

```Java cryptography is based on standards that are well-defined international standards that allow various platforms to operate. Among those standards are:```

```TLS (Transport Layer Security) v1.2, v1.3 – RFC 5246, RFC 8446```
```RSA Cryptography Specifications PKCS #1 – RFC 8017```

```Cryptographic Token Interface Standard (PKCS#11)
The ECDSA signature algorithms as defined in ANSI X9.62, etc.
The security landscape evolves continuously, for example stronger algorithms are introduced while older ones are deemed less secure. The Oracle JDK is updated regularly to cope with those changes and keep the Java platform secure. The Oracle JDK Cryptographic Roadmap reflects the latest and upcoming changes applied to the security providers shipped by Oracle in the Oracle JDK```.

The Java Cryptography Architecture (JCA) is the framework for working with cryptography using the Java programming language and is part of the Java Security API.
Its goals are to offer cryptography algorithm independence and extensibility, interoperability,and an implementation agnostic from security providers.

The JCA encompasses engine classes that interact with a specific type of cryptographic service via:

cryptographic operations like encryption, digital signatures, message digests, etc.
keys and algorithm parameters
keystores or certificates that encapsulate the cryptographic data and can be used at higher layers of abstraction.