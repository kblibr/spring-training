package example.contrived.nonanotated.api;

import example.contrived.nonanotated.schema.SearchRequest;
import example.contrived.nonanotated.schema.SearchResult;

import java.util.List;

/**
 * User: bryant.larsen
 */
public interface Searcher {

  List<SearchResult> doSearch(SearchRequest searchRequest);
}
