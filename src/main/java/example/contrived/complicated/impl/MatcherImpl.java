package example.contrived.complicated.impl;

/**
 * User: bryant.larsen
 */
public class MatcherImpl {
  private StandardWrapper standardWrapper;

  public MatcherImpl(StandardWrapper standardWrapper) {
    this.standardWrapper = standardWrapper;
  }

  public String doMatch() {
    String place = standardWrapper.doStandardizePlace("");
    //do some stuff
    return place;
  }
}
