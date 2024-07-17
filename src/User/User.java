package User;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;


    public User(UUID id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public UUID getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
