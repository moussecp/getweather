package com.github.moussecp.weather.web;

import com.github.moussecp.weather.service.GetWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    private GetWeatherService getWeatherService;

    @Autowired
    public WeatherController(GetWeatherService getWeatherService) {
        this.getWeatherService = getWeatherService;
    }

    public WeatherController() {
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getWeatherForLocation(
        @RequestParam(value = "id", defaultValue = "1") Long id, Model model) {
        try {
            model.addAttribute("weather", getWeatherService.getWeather(id));
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e.getMessage());
        }
        return "weather";
    }


}
