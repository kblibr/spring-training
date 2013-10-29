package example.contrived.complicated.impl;

/**
 * User: bryant.larsen
 */
public class SearcherImpl {

  private StandardWrapper standardWrapper;

  public SearcherImpl(StandardWrapper standardWrapper) {
    this.standardWrapper = standardWrapper;
  }

  public String doSearch() {
    String name = standardWrapper.doStandardizeName("");
    //do search
    return name;
  }

}
