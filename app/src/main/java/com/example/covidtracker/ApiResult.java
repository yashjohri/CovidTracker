package com.example.covidtracker;

public class ApiResult {

    StateInfo statewise[];

    public ApiResult() {
    }

    public ApiResult(StateInfo[] statewise) {
        this.statewise = statewise;
    }

    public StateInfo[] getStatewise() {
        return statewise;
    }

    public void setStatewise(StateInfo[] statewise) {
        this.statewise = statewise;
    }
}
