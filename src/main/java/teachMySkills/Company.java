package teachMySkills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private HelloTeacher helloTeacher;

    @Autowired
    public Company(HelloTeacher helloTeacher){
        this.helloTeacher = helloTeacher;
    }
    public void say(){
        helloTeacher.helloTeacher();
    }
}
