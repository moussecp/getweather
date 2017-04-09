package com.github.moussecp.weather.data;


import com.github.moussecp.weather.domain.Location;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
class LocationRepositoryImpl implements LocationRepository {

    private static Map<String, Long> woeId = new HashMap<>();
    private static List<Location> locationsTable = new ArrayList<>();

    static {
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
    }

    static {
        Iterator it = woeId.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = (Map.Entry) it.next();
            locationsTable.add(new Location(next.getKey().toString(), (Long) next.getValue()));
        }
    }

    @Override
    public List<Location> findAll() {
        return new ArrayList<>(locationsTable);
    }

    @Override
    public Location find(Long id) {
        Location foundLocation = null;
        for(Location location: locationsTable) {
            if(location.getId().equals(id))
                foundLocation = location;
        }
        return foundLocation;
    }
}
