/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.network;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ahmed
 */
public class UserNGTest {
    
    public UserNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of signUp method, of class User.
     */
    @Test
    public void testEmptyPassword() {
        System.out.println("Test Empty Password");
        User instance = new User();
        instance.signUp("ahmed","C","ahmed@gmail.com",true);
        assertEquals(instance.signUp("ahmed","","axse@gmail.com",true),"password must contain any charcter");
    }
        @Test
    public void testnotValidEmail() {
        System.out.println("Test Not valid Email");
        User instance = new User();
       // instance.signUp("ahmed","C","ahmed.com",true);
        assertEquals(instance.signUp("ahmed","x","axse",true),"enter valid Email");
    }
            @Test
    public void testdoubledEmail() {
        System.out.println("Test Double Email");
        User instance = new User();
       // instance.signUp("ahmed","C","ahmed.com",true);
        assertEquals(instance.signUp("ahmed","x","ahmed@gmail.co",true),"this mail is alrdy token");
    }

//    /**
//     * Test of login method, of class User.
//     */
//    @Test
//    public void testLogin() {
//        System.out.println("login");
//        String mail = "";
//        String password = "";
//        User instance = new User();
//        boolean expResult = false;
//        boolean result = instance.login(mail, password);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of areFriends method, of class User.
//     */
//    @Test
//    public void testAreFriends() {
//        System.out.println("areFriends");
//        int ID = 0;
//        User instance = new User();
//        Boolean expResult = null;
//        Boolean result = instance.areFriends(ID);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findFriends method, of class User.
//     */
//    @Test
//    public void testFindFriends() {
//        System.out.println("findFriends");
//        String name = "";
//        User instance = new User();
//        List expResult = null;
//        List result = instance.findFriends(name);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of logOut method, of class User.
//     */
//    @Test
//    public void testLogOut() {
//        System.out.println("logOut");
//        User instance = new User();
//        instance.logOut();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of viewProfile method, of class User.
//     */
//    @Test
//    public void testViewProfile() {
//        System.out.println("viewProfile");
//        User instance = new User();
//        instance.viewProfile();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkNewMessages method, of class User.
//     */
//    @Test
//    public void testCheckNewMessages() {
//        System.out.println("checkNewMessages");
//        User instance = new User();
//        List expResult = null;
//        List result = instance.checkNewMessages();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createPage method, of class User.
//     */
//    @Test
//    public void testCreatePage() {
//        System.out.println("createPage");
//        String pageName = "";
//        User instance = new User();
//        instance.createPage(pageName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createGroup method, of class User.
//     */
//    @Test
//    public void testCreateGroup() {
//        System.out.println("createGroup");
//        String groupName = "";
//        User instance = new User();
//        instance.createGroup(groupName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
