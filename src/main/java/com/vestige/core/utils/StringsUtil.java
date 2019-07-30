package com.vestige.core.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Class having basic utility methods for processing on strings.
 * 
 * @author sohan.maurya
 *
 */
public class StringsUtil {
    
	private StringsUtil() {}
	
    /**
     * Check whether two strings are equal. </br>
     * Strings equality check are case insensitive. </br>
     * Returns false if any one of the provided strings is null.
     * 
     * @param str1 a String
     * @param str2 a String
     * @return true if equal else false
     */
    public static boolean isEqualIgnoreCase(String str1, String str2) {
        if (Objects.isNull(str1) || Objects.isNull(str2)) {
            return false;
        }
        return str1.trim().equalsIgnoreCase(str2.trim());
    }
    
    /**
     * Check whether a strings is null OR empty. </br>
     * A string containing spaces only will get consider as empty.
     * 
     * @param str a String
     * @return true if null OR empty, else false
     */
    public static boolean isNullOrEmpty(String str) {
        return (str == null) || str.trim().equals("") || str.trim().equals("null");
    }
    
    /**
     * Unique Keys Generation Using Message Digest and Type 4 UUID </br>
     * 
     * Need to return String from this method instead of byte[]. </br>
     * Use DigestUtils.md5Hex() of Commons library (once we have its dependency in core).
     * 
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static byte[] generateUniqueKey() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest salt = MessageDigest.getInstance("SHA-256");
        salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
        return salt.digest();
    }
    
    /**
     * Convert a String of ids ex. [1,2] to a List<Long><br/>
     * (Used for jpa search specifications)
     * 
     * @param idsAsString String
     * @return List<Long>
     */
    public static List<Long> getIdsFromString(String idsAsString) {
        String[] ids = idsAsString.replace("[", "").replace("]", "").split(",");
        List<Long> idToSearch = new ArrayList<>();
        for (String id : ids)
            idToSearch.add(Long.parseLong(id.trim()));

        return idToSearch;
    }
    
	public static byte[] removeUTF8Bom(String responseString) {
		return responseString.replaceAll("^\uFEFF", "").getBytes(StandardCharsets.UTF_8);
	}

	
	public static List<String> getIdsFromStringToString(String idsAsString) {
        String[] ids = idsAsString.replace("[", "").replace("]", "").split(",");
        List<String> idToSearch = new ArrayList<>();
        for (String id : ids)
            idToSearch.add(id.trim());

        return idToSearch;
    }
}
