package social.network;

import java.util.Scanner;
import sun.security.util.Password;

/**
 *
 * @author Ahmed
 */
public class SocialNetwork {

    static User user = new User();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("            Welcome!                ");
        while (true) {
            user = new User();
            System.out.println("1- SignUp \n2- login \n3- exit");
            int c = sc.nextInt();
            if (c == 1) {
                String name, password, mail;
                Boolean gender;

                System.out.print("Name : ");
                name = sc.next();

                System.out.print("Password : ");
                password = sc.next();

                System.out.print("Email : ");
                mail = sc.next();

                System.out.print(
                        "Gender : \n 1- male \t 2- female\n");
                Integer ch = sc.nextInt();

                gender = ch.equals(1) ? true : false;

                user.signUp(name, password, mail, gender);
            } else if (c == 2) {
                user = new User();
                System.out.print("Email : ");
                String email = sc.next();
                System.out.print("Password : ");
                String password = sc.next();
                if (user.login(email, password)) {
                    for (int i = 0; i < user.users.size(); ++i) {
                        if (email.equals(user.users.get(i).mail)) {
                            user = user.users.get(i);
                            //System.out.println(user.mail);
                            break;
                        }
                    }
                    // search for user to add to his frind list if he is not frind 
                    System.out.println(" 1 - Search for user \n 2 - show frind requests \n 3 - upgrade to Premium subscription ");
                    c = sc.nextInt();
                    if (c == 1) {
                        System.out.print("Enater User Name : ");
                        String name = sc.next();
                        //System.out.println("user form main :" + user.name);
                        user.findFriends(user, name);
                    } else if (c == 2) {
                        // for(int i=0;i<user.friendRequests.size();++i)
                        //System.out.println("user form main :" + user.name);
                        System.out.println("You have friend request from : " + user.friendRequests.get(0).mail);
                        System.out.println("1 - accept frind \t  2 - delet frind request");
                        int z = sc.nextInt();
                        if (z == 1) {
                            user.friends.add(user.friendRequests.get(0));
                            user.friendRequests.remove(0);
                        }else if(z==2){
                            user.friendRequests.remove(0);
                        }
                        System.out.println(user.name + " you have frinds " +user.friends.get(0).mail);
                    } else if (c == 3) {

                    } else {
                        System.out.println("Whoops! you should enter 1 or 2 or 3");
                    }
                } else {
                    System.out.println("Sorry! Your email or password isn't coorect. try again");
                }

            } else if (c == 3) {
                return;
            } else {
                System.out.println("Whoops! you should enter 1 or 2 or 3");
            }
        }

    }

}
