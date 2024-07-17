package Db;

import User.User;

import java.util.HashMap;
import java.util.UUID;

public class MemoryDB implements IMemoryDB {
    HashMap<UUID,User> instanceDB = new HashMap();


    public HashMap db(){
        return this.instanceDB;
    };
}
