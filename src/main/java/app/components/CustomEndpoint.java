package app.components;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "users")
public class CustomEndpoint {

    private final Map<String, User> users = new HashMap();

    CustomEndpoint() {
        this.users.put("A", new User("AAA"));
        this.users.put("B", new User("BBB"));
        this.users.put("C", new User("CCC"));
        this.users.put("D", new User("DDD"));
    }

    @ReadOperation
    public List getAll() {
        return new ArrayList(this.users.values());
    }

    @ReadOperation
    public User getActiveUser(@Selector String user) {
        return this.users.get(user);
    }

    @WriteOperation
    public void updateActiveUser(@Selector String name, String user) {
        this.users.put(name, new User(user));
    }

    @DeleteOperation
    public void deleteActiveUser(@Selector String name) {
        this.users.remove(name);
    }

    public static class User {
        private String name;

        User(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
