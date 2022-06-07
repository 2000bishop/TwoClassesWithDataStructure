package org.vashonsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunTimes {
    Map<String, Double> times = new HashMap<>();
    Double cutoff;

    public RunTimes(Double cutoff) {
        this.cutoff = cutoff;
    }

    public Double getCutoff() {
        return cutoff;
    }



    public void setTime(String who, Double time) {

    }

    public Map<String, Double> getTimes() {
        return times;
    }

    public String toString(){
        return "times";
    }

    //return whether a specific individual is under the cutoff time.
    public boolean madeCutoff(String who) {
        if (times.get(who) < cutoff){
            return true;
        }
        return false;
    }

    //return a list of the people who did make it under cutoff time.
    public List<String> whoMadeCutoff() {
        //Make an empty list
        List<String> madeTheCutOff = new ArrayList<String>();
        //loop through the map, adding all the users under the cutoff to the list.
        for(String person : times.keySet()) {
            if (times.get(person) < cutoff) {
                madeTheCutOff.add(person);
            }
        }
        //return the list.
        return madeTheCutOff;
    }
}
