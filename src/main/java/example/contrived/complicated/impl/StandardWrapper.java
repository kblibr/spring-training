package example.contrived.complicated.impl;

import example.contrived.complicated.thirdparty.StandardsWorkhorse;

/**
 * User: bryant.larsen
 */
public class StandardWrapper {
  private final StandardsWorkhorse standards;

  public StandardWrapper(StandardsWorkhorse standards) {
    this.standards = standards;
  }

  public String doStandardizeName(String nonStandardized){
    return standards.standardizeName(nonStandardized);
  }

  public String doStandardizePlace(String nonStandardized){
    return standards.standardizePlace(nonStandardized);
  }
}
