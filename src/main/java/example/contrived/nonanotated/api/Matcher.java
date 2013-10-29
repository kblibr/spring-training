package example.contrived.nonanotated.api;

import example.contrived.nonanotated.schema.MatchResult;

import java.util.List;

/**
 * User: bryant.larsen
 */
public interface Matcher {

  List<MatchResult> doMatch(MatchResult matchRequest);
}
