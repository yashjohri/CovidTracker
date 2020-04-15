package com.example.covidtracker;

public class StateInfo {

    String recovered;
    String confirmed;
    String deaths;
    String state;
    String lastupdatedtime;

    public StateInfo() {
    }

    public StateInfo(String recovered, String confirmed, String deaths, String state, String lastupdatedtime) {
        this.recovered = recovered;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.state = state;
        this.lastupdatedtime=lastupdatedtime;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }
}
