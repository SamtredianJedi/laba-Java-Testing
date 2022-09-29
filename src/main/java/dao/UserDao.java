package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import dao.interfaces.DaoApi;

public class UserDao implements DaoApi<User> {
    
    private List<User> users = new ArrayList<>();
    
    public UserDao() {
        users.add(new User("rezo", "rezo@xuchua.com"));
        users.add(new User("gigi", "gigi@mamaladze.com"));
        users.add(new User("nika", "nika@fartenadze.com"));
        users.add(new User("becca", "becca@maxaradze.com"));
        users.add(new User("luka", "luka@cxomelidze.com"));
        users.add(new User("ia", "ia@intskirveli.com"));
        users.add(new User("mindia", "mindia@shantadze.com"));
        users.add(new User("sandro", "sandro@futkaradze.com"));
        users.add(new User("", ""));
        users.add(new User("rezo", "rezo@xuchua.com"));
        users.add(new User("ivan", "ivan@snytko.com"));
    }
    
    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }
    
    @Override
    public List<User> getAll() {
        return users;
    }
    
    @Override
    public void save(User user) {
        users.add(user);
    }
    
    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(
          params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
          params[1], "Email cannot be null"));
        
        users.add(user);
    }
    
    @Override
    public void delete(User user) {
        users.remove(user);
    }
}