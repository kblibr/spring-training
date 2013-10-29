package example.contrived.spring.javaonly;

import example.contrived.nonanotated.api.Broker;
import example.contrived.nonanotated.schema.MatchResult;
import example.contrived.nonanotated.schema.SearchRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: bryant.larsen
 */
public class App {

  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(SpringConfig.class);
    context.refresh();

    Broker broker = context.getBean(Broker.class);
    broker.doMatch(new MatchResult());
    broker.doSearch(new SearchRequest());
  }
}
