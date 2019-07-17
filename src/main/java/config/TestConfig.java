package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan({"dao","service","controller"})
@ComponentScan({"dao","service"})
@Import(DruidJDBCConfig.class)
public class TestConfig {

}
