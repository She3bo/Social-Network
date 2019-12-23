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
                System.out.print("\nPassword : ");
                String password = sc.next();
                user.login(email, password);
            } else {
                return;
            }
        }

    }

}
