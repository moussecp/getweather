package com.github.moussecp.weather.web;

import com.github.moussecp.weather.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    private LocationRepository locationRepository;

    @Autowired
    public WeatherController(LocationRepository locationRepository) {   // inject storyRepository
        this.locationRepository = locationRepository;
    }

    public WeatherController() {
        super();
    }

    /* Notice that the stories() method is given a Model as a parameter. This is so that
    stories() can populate the model with the Story list it retrieves from the repository.
    The Model is essentially a map (that is, a collection of key-value pairs) that will be
    handed off to the view so that the com.github.moussecp.weather.data can be rendered to the client.
    When addAttribute() is called without specifying a key, the key is inferred from the type of
    object being set as the value. In this case, because it’s a List<Story>, the key will be
    inferred as storyList. */
    public String getAllLocations(Model model) {
        model.addAttribute("locationList", locationRepository.findAll());
        return "weather";                                       // return view name
    }

    private String getLocationFromSelection(Long id, Model model) {
        model.addAttribute("locationList", locationRepository.find(id));
        return "location";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String singleStory(
            @RequestParam(value = "id", defaultValue = "1") Long id, Model model) {
        try {
            return getLocationFromSelection(id, model);
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            return getAllLocations(model);
        }
    }


}
