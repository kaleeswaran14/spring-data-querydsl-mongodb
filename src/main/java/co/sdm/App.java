package co.sdm;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Sort;

import co.sdm.domain.QUser;
import co.sdm.domain.User;
import co.sdm.service.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springapp.xml");
    	
        @SuppressWarnings("unchecked")
		Service<User> userService = (Service<User>)context.getBean("userService");
        
        List<User> users = userService.findAll(new Sort(new Sort.Order(Sort.Direction.DESC, "name")));
        
        if(users == null || users.isEmpty()) {
        	// create two users
        	
        	User user1 = new User();
            user1.setName("user1");
            userService.save(user1);
            
            User user2 = new User();
            user2.setName("user2");
            userService.save(user2);
        }
        
        for(User user : users) {
        	System.out.println(user);
        }

        
        System.out.println("In Query");
        
        QUser qUser = QUser.user;
        Iterable<User> inUsers = userService.findAll(qUser.name.in(Arrays.asList(new String[]{"user1", "user2"})));
        
        if(inUsers != null) {
        	for(User user : inUsers) {
        		System.out.println(user);
        	}
        }
        
		        
    }
}
