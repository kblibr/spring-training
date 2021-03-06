package spring.config.xml;

import example.contrived.nonanotated.api.Broker;
import example.contrived.nonanotated.schema.MatchResult;
import example.contrived.nonanotated.schema.SearchRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: bryant.larsen
 */
public class App {

  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("/spring/config/xml/appCtx.xml");
    Broker broker = context.getBean(Broker.class);
    broker.doMatch(new MatchResult());
    broker.doSearch(new SearchRequest());
  }
}
