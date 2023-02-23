package demo;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configurable
@ComponentScan(basePackages = "demo")
@EnableAspectJAutoProxy
public class BeanConfig {
}
