package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class FlightsRepository {

    private Map<String , List<String>> dataBase;

    public FlightsRepository(Map<String, List<String>> dataBase) {
        this.dataBase = dataBase;
    }

    public boolean isFlightAvailable(FlightRequest flightRequest){
        List<String> request = flightRequest.getAirports();

        for(int i = 1; i < request.size(); i++){
            if(!getFlightsFromCity(request.get(i - 1)).contains(request.get(i))){
                return false;
            }
        }

        return true;
    }

    public List<String> getFlightsFromCity(String city){
        if(dataBase.containsKey(city)){
            return dataBase.get(city);
        }

        return new ArrayList<>();
    }

    public List<String> getFlightsToCity(String city){

        List<String> cities = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : dataBase.entrySet()){
            if(entry.getValue().contains(city)){
                cities.add(entry.getKey());
            }
        }

        return cities;
    }
}
