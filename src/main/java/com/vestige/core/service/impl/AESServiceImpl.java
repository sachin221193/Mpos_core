package com.vestige.core.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vestige.core.service.AESService;
import com.vestige.core.utils.AES256Cryptor;
import com.vestige.core.utils.Crypto;

@Service
public class AESServiceImpl implements AESService {

	private final Logger log = LoggerFactory.getLogger(AESServiceImpl.class);
	
	@Value("${application.aes.key}")
	private String secret;

	@Value("${application.aes.db.key}")
	private String dbsecret;

	@Override
	public String decryptData(String cipherText) {
		try {
			String decryptedText = AES256Cryptor.decrypt(cipherText, secret);
			decryptedText = decryptedText.substring(1, decryptedText.length() - 1);
			return decryptedText;
		} catch (Exception e) {
			log.error("error while decrypting data {}", e.getMessage());
		}
		return null;
	}

	@Override
	public String encryptData(String cipherText) {
		try {
			String encryptedText = AES256Cryptor.encrypt(cipherText, secret);
			return encryptedText;
		} catch (Exception e) {
			log.error("error while encrypting Data {}", e.getMessage());
		}
		return null;
	}

	@Override
	public String decryptDBData(String cipherText) {
		try {
			return Crypto.decrypt(cipherText, dbsecret);
		} catch (Exception e) {
			log.error("error while decrypting DB data {}", e.getMessage());
		}
		return null;
	}

	@Override
	public String encryptDBData(String text) {
		try {
			return Crypto.encrypt(text, dbsecret);
		} catch (Exception e) {
			log.error("error while encrypting DB data {}", e.getMessage());
		}
		return null;
	}

	@Override
	public String finalEncryptResult(String cipherText) {
		return encryptDBData(decryptData(cipherText));
	}

	@Override
	public String finalDecryptResult(String cipherText) {
		return encryptData(decryptDBData(cipherText));
	}
}
