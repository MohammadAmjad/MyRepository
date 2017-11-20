package com.progressoft.wheather.gsod;

public class Gsod {

    private String stn;
    private String wban;
    private String yearModa;
    private String temp;
    private String dewp;
    private String slp;
    private String stp;
    private String visib;
    private String wdsp;
    private String mxspd;
    private String gust;
    private String max;
    private String min;
    private String prcp;
    private String sndp;
    private String frshtt;

    public Gsod(GsodBuilder gsodBuilder) {
        stn = gsodBuilder.stn2;
        wban = gsodBuilder.wban2;
        yearModa = gsodBuilder.yearModa2;
        temp = gsodBuilder.temp2;
        dewp = gsodBuilder.dewp2;
        slp = gsodBuilder.slp2;
        stp = gsodBuilder.stp2;
        visib = gsodBuilder.visib2;
        wdsp = gsodBuilder.wdsp2;
        mxspd = gsodBuilder.mxspd2;
        gust = gsodBuilder.gust2;
        max = gsodBuilder.max2;
        min = gsodBuilder.min2;
        prcp = gsodBuilder.prcp2;
        sndp = gsodBuilder.sndp2;
        frshtt = gsodBuilder.frshtt2;
    }


    public void setStn(String stn) {
        this.stn = stn;
    }

    public void setWban(String wban) {
        this.wban = wban;
    }

    public void setYearModa(String yearModa) {
        this.yearModa = yearModa;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setDewp(String dewp) {
        this.dewp = dewp;
    }

    public void setSlp(String slp) {
        this.slp = slp;
    }

    public void setStp(String stp) {
        this.stp = stp;
    }

    public void setVisib(String visib) {
        this.visib = visib;
    }

    public void setWdsp(String wdsp) {
        this.wdsp = wdsp;
    }

    public void setMxspd(String mxspd) {
        this.mxspd = mxspd;
    }

    public void setGust(String gust) {
        this.gust = gust;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public void setPrcp(String prcp) {
        this.prcp = prcp;
    }

    public void setSndp(String sndp) {
        this.sndp = sndp;
    }

    public void setFrshtt(String frshtt) {
        this.frshtt = frshtt;
    }

    public String getStn() {
        return stn;
    }

    public String getWban() {
        return wban;
    }

    public String getYearModa() {
        return yearModa;
    }

    public String getTemp() {
        return temp;
    }

    public String getDewp() {
        return dewp;
    }

    public String getSlp() {
        return slp;
    }

    public String getStp() {
        return stp;
    }

    public String getVisib() {
        return visib;
    }

    public String getWdsp() {
        return wdsp;
    }

    public String getMxspd() {
        return mxspd;
    }

    public String getGust() {
        return gust;
    }

    public String getMax() {
        return max;
    }

    public String getMin() {
        return min;
    }

    public String getPrcp() {
        return prcp;
    }

    public String getSndp() {
        return sndp;
    }

    public String getFrshtt() {
        return frshtt;
    }

    public static class GsodBuilder {
        private String stn2;
        private String wban2;
        private String yearModa2;
        private String temp2;
        private String dewp2;
        private String slp2;
        private String stp2;
        private String visib2;
        private String wdsp2;
        private String mxspd2;
        private String gust2;
        private String max2;
        private String min2;
        private String prcp2;
        private String sndp2;
        private String frshtt2;

        public GsodBuilder setStn(String stn) {
            this.stn2 = stn;
            return this;
        }

        public GsodBuilder setWban(String wban) {
            this.wban2 = wban;
            return this;
        }

        public GsodBuilder setYearModa(String yearModa) {
            this.yearModa2 = yearModa;
            return this;
        }

        public GsodBuilder setTemp(String temp) {
            this.temp2 = temp;
            return this;
        }

        public GsodBuilder setDewp(String dewp) {
            this.dewp2 = dewp;
            return this;
        }

        public GsodBuilder setSlp(String slp) {
            this.slp2 = slp;
            return this;
        }

        public GsodBuilder setStp(String stp) {
            this.stp2 = stp;
            return this;
        }

        public GsodBuilder setVisib(String visib) {
            this.visib2 = visib;
            return this;
        }

        public GsodBuilder setWdsp(String wdsp) {
            this.wdsp2 = wdsp;
            return this;
        }

        public GsodBuilder setMxspd(String mxspd) {
            this.mxspd2 = mxspd;
            return this;
        }

        public GsodBuilder setGust(String gust) {
            this.gust2 = gust;
            return this;
        }

        public GsodBuilder setMax(String max) {
            this.max2 = max;
            return this;
        }

        public GsodBuilder setMin(String min) {
            this.min2 = min;
            return this;
        }

        public GsodBuilder setPrcp(String prcp) {
            this.prcp2 = prcp;
            return this;
        }

        public GsodBuilder setSndp(String sndp) {
            this.sndp2 = sndp;
            return this;
        }

        public GsodBuilder setFrshtt(String frshtt) {
            this.frshtt2 = frshtt;
            return this;
        }

        public String getStn() {
            return stn2;
        }

        public String getWban() {
            return wban2;
        }

        public String getYearModa() {
            return yearModa2;
        }

        public String getTemp() {
            return temp2;
        }

        public String getDewp() {
            return dewp2;
        }

        public String getSlp() {
            return slp2;
        }

        public String getStp() {
            return stp2;
        }

        public String getVisib() {
            return visib2;
        }

        public String getWdsp() {
            return wdsp2;
        }

        public String getMxspd() {
            return mxspd2;
        }

        public String getGust() {
            return gust2;
        }

        public String getMax() {
            return max2;
        }

        public String getMin() {
            return min2;
        }

        public String getPrcp() {
            return prcp2;
        }

        public String getSndp() {
            return sndp2;
        }

        public String getFrshtt() {
            return frshtt2;
        }

        public Gsod build() {
            return new Gsod(this);
        }
    }
}
