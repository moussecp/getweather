package com.github.moussecp.weather.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetWeatherService {

    public static void main(String... args) {
        Map<String, Long> woeId = new HashMap<>();
        woeId.put("Antwerp", new Long(966591));
        woeId.put("Arlon", new Long(966626));
        woeId.put("Brugge", new Long(967974));
        woeId.put("Bruxelles", new Long(968019));
        woeId.put("Ghent", new Long(970013));
        woeId.put("Hasselt", new Long(970693));
        woeId.put("Leuven", new Long(973505));
        woeId.put("Liège", new Long(973540));
        woeId.put("Mons", new Long(974484));
        woeId.put("Namur", new Long(971718));
        woeId.put("Nivelles", new Long(974945));

        try {
            YahooWeatherService service = new YahooWeatherService();
            Channel channel;
            Iterator it = woeId.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = (Map.Entry) it.next();
                channel = service.getForecast(next.getValue().toString(), DegreeUnit.CELSIUS);

                System.out.println("####################################################");

                System.out.println("description: " + channel.getDescription());
                System.out.println("astronomy - sunrise: " + channel.getAstronomy().getSunrise());
                System.out.println("astronomy - sunset: " + channel.getAstronomy().getSunset());

                System.out.println("atmosphere - humidity: " + channel.getAtmosphere().getHumidity());
                System.out.println("atmosphere - pressure: " + channel.getAtmosphere().getPressure());
                System.out.println("atmosphere - rising: " + channel.getAtmosphere().getRising());
                System.out.println("atmosphere - visibility: " + channel.getAtmosphere().getVisibility());

                System.out.println("item - condition: " + channel.getItem().getCondition());
                System.out.println("item - description: " + channel.getItem().getDescription());
                System.out.println("item - forecasts: " + channel.getItem().getForecasts());
                System.out.println("item - geolat: " + channel.getItem().getGeoLat());
                System.out.println("item - geolong: " + channel.getItem().getGeoLong());
                System.out.println("item - guid: " + channel.getItem().getGuid());
                System.out.println("item - link: " + channel.getItem().getLink());
                System.out.println("item - pubdate: " + channel.getItem().getPubDate());
                System.out.println("item - title: " + channel.getItem().getTitle());

                System.out.println("language: " + channel.getLanguage());

                System.out.println("lastbuilddate: " + channel.getLastBuildDate());

                System.out.println("link: " + channel.getLink());

                System.out.println("location - city: " + channel.getLocation().getCity());
                System.out.println("location - country: " + channel.getLocation().getCountry());
                System.out.println("location - region: " + channel.getLocation().getRegion());

                System.out.println("title: " + channel.getTitle());

                System.out.println("units - distance: " + channel.getUnits().getDistance());
                System.out.println("units - pressure: " + channel.getUnits().getPressure());
                System.out.println("units - speed: " + channel.getUnits().getSpeed());
                System.out.println("units - temperature: " + channel.getUnits().getTemperature());

                System.out.println("wind - chill: " + channel.getWind().getChill());
                System.out.println("wind - direction: " + channel.getWind().getDirection());
                System.out.println("wind - speed: " + channel.getWind().getSpeed());
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
