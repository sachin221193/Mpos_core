package com.vestige.core.enumeration;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
/**
 * Message codes and message  for showing error/success message on UI.
 * 5000 - 5999 message code are related to  http code 500 >= .
 * 4000 - 4999 message code are related to  http code 400 >= AND < 500.
 * 2000 - 2999 message code are related to  http code 200 >= AND < 300.
 */
public enum Message {
    
	//  >=500 http error code
	INTERNAL_SERVER_ERROR(5000, "Something went wrong, please try again!"),
    USER_NOT_FOUND(5001, "User could not be found"), 
    LOGIN_NOT_FOUND(5002, "Current user login not found"),
    
    // >=400 http error code
    UNUTHORIZED_ACCESS(4000, "Unauthorized request"),
    EMAIL_NOT_FOUND(4002, "Email address not registered"),
    MONDATORY_FIELD_MISSING(4003, "mandatory field missing"), 
    INVALID_USER_OR_PASSWORD(4004, "Incorrect username or password"),
    LOGIN_ALREADY_IN_USE(4005, "Login already in use"), 
    NEW_RECORD_CANNOT_HAVE_ID(4006, "A new record cannot already have an ID"),
    RESET_KEY_NOT_FOUND(4007, "No user was found for this reset key"), 
    ICORRECT_PASSWORD(4008, "Incorrect password"),
    PASSWORD_RESET_KEY_DID_NOT_MATCH(4009, "Password reset key verification is unsuccessful"),
    PASSWORD_MATCHED(4010, "Old password and new Password are same"), 
    OTP_MAX_LIMIT_REACHED(4011, "OTP max limit reached"), 
    OTP_NOT_FOUND(4012, "OTP not found"),
    OTP_NOT_MATCHED(4013, "OTP not matched"),
    OTP_EXPIRED(4014, "OTP expired"),
    MOBILE_OTP_VERIFICATION_FAILED(4015,"Mobile Otp Verification Failed"),
    MOBILE_INVALID(4016,"Mobile Number is invalid"),
    WRAPPER_API_PROBLEMS(4017, "getting some problems in wrapper api"),
    DISTRIBUTOR_ID_OR_ADDRESS_ID_PROBLEMS(4018,"Distributor id or Address id does not exist"),
    DISTRIBUTOR_ID_PROBLEMS(4019,"Distributor id not exist"),
    CART_CREATION_NOT_ALLOWED(4020, " Already doing shopping, So can't create cart"),
    ID_DOES_NOT_EXIST(4020,"CategoryId or SubCategoryId does not exist"),
    CATEGORY_ID_DOES_NOT_EXIST(4021,"categoryId Does Not Exist"),
    CATEGORY_ID_MUST_NOT_BE_NULL(4023, "categoryId must not be null"),
    DISTRIBUTO_ADDRESS_UPDATE_PROBLEM(4024,"Error in Updating DistributorAddress"),
    PINCODE_DOES_NOT_EXIST(4025,"Pincode does not exist"),
    WRAPPER_TOKEN_EXPIRE(4026,"Wrapper token expire, please refresh your token"),
    WRAPPER_API_PROBLEM(4027,"Getting some problem in wrapper api"),
    DISTRIBUTOR_NOT_EXIST(4028,"Distributor not exist"),
    PRODUCT_ALLREADY_NOTIFIED(4029,"Product is already Notified."),
    DOWNLINE_NOT_FOUND(4030,"Distributor Downline not found."),
    USER_TOKEN_EXPIRE(4031, "User token expire."),
    HOME_DELIVERY_LOG_GENERATION_FAILED(4032, "Home deivery log generation failed."),
    STORE_PICKUP_LOG_GENERATION_FAILED(4033, "Store pickup log generation failed."),
    SAVE_ORDER_FAILED(4034, "Save order failed."),
    CANCEL_ORDER_FAILED(4035, "Cancel order failed."),
    CART_ID_DOES_NOT_FOUND(4036, "Cart id not found."),
    PROBLEMS_WHILE_FETCHING_VBD_STORES(4037, "getting some problems while fetching VBD stores."),
    ERROR_WHILE_MAPPING_PRODUCTS(4038,"Error while mapping products response."),
    STORES_NOT_FOUND(4039,"Store not found."),
    PINCODE_MISSING(4039,"Pincode Does Not Exists"),
    ZONE_MISSING(4040,"Zone Does Not Exists"),
    CITY_MISSING(4041,"City Does Not Exists"),
    STATE_MISSING(4042,"State Does Not Exists"),
    COUNTRY_MISSING(4043,"Country Does Not Exists"),
    ORDER_PAYMENT_UPDATE_FAILED(4044, "Order Payment Update Failed"),
    ORDER_REPEAT_FAILED(4045, "Repeat Order Failed"),
    ORDER_NUMBER_NOT_VALID(4046, "Order Number Not Valid"),
    TRAINER_NOT_FOUND(4047, "Trainer not exist"),
    PASSWORD_DID_NOT_MATCH(4048, "Password did not match"),
    CART_PRODUCTS_NOT_FOUND(4036, "Cart products not found."),
    DISTRIBUTOR_ADDRESS_DOES_NOT_FOUND(4049, "Distributor addresses not found."),
    DISTRIBUTOR_DOWNLINE_INFO_FAILED(4050, "Fetch distributor downline info failed."),
    DISTRIBUTOR_DOWNLINE_INFO_NOT_FOUND(4051, "Distributor downline info not found."),
    NO_RESULT_FOUND(4052, "No Result Found"),
    NO_ITEMS_AVAILABLE(4053,"No Items Available"),
    ORDER_INVENTORY_SHORT(4053,"Required quantity is not available for product: "),
    SHIPPING_ADDRESS_LIMIT(4054,"Address length more than 100 isn't allowed."),
    FILE_SIZE_CANNOT_BE_MORE_THAN_4MB(4055,"File size cannot be more than 4mb"),
    DISTRIBUTOR_KYC_NOT_DONE(4056, "Kyc has not done"),
    LOGIN_NOT_ALLOWED(4057, "Application is only available for DIAMOND DIRECTOR and above"),

    DISTRIBUTOR_NOT_HAVE_MOBILE_NO(4058, "Distributor does not have mobile number"),
    UPLOAD_FILE_REPORT_MAX_SIZE_EXCEPTION(4059 , "File size is greater that 150MB"),
    UPLOAD_FILE_REPORT_MIN_SIZE_EXCEPTION(4060 , "File size is less that 1MB"),
    SUCCESSFULLY_NOT_UPLOAD(4060, "not uploaded Successfully."),
    DEFAULT_ADDRESS_CANT_DELETED(4061, "Default address cannot be deleted."),
    FEEDBACK_NOT_EXISTS(4062,"Feedback does'nt exists"),
    DISTRIBUTOR_UPLINES_NOT_EXISTS(4063,"Distributor Uplines does not exists."),

    // >=200 http code
    LOGIN_SUCCESS(2000, "Login successful"), 
    DISTIBUTOR_CREATED(2001, "Distributor is created successful"),  
    DISTIBUTOR_UPDATED(2002, "Distributor is updated successful"),
    DISTIBUTOR_GET(2003, "Distributor is/are get successful"),
	AREA_GET(2004, "Area is/are get successful"),
    BANK_GET(2005, "Get Bank Successful"),
	CITY_GET(2006, "Get Cities Successful"),
	COUNTRY_GET(2007, "Get Countries successful"),
	HIERARCHY_LEVEL_GET(2008, "Get Hierarchy level"),
	LOCATIONS_GET(2009, "Get Locations"),
	ZONES_GET(2010,"Get Zones"),
	STATES_GET(2011, "Get State"),
	DOCUMENT_UPLOAD(2012,"Upload Document Successful"),
	DISTRIBUTOR_UPLINE(2013, "Get Distributor upline successfully"),
	DISTRIBUTOR_SAVE(2014, "Distributor save Successfully"),
	DISTRIBUTOR_POINT_DETAILS(2015, "Get Distributor point detail successfully"),
	LOGIN_SUCCESSFUL(2016, "Login Successful"),
	CHECK_DISTRIBUTOR(2017,"Check Ditributor Successful"),
	CHECK_UPLINE_DISTRIBUTOR(2018, "Check Upline Distributor Successful"),
	DISTRIBUTOR_TITLE(2019, "Get Distributor Title Successful"),
	ADDRESS_BY_PINCODE(2020, "Get Address by Pincode Successful"),
	DISTRIBUTOR_DOWNLINE(2021, "Get Distributor Downline"),
	GET_DISTRIBUTOR_UPLINE(2022, "Get Distributor Upline"),
	GET_PRODUCT_CATEGORY(2023, "Get Product Category Successfully"),
	GET_SUB_PRODUCT_CATEGORY(2024, "Get sub Product Category SuccessFully"),
	GET_SUB_PRODUCT_DETAIL_CATEGORY(2025, "Get Sub Product Deatil Category"),
	GET_DISTRIBUTOR_DOWNLINE_SEARCH(2026,"Get distributor Downline Search."),
	GET_DISTRIBUTOR_FUNDS(2027,"Get distributor funds Successfully"),
	GET_DISTRIBUTOR_VOUCHERS(2028,"Get distributor product Vouchers Successfully"),
	HEIRARCHY_LEVEL(2029, "Get All heirarchy Level Successfully"),
	DISTRIBUTOR_POSITION(2030, "Get Distributor Position Successfully"),
	GET_DISTRIBUTOR_CONSISTENCY(2031,"Get Distributor Consistency Successfully"),
	GET_MOBILE_OTP(2032, "Get Mobile Otp Successfully"),
	MOBILE_OTP_VERIFICATION_SUCCESS(2033,"Mobile Otp Verification Successfully"),
	GET_PRODUCTS_LIST(2034,"Get Products List Successfully"),
	GET_PRODUCTS_DETAIL(2035,"Get Products Detail Successfully"),
	FILE_UPLOADED(2036, "File uploaded successfully"),
	CATEGORY_SAVE(2036,"category Save Successfully"),
	GET_CATEGORY(2037, "Get Category Successfully"),
	GET_SOCIAL_FEEDS(2038, "Get Social Feeds Successfully"),
	GET_SOCIAL_DETAILS(2039, "Get Social Details Successfully"),
	CREATE_SOCIAL_DETAILS(2040, "Save Social Details Successfully"),
	UPDATE_SOCIAL_DETAILS(2041, "Update Social Details Successfully"),
	WISHLIST_SAVE(2044, "Wishlist save Successfully"),
	GET_WISHLIST(2043, "Wishlist Get Successfully"),
	UPDATE_DISTRIBUTORS_ADDRESS(2042,"Update distributor Address Successfully"),
	SUCCESSFULLY_UPLOAD(2043, "uploaded Successfully."),
	
	// >=6000 http code use for field validations  
	
	MOBILE_VALIDATION(6000,"Mobile should be 10 digits");

	

	
	private static final Map<Integer, Message> codeToMessageCodes = new HashMap<>();
	static {
		   for (Message messageCode : EnumSet.allOf(Message.class)) {
			   codeToMessageCodes.put(messageCode.getCode(), messageCode);
		}
	}
	private Message(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }
    
    public String getMessage() {
        return message;
    }
    
    public static Message getMessageCode(Integer value) {
		return codeToMessageCodes.get(value);
	}

}
