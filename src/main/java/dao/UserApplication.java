package dao;

import java.util.Optional;
import org.apache.logging.log4j.*;

import animalclass.Animal;
import dao.interfaces.DaoApi;

public class UserApplication {
	private static final Logger LOGGER = LogManager.getLogger(UserApplication.class);
	

    private static DaoApi<User> userDao;

    public static void main(String[] args) {
    	userDao = new UserDao();
        
        User user1 = getUser(0);
        LOGGER.info(user1);
        userDao.update(user1, new String[]{"rezo", "rezo@xuchua.com"});
        
        User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new User("giorgi", "giorgi@domain.com"));
        
        userDao.getAll().forEach(user -> LOGGER.info(user.getName()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);
        
        return user.orElseGet(
          () -> new User("non-existing user", "no-email"));
    }
}
