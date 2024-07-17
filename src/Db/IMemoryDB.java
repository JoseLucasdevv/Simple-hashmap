package Db;

import User.User;

import java.util.HashMap;
import java.util.UUID;

public interface IMemoryDB {
     HashMap<UUID, User> db = new HashMap();

     public HashMap db();
}
