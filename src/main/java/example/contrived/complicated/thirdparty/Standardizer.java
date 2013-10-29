package example.contrived.complicated.thirdparty;

import java.util.List;

/**
 * User: bryant.larsen
 */
public interface Standardizer {

  String standardize(String nonStandard);
  String standardize(String nonStandard, List<String> tokens);
}
