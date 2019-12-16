import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.polina.springApps.User;

public class TestString {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName() + " " + user.getSurname() + " " + user.getAge());
        context.close();
    }
}
