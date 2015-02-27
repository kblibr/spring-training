package spring.config.complicated;

import example.contrived.complicated.api.Broker;
import example.contrived.complicated.impl.BrokerImpl;
import example.contrived.complicated.impl.MatcherImpl;
import example.contrived.complicated.impl.SearcherImpl;
import example.contrived.complicated.impl.StandardWrapper;
import example.contrived.complicated.thirdparty.NameStandardizer;
import example.contrived.complicated.thirdparty.PlaceStandardizer;
import example.contrived.complicated.thirdparty.Standardizer;
import example.contrived.complicated.thirdparty.StandardsWorkhorse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Set;

/**
 * User: bryant.larsen
 */
@Configuration
public class ComplicatedConfig {


  private List<String> locations;

  @Bean
  @Qualifier(value = "placeStandardizer")
  public Standardizer getPlaceStandardizer() {
    PlaceStandardizer standardizer = PlaceStandardizer.createInstance();
    standardizer.setUniquePlaces(getUniquePlaces());
    return standardizer;
  }

  @Bean
  @Qualifier(value = "nameStandardizer")
  public Standardizer getNameStandardizer() {
    return NameStandardizer.createNameStandardizer(getListOfName());
  }

  @Bean
  public StandardsWorkhorse getTheWorkhorse(@Qualifier(value = "nameStandardizer")Standardizer nameOne, @Qualifier(value = "placeStandardizer") Standardizer placeOne){
    StandardsWorkhorse worker = new StandardsWorkhorse(placeOne, nameOne);
    worker.setDefaultLocale("");
    worker.setMaxLength(1);
    worker.setLocations(getLocations());
    return worker;
  }

  @Bean
  public StandardWrapper getStandardWrapper(StandardsWorkhorse workhorse){
    return new StandardWrapper(workhorse);
  }

  @Bean
  public SearcherImpl getSearcherImpl(StandardWrapper wrapper){
     return new SearcherImpl(wrapper);
  }

  @Bean
  public MatcherImpl getMatcherImpl(StandardWrapper wrapper){
    return new MatcherImpl(wrapper);
  }

  @Bean
  @Lazy
  public Broker getBrokerImpl(StandardWrapper wrapper, MatcherImpl matcher, SearcherImpl searcher){
      return new BrokerImpl(matcher, searcher, wrapper);
  }

  public Set<String> getUniquePlaces() {
    return null;
  }

  public List<String> getListOfName() {
    return null;
  }

  public List<String> getLocations() {
    return locations;
  }
}
