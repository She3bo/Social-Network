package social.network;

import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("            Welcome!                ");
        User user = new User();
        while (true) {
            System.out.println("1- SignUp \n2- login \n3- exit");
            int c = sc.nextInt();
            if (c == 1) {
                user = new User();
                user.signUp();
            } else if (c == 2) {
                System.out.print("Email : ");
                String email = sc.next();
                System.out.print("Password : ");
                String password = sc.next();
                if (user.login(email, password)) {
                    // search for user to add to his frind list if he is not frind 
                    System.out.println(" 1 - Search for user \n 2 - show frind requests \n 3 - upgrade to Premium subscription ");
                    c = sc.nextInt();
                    if (c == 1) {
                       System.out.print("Enater User Name : ");
                       String name = sc.next();
                       //user.findFriends(name);
                    } else if (c == 2) {
                        System.out.println(user.friendRequests);
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
