package com.github.moussecp.weather.domain;


import org.apache.commons.lang3.builder.HashCodeBuilder;


public class Location {
    private Long id;
    private String name;
    private Long woeid;
    private static Long idIncrement = 0L;

    public Location(String name, Long woeid) {
        this(++idIncrement, name, woeid);
    }

    private Location(Long id, String name, Long woeid) {
        this.id = id;
        this.name = name;
        this.woeid = woeid;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getWoeid() {
        return woeid;
    }

    public boolean equals(Location that) {
        return this.equals(that) ? true :
                 (that.getId() != null
                    && that.getName() != null
                    && that.getWoeid() != null
                    && this.getId().equals(that.getId())
                    && this.getName().equals(that.getName())
                    && this.getWoeid().equals(that.getWoeid()));
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

}
