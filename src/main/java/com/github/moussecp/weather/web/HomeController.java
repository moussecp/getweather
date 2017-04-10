package com.github.moussecp.weather.web;

import com.github.moussecp.weather.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Declared to be a controller
// stereotype annotation
// component scanner will automatically pick up HomeController and declare it as a bean in the Spring application context
@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {
    @Autowired
    private LocationRepository locationRepository;

    // Handle GET requests for /
    // The value attribute specifies the request path that this method will handle,
    // and the method attribute details the HTTP method that it can handle. In this case,
    // whenever an HTTP GET request comes in for /, the home() method will be called.
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("locationList", locationRepository.findAll());
        return "home";
    }
}
