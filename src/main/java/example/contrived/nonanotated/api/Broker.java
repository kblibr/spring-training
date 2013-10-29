package example.contrived.nonanotated.api;

import example.contrived.nonanotated.schema.MatchResult;
import example.contrived.nonanotated.schema.SearchRequest;
import example.contrived.nonanotated.schema.SearchResult;

import java.util.List;

/**
 * User: bryant.larsen
 */
public interface Broker {

  List<SearchResult> doSearch(SearchRequest searchRequest);

  List<MatchResult> doMatch(MatchResult matchRequest);
}
