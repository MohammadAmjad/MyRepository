package com.progressoft.wheather.gsod;

import com.progressoft.wheather.station.Station;
import com.progressoft.wheather.station.StationFileReader;

import static com.progressoft.wheather.commons.Splitter.*;

import static com.progressoft.wheather.commons.FileUtil.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GsodFileReader {

    public static final String FILE_PATH = "/home/trn179/Desktop/WheatherTask-Documentation/weather-Files/";

    public List<String> getFilesDateByGivenDirectory(String directory) {
        return readListOfFiles(directory)
                .filter(file -> file.toString().endsWith(".gsod"))
                .map(file -> file.getFileName().toString().substring(0, file.getFileName().toString().indexOf(".gsod")))
                .collect(Collectors.toList());
    }


    public Gsod getGsodByStationIdAndDate(String stationId, String date) {
        return readLinesFromFile(FILE_PATH + date + ".gsod")
                .map(line -> getLineAsGsod(line))
                .filter(obj -> obj.getStn().equals(stationId))
                .findFirst().orElseThrow(RuntimeException::new);
    }

    public List<Gsod> getListOfGsodByCountryCodeAndDate(String countryCode, String date) {
        List<String> stationsId = new StationFileReader().getStationsByCountryCode(countryCode)
                .stream().map(Station::getUsaf).collect(Collectors.toList());
        return readLinesFromFile(FILE_PATH + date + ".gsod")
                .map(line -> getLineAsGsod(line))
                .filter(obj -> stationsId.contains(obj.getStn()))
                .collect(Collectors.toList());
    }

    public Gsod getListOfGsodByStationNameAndDate(String stationName, String date) {
        Station station = new StationFileReader().getStationByStationName(stationName);
        return readLinesFromFile(FILE_PATH + date + ".gsod")
                .map(line -> getLineAsGsod(line))
                .filter(obj -> station.getUsaf().equals(obj.getStn()))
                .findAny().get();
    }

    private Gsod getLineAsGsod(String line) {
        return new Gsod.GsodBuilder()
                .setStn(get("stn", line, "gsod"))
                .setWban(get("wban", line, "gsod"))
                .setYearModa(get("yearModa", line, "gsod"))
                .setTemp(get("temp", line, "gsod"))
                .setDewp(get("dewp", line, "gsod"))
                .setSlp(get("slp", line, "gsod"))
                .setStp(get("stp", line, "gsod"))
                .setVisib(get("visib", line, "gsod"))
                .setWdsp(get("wdsp", line, "gsod"))
                .setMxspd(get("mxspd", line, "gsod"))
                .setGust(get("gust", line, "gsod"))
                .setMax(get("max", line, "gsod"))
                .setMin(get("min", line, "gsod"))
                .setPrcp(get("prcp", line, "gsod"))
                .setSndp(get("sndp", line, "gsod"))
                .setFrshtt(get("frshtt", line, "gsod"))
                .build();
    }
}
