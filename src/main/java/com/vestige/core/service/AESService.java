package com.vestige.core.service;

public interface AESService {
   public String decryptData(String cipherText);
   public String encryptData(String text);
   
   public String decryptDBData(String cipherText);
   public String encryptDBData(String text);
   
   public String finalEncryptResult(String cipherText);
   public String finalDecryptResult(String cipherText);
}
