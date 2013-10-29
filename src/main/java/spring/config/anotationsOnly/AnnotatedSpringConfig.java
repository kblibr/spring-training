package spring.config.anotationsOnly;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * User: bryant.larsen
 */
@Configuration
@ComponentScan(basePackages = "example.contrived.anotated")
public class AnnotatedSpringConfig {
}
