package com.vestige.core.utils;

import java.security.MessageDigest;
import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class Crypto {
	
	private Crypto() {}
	private static SecretKeySpec generateSecretKey(String password) throws Exception {
        MessageDigest shahash = MessageDigest.getInstance("SHA-1");
        byte[] key = shahash.digest(password.getBytes());
        key = Arrays.copyOf(key,  16);
        return new SecretKeySpec(key, "AES");
    }

    public static String encrypt(String text,String password) throws Exception {
    	SecretKeySpec secretkey = generateSecretKey(password);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);
        return Base64.encodeBase64String(cipher.doFinal(text.getBytes()));
    }

    public static String decrypt(String encryptedtext, String password) throws Exception {
    	SecretKeySpec secretkey = generateSecretKey(password);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        return new String(cipher.doFinal(Base64.decodeBase64(encryptedtext)),"UTF-8");
    }
   
}
