package service;

import com.hendisantika.springboot2demo.model.Person;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot2-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/12/19
 * Time: 06.30
 */
@Service
final class DemoPersonService implements PersonService {
    @Override
    public Person johnSmith() {
        final Person person = new Person();
        person.setFirstname("John");
        person.setLastname("Smith");
        return person;
    }

    @Override
    public String hello(final Person person) {
        return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
    }
}