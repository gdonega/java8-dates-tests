package io.github.gdonega;

import java.time.*;
import java.util.Set;

public class App
{
    public static void main(String[] args) {
        // ======================================================================================================================
        //  ███    ██  ██████      ████████ ██ ███    ███ ███████ ███████  ██████  ███    ██ ███████
        //  ████   ██ ██    ██        ██    ██ ████  ████ ██         ███  ██    ██ ████   ██ ██
        //  ██ ██  ██ ██    ██        ██    ██ ██ ████ ██ █████     ███   ██    ██ ██ ██  ██ █████
        //  ██  ██ ██ ██    ██        ██    ██ ██  ██  ██ ██       ███    ██    ██ ██  ██ ██ ██
        //  ██   ████  ██████         ██    ██ ██      ██ ███████ ███████  ██████  ██   ████ ███████
        // ======================================================================================================================

        // Local Date - Format: yyyy-MM-dd
        // Local Date - Format: 2015-02-20
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateRandomDateFromString = LocalDate.parse("2015-02-20");

        // Local Time - Format: hour:minute:secound.nano
        // Local Time - Format: 14:30:47.859
        LocalTime localTimeNow = LocalTime.now();
        LocalTime localTimeRandomDateFromString = LocalTime.parse("14:30:47.859");

        // Local Date Time - Format: yyyy-MM-ddThour:minute:secound.nano
        // Local Date Time - Format: 2015-02-20T14:30:47.859
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeRandomDateFromString = LocalDateTime.parse("2015-02-20T14:30:47.859");


        // ======================================================================================================================
        //  ██     ██ ██ ████████ ██   ██     ████████ ██ ███    ███ ███████ ███████  ██████  ███    ██ ███████
        //  ██     ██ ██    ██    ██   ██        ██    ██ ████  ████ ██         ███  ██    ██ ████   ██ ██
        //  ██  █  ██ ██    ██    ███████        ██    ██ ██ ████ ██ █████     ███   ██    ██ ██ ██  ██ █████
        //  ██ ███ ██ ██    ██    ██   ██        ██    ██ ██  ██  ██ ██       ███    ██    ██ ██  ██ ██ ██
        //   ███ ███  ██    ██    ██   ██        ██    ██ ██      ██ ███████ ███████  ██████  ██   ████ ███████
        // ======================================================================================================================

        // Getting possibles zones
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();



        // ---------------------------------------------------------------------------> OffsetTime
        // Offset Time - With UTC timezone
        OffsetTime offsetTimeUtcNow1 = OffsetTime.now(ZoneOffset.UTC);
        OffsetTime offsetTimeUtcNow2 = OffsetTime.now(ZoneId.of("UTC"));

        // Offset Time - With PC's timezone
        OffsetTime offsetTimePcTimezoneNow = OffsetTime.now();
        // Converet to UTC
        OffsetTime offsetTimePcTimezoneNowInUTC = offsetTimePcTimezoneNow.withOffsetSameInstant(ZoneOffset.UTC);

        // Offset Time - Format: Tminute:secound:milisecond+timezon
        // Zoned Date Time - Format: 12:52:34+09:00
        OffsetTime offsetTimeFromString = OffsetTime.parse("12:52:34+09:00");
        // Convert to UTC
        OffsetTime offsetTimeFromStringInUTC = offsetTimeFromString.withOffsetSameInstant(ZoneOffset.UTC);



        // ---------------------------------------------------------------------------> OffsetDateTime
        // Offset Date Time - With UTC timezone
        OffsetDateTime offsetDateTimeUtcNow1 = OffsetDateTime.now(ZoneOffset.UTC);
        OffsetDateTime offsetDateTimeUtcNow2 = OffsetDateTime.now(ZoneId.of("UTC"));

        // Offset Date Time - With PC's timezone
        OffsetDateTime offsetDateTimePcTimezoneNow = OffsetDateTime.now();
        // Convert to UTC
        OffsetDateTime offsetDateTimePcTimezoneNowInUTC = offsetDateTimePcTimezoneNow.withOffsetSameInstant(ZoneOffset.UTC);



        // ---------------------------------------------------------------------------> ZonedDateTime
        // Zoned DateTime Now - With UTC timezone
        ZonedDateTime zonedDateTimeUtcNow1 = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime zonedDateTimeUtcNow2 = ZonedDateTime.now(ZoneId.of("UTC"));

        // Zoned DateTime Now - With PC's timezone
        ZonedDateTime zonedDateTimePcTimezoneNow = ZonedDateTime.now();
        // Convert to UTC
        ZonedDateTime zonedDateTimePcTimezoneNowInUtc = zonedDateTimePcTimezoneNow.withZoneSameInstant(ZoneOffset.UTC);

        // Zoned Date Time - Format: yyyy-MM-ddThour:minute:secound:milisecond+timezone
        // Zoned Date Time - Format: 2013-02-01T12:52:34+09:00
        ZonedDateTime zonedDateTimeFromString = ZonedDateTime.parse("2013-02-01T12:52:34+09:00");
        // Convert to UTC
        ZonedDateTime zonedDateTimeFromStringInUTC = zonedDateTimeFromString.withZoneSameInstant(ZoneOffset.UTC);


        //----------------------------> IMPORTANT
        //
        //
        // Difference between ZonedDateTime and OffsetDateTime: https://www.baeldung.com/java-zoneddatetime-offsetdatetime#differences
        //
        //
        //----------------------------> IMPORTANT


        // ======================================================================================================================
        //  ███████ ██████   ██████  ███    ███     ███████ ██████   ██████   ██████ ██   ██     ███    ███ ██ ██      ██      ██
        //  ██      ██   ██ ██    ██ ████  ████     ██      ██   ██ ██    ██ ██      ██   ██     ████  ████ ██ ██      ██      ██
        //  █████   ██████  ██    ██ ██ ████ ██     █████   ██████  ██    ██ ██      ███████     ██ ████ ██ ██ ██      ██      ██
        //  ██      ██   ██ ██    ██ ██  ██  ██     ██      ██      ██    ██ ██      ██   ██     ██  ██  ██ ██ ██      ██      ██
        //  ██      ██   ██  ██████  ██      ██     ███████ ██       ██████   ██████ ██   ██     ██      ██ ██ ███████ ███████ ██
        // ======================================================================================================================

        // Get milliseconds in UTC
        long msInUtc = 1675740638774L;

        // Put it on Instant (date in UTC)
        Instant instantInUtc = Instant.ofEpochMilli(msInUtc);

        // Convert it to ZonedDateTime in utc
        ZonedDateTime zonedDateTimeInUtc = ZonedDateTime.ofInstant(instantInUtc, ZoneOffset.UTC);

        System.out.println("Put your break point here :)");
    }
}
