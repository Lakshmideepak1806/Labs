package com;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTimeZone14{
	static void zone(String zoneId) {
		ZoneId zone = ZoneId.of(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current Date and Time in " + zoneId + ": " + zonedDateTime.format(formatter));
	}
public static void main(String[] args) {
	zone("America/New_York");
	zone("Europe/London");
	zone("Asia/Tokyo");
	zone("US/Pacific");
	zone("Africa/Cairo");
	zone("Australia/Sydney");
	
}
}
