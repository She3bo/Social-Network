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
    public ArrayList<User> friends = new ArrayList<>();
    public ArrayList<User> friendRequests = new ArrayList<>();
    public Post p;
    public Group myGroup;
    public Vector myMessage;
    public Vector n;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static User user = new User();

    public String signUp(String name , String pass , String mail , boolean gender) {
        String s = "";
        user = new User();
        user.name = name;
        user.password = pass;
        user.mail = mail;
        user.gender = gender;
        if(pass==""){
            s="password must contain any charcter";
        }
        if(!mail.contains("@")){
            s = "enter valid Email";
        }
        for(int i=0;i<users.size();++i){
            if(mail.equals(users.get(i).mail)){
                s = "this mail is alrdy token";
            }
        }

       if(s==""){
         users.add(user);
       }
        return s;
    }

    public boolean login(String mail, String password) {
        int i;
        for(i=0;i<users.size();++i){
            if(mail.equals(users.get(i).mail) && password.equals(users.get(i).password)){
                System.out.println("Welcome " + users.get(i).name);
                return true;
            }
        }
        return false;
    }

    public Boolean areFriends(int ID) {
        return null;
    }

    public void findFriends(User user , String name) {
        for(int i=0;i<users.size();++i){
            if(name.equals(users.get(i).name)){
                System.out.println("User Found!\n 1 - send frind");
                int c = sc.nextInt();
                if(c==1){
                    users.get(i).friendRequests.add(user);
                    System.out.println("sender : " + user.mail);
                    System.out.println("reciver : " + users.get(i).mail);
                }
                break;
            }
        }
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
