package com.progressoft.wheather.stations;

import com.progressoft.wheather.station.Station;
import com.progressoft.wheather.station.StationFileReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StationFileReaderTest {

    StationFileReader stationFileReader;

    @Before
    public void setUp() {
        stationFileReader = new StationFileReader();
    }

    @Test
    public void givenStationNameThenShouldReturnStationObject() {
        Assert.assertTrue(stationFileReader.getStationByStationName("CWOS 07011") != null);
    }

    @Test
    public void givenStationNameThenShouldReturnStationObjectWithCorrectAttribute() {

    }

    @Test
    public void givenCountryCodeThenListOfStationsShouldBeReturn() {
        List<Station> stations = stationFileReader.getStationsByCountryCode("");
        Assert.assertTrue(stations instanceof ArrayList);
    }

    @Test
    public void givenCountryCodeThenListOfStationsWithCorrectResultShouldBeReturn() {
        boolean correctResult = stationFileReader.getStationsByCountryCode("US").stream()
                .allMatch(station -> station.getCtry().equals("US"));
        Assert.assertTrue(correctResult);
    }

    @Test
    public void givenStationsIdRangeThenListOfStationWithinTheRangeAndCorrectResultShouldBeReturn() {
        List<Station> stations = stationFileReader.getStationsByIdRange("726887", "744662");
        boolean correctResult = stations.stream().allMatch(station -> Integer.parseInt(station.getUsaf()) >= 726887
                && Integer.parseInt(station.getUsaf()) <= 744662);
        Assert.assertTrue(correctResult);
    }

    @Test(expected = RuntimeException.class)
    public void givenStationNameThatDoesNotExistThenExceptionShouldBeThrown() {
        stationFileReader.getStationByStationName("CWOS 158");
    }
}
