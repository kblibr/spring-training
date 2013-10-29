package example.contrived.complicated.thirdparty;

import java.util.List;
import java.util.Set;

/**
 * User: bryant.larsen
 */
public class PlaceStandardizer implements Standardizer {
  private Set<String> uniquePlaces;

  private PlaceStandardizer() {
  }

  public static PlaceStandardizer createInstance() {
    return new PlaceStandardizer();
  }

  public void setUniquePlaces(Set<String> uniquePlaces) {
    this.uniquePlaces = uniquePlaces;
  }

  @Override
  public String standardize(String nonStandard) {
    return standardize(nonStandard, null);
  }

  @Override
  public String standardize(String nonStandard, List<String> locations) {
    if (null == locations) {
      return nonStandard;
    } else {
      if (locations.contains(nonStandard)) {
        return nonStandard;
      } else {
        return locations.get(0);
      }
    }
  }
}
