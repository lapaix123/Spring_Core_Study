package rw.gov.minecofin.IoC.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("userBean.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.registerUser("Irakiza","irakiza@gmail.com");
    }
}
