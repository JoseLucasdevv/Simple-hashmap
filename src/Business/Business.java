package Business;

import Db.IMemoryDB;

import User.User;

import java.util.HashMap;
import java.util.UUID;


public class Business {
    private HashMap db;

    public Business(IMemoryDB _MemoryDb){
        this.db = _MemoryDb.db();
    }

    public void getAllUsers(){
      this.db.forEach((key,value)->{
          System.out.println(value);
      });
    }
    public void saveUser(User user){
        this.db.put(user.getId(),user);
        System.out.println("user saved:" + " " +  user.getName() + " " + user.getAge());
    }
    public void getUserById(UUID id){
        System.out.println("user found:" + " " + db.get(id));
    }

    public void updateUser(UUID id,User user){
        db.put(id,user);

        System.out.println("user updated");



    }
    public void deleteUser(UUID id){
        db.remove(id);
        System.out.println("user deleted");

    }
}
