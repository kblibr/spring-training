package spring.config.complicated;

import example.contrived.complicated.api.Broker;
import example.contrived.complicated.thirdparty.Standardizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: bryant.larsen
 */
public class App {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(ComplicatedConfig.class);
    context.refresh();

    Broker broker = context.getBean(Broker.class);

    broker.doSearch();
    broker.doSearch();

  }
}
