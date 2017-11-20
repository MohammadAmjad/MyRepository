package com.progressoft.wheather.gsod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GsodFileReaderTest {

    private static final String DIRECTORY = "/home/trn179/Desktop/WheatherTask-Documentation/weather-Files";
    private GsodFileReader gsodFileReader;

    @Before
    public void setUp() {
        gsodFileReader = new GsodFileReader();
    }

    @Test
    public void givenFilesDirectoryThenListOfAllFilesDateWithinTheDirectoryShouldBeReturn() {
        List<String> dates = gsodFileReader.getFilesDateByGivenDirectory(DIRECTORY);
        Assert.assertTrue(dates.size() == 2);
        Assert.assertTrue(dates.contains("20170901"));
        Assert.assertTrue(dates.contains("20170902"));
    }

    @Test
    public void givenStationIdAndDateThenGsodObjectWithCorrectAttributeShouldBeReturn() {
        Gsod gsod = gsodFileReader.getGsodByStationIdAndDate("701170", "20170901");
        Assert.assertEquals("701170", gsod.getStn());
        Assert.assertEquals("26634", gsod.getWban());
        Assert.assertEquals("20170901", gsod.getYearModa());
        Assert.assertEquals("39.4 24", gsod.getTemp());
    }

    @Test
    public void givenCountryCodeAndDateThenListOfGsodShouldBeReturn() {
        List<Gsod> gsodList = gsodFileReader.getListOfGsodByCountryCodeAndDate("US", "20170901");
        Assert.assertFalse(gsodList.isEmpty());
    }

    @Test
    public void givenStationNameAndDateThenGsodObjectWithCorrectAttributeShouldBeReturn() throws Exception {
        Gsod gsod = gsodFileReader.getListOfGsodByStationNameAndDate("SHUNGNAK AIRPORT", "20170901");
        Assert.assertEquals("701719", gsod.getStn());
    }
}
