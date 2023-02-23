package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authenticaiton {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
        System.out.println("Authentication");
    }
    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){
        System.out.println("Authorization");
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authentication(){
        System.out.println("Authenticating the request");
    }
}
