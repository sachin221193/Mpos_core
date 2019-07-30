package com.vestige.core.enumeration;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum DocTypes {
	AADHAR_CARD(1, "Aadhar Card"), VOTER_IDENTITY_CARD(2, "Voter’s Identity Card"),
	DRIVING_LICENCE(3, "Driving Licence"), RATION_CARD(4, "Ration Card"), PASSPORT(5, "Passport"), OTHERS(6, "Others");
	private DocTypes(Integer docId, String docType) {
		this.docId = docId;
		this.docType = docType;
	}

	private Integer docId;
	private String docType;

	public Integer getDocId() {
		return docId;
	}

	public String getDocType() {
		return docType;
	}

	private static final Map<Integer, DocTypes> codeToDocTypeCodes = new HashMap<>();
	static {
		for (DocTypes docType : EnumSet.allOf(DocTypes.class)) {
			codeToDocTypeCodes.put(docType.getDocId(), docType);
		}
	}

	public static DocTypes getMessageCode(Integer docId) {
		return codeToDocTypeCodes.get(docId);
	}
}