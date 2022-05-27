package teachMySkills;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       /* ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorld");
        helloWorldBean.say();

        HelloTeacher helloTeacherBean = (HelloTeacher) context.getBean("helloTeacher");
        helloTeacherBean.helloTeacher();

        OnePlusOne onePlusOneBean = (OnePlusOne) context.getBean("onePlusOne");
        onePlusOneBean.onePlusOne();
        */

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company =  context.getBean(Company.class);
        company.say();



    }
}
