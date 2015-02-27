package spring.config.javaonly;

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
  public Broker getBroker(Searcher searcher, Matcher matcher){
    return new BrokerImpl(matcher, searcher);
  }

  @Bean
  public Searcher getSearcher() {
    return new SearcherImpl();
  }

  @Bean
  public  Matcher getMatcher() {
    return new MatcherImpl();
  }
}
