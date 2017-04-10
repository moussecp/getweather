package com.github.moussecp.weather.domain;

import com.github.fedy2.weather.data.Astronomy;
import com.github.fedy2.weather.data.Atmosphere;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.Image;
import com.github.fedy2.weather.data.Item;
import com.github.fedy2.weather.data.Location;
import com.github.fedy2.weather.data.Units;
import com.github.fedy2.weather.data.Wind;

public class Weather {
    private static Long idIncrement = 0L;
    private Long id;
    private Image image;
    //    description: Yahoo! Weather for Brussels, Capital Region of Brussels, BE
    private String description;
    //    astronomy - sunrise: Time [hours=6, minutes=58, convention=AM]
    //    astronomy - sunset: Time [hours=8, minutes=31, convention=PM]
    private Astronomy astronomy;
    //    atmosphere - humidity: 71
    //    atmosphere - pressure: 34371.86
    //    atmosphere - rising: STEADY
    //    atmosphere - visibility: 25.91
    private Atmosphere atmosphere;
    //    item - condition: Condition [text=Cloudy, code=26, temp=10, date=Mon Apr 10 13:00:00 CEST 2017]
    //    item - description: <![CDATA[<img src="http://l.yimg.com/a/i/us/we/52/26.gif"/>
    //<BR />
    //    <b>Current Conditions:</b>
    //<BR />Cloudy
    //        <BR />
    //<BR />
    //<b>Forecast:</b>
    //<BR /> Mon - Mostly Cloudy. High: 14Low: 8
    //<BR /> Tue - Mostly Cloudy. High: 13Low: 3
    //<BR /> Wed - Mostly Cloudy. High: 13Low: 5
    //<BR /> Thu - Mostly Cloudy. High: 11Low: 6
    //<BR /> Fri - Mostly Cloudy. High: 13Low: 3
    //<BR />
    //<BR />
    //<a href="http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-968019/">Full Forecast at Yahoo! Weather</a>
    //<BR />
    //<BR />
    //        (provided by <a href="http://www.weather.com" >The Weather Channel</a>)
    //<BR />
    //        ]]>
    //    item - forecasts: [Forecast [day=MON, date=Mon Apr 10 00:00:00 CEST 2017, low=8, high=14, text=Mostly Cloudy, code=28], Forecast [day=TUE, date=Tue Apr 11 00:00:00 CEST 2017, low=3, high=13, text=Mostly Cloudy, code=28], Forecast [day=WED, date=Wed Apr 12 00:00:00 CEST 2017, low=5, high=13, text=Mostly Cloudy, code=28], Forecast [day=THU, date=Thu Apr 13 00:00:00 CEST 2017, low=6, high=11, text=Mostly Cloudy, code=28], Forecast [day=FRI, date=Fri Apr 14 00:00:00 CEST 2017, low=3, high=13, text=Mostly Cloudy, code=28], Forecast [day=SAT, date=Sat Apr 15 00:00:00 CEST 2017, low=6, high=13, text=Scattered Showers, code=39], Forecast [day=SUN, date=Sun Apr 16 00:00:00 CEST 2017, low=6, high=11, text=Scattered Showers, code=39], Forecast [day=MON, date=Mon Apr 17 00:00:00 CEST 2017, low=5, high=11, text=Scattered Showers, code=39], Forecast [day=TUE, date=Tue Apr 18 00:00:00 CEST 2017, low=5, high=11, text=Rain, code=12], Forecast [day=WED, date=Wed Apr 19 00:00:00 CEST 2017, low=5, high=12, text=Rain, code=12]]
    //    item - geolat: 50.84838
    //    item - geolong: 4.34968
    //    item - guid:
    //    item - link: http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-968019/
    //    item - pubdate: Mon Apr 10 13:00:00 CEST 2017
    //    item - title: Conditions for Brussels, Capital Region of Brussels, BE at 01:00 PM CEST
    private Item item;
    //    link: http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-968019/
    private String link;
    //    location - city: Brussels
    //    location - country: Belgium
    //    location - region:  Capital Region of Brussels
    private com.github.fedy2.weather.data.Location location;
    //    units - distance: KM
    //    units - pressure: MB
    //    units - speed: KMH
    //    units - temperature: CELSIUS
    private Units units;
    //    wind - chill: 48
    //    wind - direction: 315
    //    wind - speed: 17.7
    private Wind wind;

    public Weather(Channel channel) {
        this(channel.getDescription(), channel.getAstronomy(), channel.getAtmosphere(), channel.getImage(), channel.getItem(), channel.getLink(), channel.getLocation(), channel.getUnits(), channel.getWind());
    }

    public Weather(String description, Astronomy astronomy, Atmosphere atmosphere, Image image, Item item, String link, Location location, Units units, Wind wind) {
        this(++idIncrement, description, astronomy, atmosphere, image, item, link, location, units, wind);
    }

    private Weather(Long id, String description, Astronomy astronomy, Atmosphere atmosphere, Image image, Item item, String link, Location location, Units units, Wind wind) {
        this.id = id;
        this.description = description;
        this.astronomy = astronomy;
        this.atmosphere = atmosphere;
        this.image = image;
        this.item = item;
        this.link = link.substring(link.indexOf('*') + 1);
        this.location = location;
        this.units = units;
        this.wind = wind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weather weather = (Weather) o;

        if (!getId().equals(weather.getId())) return false;
        if (getDescription() != null ? !getDescription().equals(weather.getDescription()) : weather.getDescription() != null)
            return false;
        if (getAstronomy() != null ? !getAstronomy().equals(weather.getAstronomy()) : weather.getAstronomy() != null)
            return false;
        if (getAtmosphere() != null ? !getAtmosphere().equals(weather.getAtmosphere()) : weather.getAtmosphere() != null)
            return false;
        if (getItem() != null ? !getItem().equals(weather.getItem()) : weather.getItem() != null) return false;
        if (getLink() != null ? !getLink().equals(weather.getLink()) : weather.getLink() != null) return false;
        if (getLocation() != null ? !getLocation().equals(weather.getLocation()) : weather.getLocation() != null)
            return false;
        if (getUnits() != null ? !getUnits().equals(weather.getUnits()) : weather.getUnits() != null) return false;
        return getWind() != null ? getWind().equals(weather.getWind()) : weather.getWind() == null;
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getAstronomy() != null ? getAstronomy().hashCode() : 0);
        result = 31 * result + (getAtmosphere() != null ? getAtmosphere().hashCode() : 0);
        result = 31 * result + (getItem() != null ? getItem().hashCode() : 0);
        result = 31 * result + (getLink() != null ? getLink().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getUnits() != null ? getUnits().hashCode() : 0);
        result = 31 * result + (getWind() != null ? getWind().hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Astronomy getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
