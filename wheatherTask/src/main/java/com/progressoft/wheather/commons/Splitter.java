package com.progressoft.wheather.commons;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Splitter {

    private static final Map<String, Function<String, String>> STATION_COLUMN = new HashMap<>();
    private static final Map<String, Function<String, String>> GSOD_COLUMN = new HashMap<>();

    static {
        preparedStationColumnHeader();
        preparedGsodColumnHeader();
    }

    private static void preparedGsodColumnHeader() {
        GSOD_COLUMN.put("stn", str -> str.substring(0, 7));
        GSOD_COLUMN.put("wban", str -> str.substring(7, 14));
        GSOD_COLUMN.put("yearModa", str -> str.substring(14, 26));
        GSOD_COLUMN.put("temp", str -> str.substring(26, 37));
        GSOD_COLUMN.put("dewp", str -> str.substring(37, 46));
        GSOD_COLUMN.put("slp", str -> str.substring(46, 57));
        GSOD_COLUMN.put("stp", str -> str.substring(57, 68));
        GSOD_COLUMN.put("visib", str -> str.substring(68, 79));
        GSOD_COLUMN.put("wdsp", str -> str.substring(79, 89));
        GSOD_COLUMN.put("mxspd", str -> str.substring(89, 95));
        GSOD_COLUMN.put("gust", str -> str.substring(95, 103));
        GSOD_COLUMN.put("max", str -> str.substring(103, 112));
        GSOD_COLUMN.put("min", str -> str.substring(112, 118));
        GSOD_COLUMN.put("prcp", str -> str.substring(118, 125));
        GSOD_COLUMN.put("sndp", str -> str.substring(125, 132));
        GSOD_COLUMN.put("frshtt", str -> str.substring(132, 138));
    }

    private static void preparedStationColumnHeader() {
        STATION_COLUMN.put("usaf", str -> str.substring(0, 7));
        STATION_COLUMN.put("wban", str -> str.substring(7, 13));
        STATION_COLUMN.put("stationName", str -> str.substring(13, 43));
        STATION_COLUMN.put("ctry", str -> str.substring(43, 48));
        STATION_COLUMN.put("st", str -> str.substring(48, 51));
        STATION_COLUMN.put("call", str -> str.substring(51, 57));
        STATION_COLUMN.put("lat", str -> str.substring(57, 65));
        STATION_COLUMN.put("lon", str -> str.substring(65, 74));
        STATION_COLUMN.put("elev", str -> str.substring(74, 82));
        STATION_COLUMN.put("begin", str -> str.substring(82, 91));
        STATION_COLUMN.put("end", str -> str.substring(91, 99));
    }

    public static String get(String columnName, String line, String fileExt) {
        if (fileExt.equals("station"))
            return STATION_COLUMN.get(columnName).apply(line).trim();
        else
            return GSOD_COLUMN.get(columnName).apply(line).trim();
    }
}
