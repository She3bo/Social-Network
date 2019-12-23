package social.network;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class User {

    public String name;
    public String password;
    public String mail;
    public Boolean gender;

    public List messages;
    public List friendsIDs;
    public Post p;
    public Group myGroup;
    public Vector myMessage;
    public Vector n;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static User user = new User();

    public void signUp() {
        System.out.print("Name : ");
        user.name = sc.next();

        System.out.print("Password : ");
        user.password = sc.next();

        System.out.print("Email : ");
        user.mail = sc.next();

        System.out.print("Gender : \n 1- male \t 2- female");
        Integer c = sc.nextInt();
        
        user.gender = c.equals(1) ? true : false;

        users.add(user);

    }

    public void login(String mail, String password) {
        int i;
        for(i=0;i<users.size();++i){
            if(mail.equals(users.get(i).mail) && password.equals(users.get(i).password)){
                System.out.println("Welcome " + users.get(i).name);
                break;
            }
        }
        if(i==users.size()){
            System.out.println("Your Email or Paswword isn't coorect");
        }
    }

    public Boolean areFriends(int ID) {
        return null;
    }

    public List findFriends(String name) {
        return null;
    }

    public void logOut() {
    }

    public void viewProfile() {
    }

    public List checkNewMessages() {
        return null;
    }

    public void createPage(String pageName) {
    }

    public void createGroup(String groupName) {
    }

}
