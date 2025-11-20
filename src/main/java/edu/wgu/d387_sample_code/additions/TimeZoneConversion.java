package edu.wgu.d387_sample_code.additions;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConversion {

    public static ZonedDateTime convert(LocalDateTime localDateTime, ZoneId sourceZoneId, ZoneId targetZoneId) {
        return ZonedDateTime.of(localDateTime, sourceZoneId).withZoneSameInstant(targetZoneId);
    }
}
