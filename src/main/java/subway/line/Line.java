package subway.line;

import subway.station.Station;

import java.util.List;

public class Line {
    private Long id;
    private String name;
    private String color;
    private List<Station> stations;

    public Line() {
    }

    public Line(String name, String color, List<Station> stations) {
        this.name = name;
        this.color = color;
        this.stations = stations;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<Station> getStations() {
        return stations;
    }
}
