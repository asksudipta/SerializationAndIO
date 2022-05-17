package Serialization;

import java.io.*;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        AppUser aapuser=new AppUser(1,"Nilen","nillen@test.com","12345");
        try (ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("user.ser"))){
            out.writeObject(aapuser);

        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("user.ser"))){
            AppUser deserialize=(AppUser) in.readObject();

            System.out.println("User Id :"+deserialize.getUserId());
            System.out.println("Email :"+deserialize.getEmail());
            System.out.println("Name :"+deserialize.getName());
            System.out.println("Password :"+deserialize.getPassword());

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
