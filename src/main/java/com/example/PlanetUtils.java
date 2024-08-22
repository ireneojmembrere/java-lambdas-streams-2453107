package com.example;

import java.util.List;

public class PlanetUtils {

  public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
    return planets.stream().filter(planet -> planet.getName().startsWith("M")).toList();
  }

  public List<Planet> getPlanetsWithRings(List<Planet> planets) {
    return planets.stream().filter(planet -> planet.getHasRings()).toList();
  }

  public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
    return planets.stream().filter(planet -> planet.getNumberOfMoons() > 3).toList();
  }

  public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
    return planets.stream().filter(planet -> planet.getDensity() > 5).toList();
  }

}
