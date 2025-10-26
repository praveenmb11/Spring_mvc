package spring_mvc.c;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="spring_mvc.controller,spring_mvc.dao,spring_mvc.dto")
public class MyConfig {

}
