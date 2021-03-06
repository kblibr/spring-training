package spring.config.mixed;

import example.contrived.anotated.api.Feeder;
import example.contrived.anotated.schema.UpdateRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: bryant.larsen
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/spring/config/mixed/applicationContext.xml");
    Feeder feeder = context.getBean(Feeder.class);
    feeder.doFeed(new UpdateRequest());
  }
}
