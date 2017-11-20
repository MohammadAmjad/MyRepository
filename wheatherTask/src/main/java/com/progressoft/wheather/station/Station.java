package com.progressoft.wheather.station;

public class Station {
    private String usaf;
    private String wban;
    private String stationName;
    private String ctry;
    private String st;
    private String call;
    private String lat;
    private String lon;
    private String elev;
    private String begin;
    private String end;

    private Station(StationBuilder stationBuilder) {
        this.usaf = stationBuilder.usaf2;
        this.wban = stationBuilder.wban2;
        this.stationName = stationBuilder.stationName2;
        this.ctry = stationBuilder.ctry2;
        this.st = stationBuilder.st2;
        this.call = stationBuilder.call2;
        this.lat = stationBuilder.lat2;
        this.lon = stationBuilder.lon2;
        this.elev = stationBuilder.elev2;
        this.begin = stationBuilder.begin2;
        this.end = stationBuilder.end2;
    }

    public void setUsaf(String usaf) {
        this.usaf = usaf;
    }

    public void setWban(String wban) {
        this.wban = wban;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setCtry(String ctry) {
        this.ctry = ctry;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setElev(String elev) {
        this.elev = elev;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUsaf() {
        return usaf;
    }

    public String getWban() {
        return wban;
    }

    public String getStationName() {
        return stationName;
    }

    public String getCtry() {
        return ctry;
    }

    public String getSt() {
        return st;
    }

    public String getCall() {
        return call;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getElev() {
        return elev;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }

    public static class StationBuilder {
        private String usaf2;
        private String wban2;
        private String stationName2;
        private String ctry2;
        private String st2;
        private String call2;
        private String lat2;
        private String lon2;
        private String elev2;
        private String begin2;
        private String end2;

        public StationBuilder setUsaf(String usaf) {
            this.usaf2 = usaf;
            return this;
        }

        public StationBuilder setWban(String wban) {
            this.wban2 = wban;
            return this;
        }

        public StationBuilder setStationName(String stationName) {
            this.stationName2 = stationName;
            return this;
        }

        public StationBuilder setCtry(String ctry) {
            this.ctry2 = ctry;
            return this;
        }

        public StationBuilder setSt(String st) {
            this.st2 = st;
            return this;
        }

        public StationBuilder setCall(String call) {
            this.call2 = call;
            return this;
        }

        public StationBuilder setLat(String lat) {
            this.lat2 = lat;
            return this;
        }

        public StationBuilder setLon(String lon) {
            this.lon2 = lon;
            return this;
        }

        public StationBuilder setElev(String elev) {
            this.elev2 = elev;
            return this;
        }

        public StationBuilder setBegin(String begin) {
            this.begin2 = begin;
            return this;
        }

        public StationBuilder setEnd(String end) {
            this.end2 = end;
            return this;
        }

        public Station build() {
            return new Station(this);
        }
    }
}
