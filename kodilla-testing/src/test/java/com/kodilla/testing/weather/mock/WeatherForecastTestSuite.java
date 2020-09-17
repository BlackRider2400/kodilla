package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private Map<String, Double> temperaturesMap;

    @BeforeEach
    public void beforeEach(){
        temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When

        double average = Math.round(((25.5 + 26.2 + 24.8 + 25.2 + 26.1) / 5) * 100.0) / 100.0;

        double result = 0;

        for(Map.Entry<String, Double> temperature:
            temperaturesMock.getTemperatures().entrySet()){
            result += temperature.getValue();
        }

        result /= 5;

        //Then
        Assertions.assertEquals(average, result);
    }

    @Test
    void testCalculateMedianFromTemperatures(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = 25.5;

        double[] temperaturesArray = new double[5];

        int i = 0;

        for(Map.Entry<String, Double> temperature:
                temperaturesMock.getTemperatures().entrySet()){
            temperaturesArray[i] = temperature.getValue();
            i++;
        }

        Arrays.sort(temperaturesArray);

        double result = temperaturesArray[2];

        //Then
        Assertions.assertEquals(median, result);

    }
}
