package com.progressoft.wheather.station;

import static com.progressoft.wheather.commons.Splitter.*;

import java.util.List;
import java.util.stream.Collectors;

import static com.progressoft.wheather.commons.FileUtil.readLinesFromFile;

public class StationFileReader {

    public static final String FILE_PATH = "/home/trn179/Desktop/WheatherTask-Documentation/weather-Files/Stations.txt";

    public Station getStationByStationName(String stationName) {
        return readLinesFromFile(FILE_PATH)
                .skip(1)
                .map(line -> getLineAsStation(line))
                .filter(station -> station.getStationName().equals(stationName))
                .findFirst().orElseThrow(RuntimeException::new);
    }

    public List<Station> getStationsByCountryCode(String countryCode) {
        return readLinesFromFile(FILE_PATH)
                .skip(1)
                .map(line -> getLineAsStation(line))
                .filter(station -> station.getCtry().equals(countryCode))
                .collect(Collectors.toList());
    }

    public List<Station> getStationsByIdRange(String minRange, String maxRange) {
        return readLinesFromFile(FILE_PATH)
                .skip(1)
                .map(line -> getLineAsStation(line))
                .filter(station -> station.getUsaf().compareTo(minRange) >= 0
                        && station.getUsaf().compareTo(maxRange) <= 0)
                .collect(Collectors.toList());
    }

    private Station getLineAsStation(String line) {
        return new Station.StationBuilder().setUsaf(get("usaf", line, "station"))
                .setWban(get("wban", line, "station"))
                .setStationName(get("stationName", line, "station"))
                .setCtry(get("ctry", line, "station"))
                .setSt(get("st", line, "station"))
                .setCall(get("call", line, "station"))
                .setLat(get("lat", line, "station"))
                .setLon(get("lon", line, "station"))
                .setElev(get("elev", line, "station"))
                .setBegin(get("begin", line, "station"))
                .setEnd(get("end", line, "station")).build();
    }
}
