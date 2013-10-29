package example.contrived.complicated.impl;

import example.contrived.complicated.api.Broker;

/**
 * User: bryant.larsen
 */
public class BrokerImpl implements Broker {
  private MatcherImpl matcher;
  private SearcherImpl searcher;
  private StandardWrapper standardWrapper;


  public BrokerImpl(MatcherImpl matcher, SearcherImpl searcher, StandardWrapper standardWrapper) {
    this.matcher = matcher;
    this.searcher = searcher;
    this.standardWrapper = standardWrapper;
  }

  @Override
  public void doSearch() {
    searcher.doSearch();
  }

  @Override
  public void doMatch() {
    matcher.doMatch();
  }

  @Override
  public String standardize(String nameOrPlace) {
    return standardWrapper.doStandardizeName(nameOrPlace) + "&" + standardWrapper.doStandardizePlace(nameOrPlace);
  }
}
