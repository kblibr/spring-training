package example.contrived.spring.javaonly;

import example.contrived.nonanotated.api.Broker;
import example.contrived.nonanotated.api.Matcher;
import example.contrived.nonanotated.api.Searcher;
import example.contrived.nonanotated.impl.BrokerImpl;
import example.contrived.nonanotated.impl.MatcherImpl;
import example.contrived.nonanotated.impl.SearcherImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: bryant.larsen
 */
@Configuration
public class SpringConfig {

  @Bean
  public Broker getBroker(){
    return new BrokerImpl(getMatcher(), getSearcher());
  }

  private Searcher getSearcher() {
    return new SearcherImpl();
  }

  private Matcher getMatcher() {
    return new MatcherImpl();
  }
}
