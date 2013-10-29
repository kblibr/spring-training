package example.contrived.nonanotated.impl;

import example.contrived.nonanotated.api.Searcher;
import example.contrived.nonanotated.schema.SearchRequest;
import example.contrived.nonanotated.schema.SearchResult;

import java.util.ArrayList;
import java.util.List;

/**
 * User: bryant.larsen
 */
public class SearcherImpl implements Searcher {

  public SearcherImpl() {
    System.out.println("Constructing SearcherImpl");
  }

  @Override
  public List<SearchResult> doSearch(SearchRequest searchRequest) {
    System.out.println("In doSearch in the SearcherImpl");
    List<SearchResult> results = new ArrayList<SearchResult>();
    return results;
  }
}
