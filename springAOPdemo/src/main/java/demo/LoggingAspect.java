package demo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp) {
        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString(); //Argument
        System.out.println(arg);
        System.out.println("LogIn");
    }

    @After("execution(* *.*.checkout(..))")
    public void logout(){
        System.out.println("LogOut");
    }
}
