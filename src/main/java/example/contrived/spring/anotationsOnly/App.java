package example.contrived.spring.anotationsOnly;

import example.contrived.anotated.api.Feeder;
import example.contrived.anotated.schema.UpdateRequest;
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
    context.register(AnnotatedSpringConfig.class);
    context.refresh();

    Feeder feeder = context.getBean(Feeder.class);
    feeder.doFeed(new UpdateRequest());
  }
}
