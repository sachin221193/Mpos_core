
package com.vestige.core.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DateUtil {

	
	private DateUtil() {
	}

	public static Instant formatDate(String date) {
		if (StringsUtil.isNullOrEmpty(date))
			return null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		return LocalDateTime.parse(date, formatter).atZone(ZoneId.systemDefault()).toInstant();
	}

	public static String getMMYYYY(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
		return dateFormat.format(date);
	}

	public static String formatDob(Instant instant) {
		if (!Objects.isNull(instant)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				return URLEncoder.encode((LocalDateTime.ofInstant(instant, ZoneOffset.UTC).format(formatter)),
						java.nio.charset.StandardCharsets.UTF_8.toString());
			} catch (UnsupportedEncodingException e) {
			}
		}
		return "";
	}

	/**
	 * @description Convert month and year in defined format
	 * @return converted month and year
	 */
	public static StringBuilder customizedMonthYear(int month, String year) {
		StringBuilder customized = new StringBuilder();
		if (!StringUtils.isEmpty(month) && !StringUtils.isEmpty(year)) {
			switch (month) {
			case 1:
				customized.append("Jan,");
				break;
			case 2:
				customized.append("Feb,");
				break;
			case 3:
				customized.append("Mar,");
				break;
			case 4:
				customized.append("Apr,");
				break;
			case 5:
				customized.append("May,");
				break;
			case 6:
				customized.append("Jun,");
				break;
			case 7:
				customized.append("Jul,");
				break;
			case 8:
				customized.append("Aug,");
				break;
			case 9:
				customized.append("Sep,");
				break;
			case 10:
				customized.append("Oct,");
				break;
			case 11:
				customized.append("Nov,");
				break;
			case 12:
				customized.append("Dec,");
				break;
			default:
				break;
			}
			customized.append(year.substring(year.length() - 2));
		}
		return customized;
	}

	public static Instant getStringToInstant(String date, String format) {
		if (StringsUtil.isNullOrEmpty(date))
			return null;
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(format))
				.atStartOfDay(ZoneId.of(ZoneOffset.UTC.getId())).toInstant();
	}

	public static String getTodayformattedDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC).format(formatter).toString();
	}

	/*
	 * convert Object time to Instant
	 */
	@SuppressWarnings("unchecked")
	public static Instant getEpochToInstant(Object seconds) {
		ObjectMapper oMapper = new ObjectMapper();
		Map<String, Object> map = oMapper.convertValue(seconds, Map.class);
		return Instant.ofEpochSecond(Long.parseLong(String.valueOf(map.get("epochSecond"))));
	}

	public static String[] getDateTimeFromInstant() {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		Date date = new Date();
		sd.setTimeZone(TimeZone.getTimeZone("IST"));
		return sd.format(date).split(" ");
	}

	public static String getDateTime(Instant instant) {
		if (!Objects.isNull(instant)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
			return LocalDateTime.ofInstant(instant, ZoneOffset.systemDefault()).format(formatter);
		}
		return null;
	}
	
	public static Instant getDateTimeFromString(String date) {
		if (StringsUtil.isNullOrEmpty(date))
			return null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.parse(date, formatter).atZone(ZoneId.systemDefault()).toInstant();
	}

	
	public static String genericDateFormat(Instant instant,String format) {
		if (!Objects.isNull(instant)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			try {
				return URLEncoder.encode((LocalDateTime.ofInstant(instant, ZoneOffset.UTC).format(formatter)),
						java.nio.charset.StandardCharsets.UTF_8.toString());
			} catch (UnsupportedEncodingException e) {
			}
		}
		return null;
	}

	public static String convertDateTimeFromInstant(Instant instant) {
		if (!Objects.isNull(instant)) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
			return LocalDateTime.ofInstant(instant, ZoneOffset.systemDefault()).format(formatter);
		}
		return null;
	}	
	
	public static Instant formatDateForFilter(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Instant createdOn = null;
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(formatter.parse(date));
			c.add(Calendar.DAY_OF_MONTH, 1);
			createdOn = c.getTime().toInstant().truncatedTo(ChronoUnit.DAYS );
		} catch (ParseException e) {
		}
		return createdOn;
	}
}
