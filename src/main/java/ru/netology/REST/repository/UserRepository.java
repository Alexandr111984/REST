package ru.netology.REST.repository;

import org.springframework.stereotype.Repository;
import ru.netology.REST.exeption.Authorities;
import ru.netology.REST.exeption.InvalidCredentials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new HashMap<>();
        users.put("alex", "111");
        users.put("bob", "222");

        if (users.containsKey(user) && users.get(user).equals(password)) {
            if ("alex".equals(user)) {
                list.add(Authorities.READ);
            }
        } else {
            throw new InvalidCredentials("Username or password invalid");
        }

        return list;
    }
}