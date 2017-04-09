package com.github.moussecp.weather.data;


import com.github.moussecp.weather.domain.Location;

import java.util.List;

public interface LocationRepository {
    List<Location> findAll();
    Location find(Long id);
}
