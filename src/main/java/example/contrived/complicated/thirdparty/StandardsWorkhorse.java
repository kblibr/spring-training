package example.contrived.complicated.thirdparty;

import java.util.List;

/**
 * User: bryant.larsen
 */
public class StandardsWorkhorse {
  private List<String> locations;
  private int maxLength;
  private String defaultLocale;
  private final Standardizer placeStandardizer;
  private final Standardizer nameStandardizer;


  public StandardsWorkhorse(Standardizer placeStandardizer, Standardizer nameStandardizer) {
    this.placeStandardizer = placeStandardizer;
    this.nameStandardizer = nameStandardizer;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public void setMaxLength(int maxLength) {
    this.maxLength = maxLength;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }


  public String standardizeName(String name) {
    return this.nameStandardizer.standardize(name);
  }

  public String standardizePlace(String place) {
    return this.placeStandardizer.standardize(place, locations);
  }
}
