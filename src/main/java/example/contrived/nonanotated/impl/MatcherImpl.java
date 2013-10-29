package example.contrived.nonanotated.impl;

import example.contrived.nonanotated.api.Matcher;
import example.contrived.nonanotated.schema.MatchResult;

import java.util.ArrayList;
import java.util.List;

/**
 * User: bryant.larsen
 */
public class MatcherImpl implements Matcher {
  public MatcherImpl() {
    System.out.println("Constructing Matcher Impl");
  }

  @Override
  public List<MatchResult> doMatch(MatchResult matchRequest) {
    System.out.println("In doMatch in the MatcherImpl");

    List<MatchResult> results = new ArrayList<MatchResult>();
    return results;
  }
}
