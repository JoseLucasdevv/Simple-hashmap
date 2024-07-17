import Business.Business;
import Db.MemoryDB;
import GenerateInstance.GenerateInstance;
import User.User;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        Business logicBusiness = new Business(new GenerateInstance().generate());
        User user1 = new User(generateUUID(),"lucas",20);
        User user2 = new User(generateUUID(),"Pedro",22);
        User user3 = new User(generateUUID(),"João",25);
        User user4 = new User(uuid,"maria",28);
        User UpdateUser = new User(uuid,"maria",29);


        logicBusiness.saveUser(user1);
        logicBusiness.saveUser(user2);
        logicBusiness.saveUser(user3);
        logicBusiness.saveUser(user4);
        logicBusiness.getAllUsers();
        logicBusiness.updateUser(uuid,UpdateUser);
        logicBusiness.getUserById(uuid);
        logicBusiness.deleteUser(uuid);
        logicBusiness.getAllUsers();


    }


    public static UUID generateUUID(){
        return UUID.randomUUID();
    }
}