package example.contrived.complicated.thirdparty;

import java.util.List;

/**
 * User: bryant.larsen
 */
public class NameStandardizer implements Standardizer {
  private final List<String> tokens;

  private NameStandardizer(List<String> tokens) {
    this.tokens = tokens;
  }

  public static NameStandardizer createNameStandardizer(final List<String> names){
    return new NameStandardizer(names);
  }

  @Override
  public String standardize(String nonStandard) {
    if (tokens.contains(nonStandard)) {
      return nonStandard;
    } else {
      return tokens.get(0);
    }
  }

  @Override
  public String standardize(String nonStandard, List<String> tokens) {
    return standardize(nonStandard);
  }
}
