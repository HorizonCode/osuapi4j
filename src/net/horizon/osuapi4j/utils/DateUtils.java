package net.horizon.osuapi4j.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

	public static Date parseDateFromString(String input) {
		String target = input;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss", Locale.ENGLISH);
		Date result = null;
		try {
			result = df.parse(target);
		} catch (ParseException e) {
		}
		return result;
	}

}
