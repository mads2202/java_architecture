import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.UUID;

public class UserIndentityMap {
    private Map<UUID, User> personMap = new HashMap();
    private static UserIndentityMap instance=new UserIndentityMap();
    private UserIndentityMap(){}

    public static void addUser(User user) {
        instance.personMap.put(user.getId(), user);
    }

    public static User getUser(User key) {
        return instance.personMap.get(key);
    }
    public static User updateUser(User key) {
        return instance.personMap.put(key.getId(),key);
    }
    public static void deleteUser(User user){
        instance.personMap.remove(user.getId());
    }

}
