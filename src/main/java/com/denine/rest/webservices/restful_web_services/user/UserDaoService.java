package com.denine.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    private static Integer usersCount = 0;

    static {
        users.add(new User(++usersCount,"Denine", LocalDate.of(1999, Month.NOVEMBER,9)));
        users.add(new User(++usersCount,"Namthip", LocalDate.of(2000, Month.APRIL,4)));
        users.add(new User(++usersCount,"Non", LocalDate.of(2004, Month.NOVEMBER,17)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

   public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
   }

}
