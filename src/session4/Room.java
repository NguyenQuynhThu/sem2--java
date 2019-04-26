package session4;

import session3.User;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

//Viết 1 class Room gồm các thuộc tính: Tên phòng, vị trí, danh sách người dùng
public class Room {
    public String roomName;
    public String location;
    public ArrayList <User> userList;

    public Room(){
    }

    public Room(String roomName, String location){
        this.roomName = roomName;
        this.location = location;
        this.userList = new ArrayList<>();
    }

    public void addUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        ArrayList<String> stringList = new ArrayList<>();
        for (int i=0; i<3; i++){
            System.out.println("Picturer URL: ");
            stringList.add(scanner.nextLine());
        }

        User user = new User(id, name, email, password);
        user.gallery = stringList;

        userList.add(user);
    }

    public void removeUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove ID: ");
        int id = scanner.nextInt();
        for (int i=0; i<userList.size(); i++){
            if(userList.get(i).id == id){
                userList.remove(i);
            }
        }

        //remove bang name
        String name = scanner.nextLine();
        for (int i=0; i<userList.size(); i++){
            if(userList.get(i).name.equals(name)){
                userList.remove(i);
            }
        }

    }

    public void displayRoomInfo(){
        System.out.println("Room name: " +roomName);
        System.out.println("Room location: " +location);
        System.out.println("User list: ");

        for (User u: userList){
            System.out.println("ID: "+u.id);
            System.out.println("Name: "+u.name);
            System.out.println("Email: "+u.email);
            System.out.println("Password: "+u.password);

            System.out.println("--------------------");
        }
    }

}

