package example.contrived.nonanotated.impl;

import example.contrived.nonanotated.api.Broker;
import example.contrived.nonanotated.api.Matcher;
import example.contrived.nonanotated.api.Searcher;
import example.contrived.nonanotated.schema.MatchResult;
import example.contrived.nonanotated.schema.SearchRequest;
import example.contrived.nonanotated.schema.SearchResult;

import java.util.List;

/**
 * User: bryant.larsen
 */
public class BrokerImpl implements Broker {

  private final Matcher matcher;
  private final Searcher searcher;

  public BrokerImpl(Matcher matcher, Searcher searcher) {
    System.out.println("In constructor of BrokerImpl");
    this.matcher = matcher;
    this.searcher = searcher;
  }

  @Override
  public List<SearchResult> doSearch(SearchRequest searchRequest) {
    return searcher.doSearch(searchRequest);
  }

  @Override
  public List<MatchResult> doMatch(MatchResult matchRequest) {
    return matcher.doMatch(matchRequest);
  }


}
