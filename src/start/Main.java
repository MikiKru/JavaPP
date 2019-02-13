package start;

import start.user.User;

import java.util.Date;

public class Main {



    public static void main(String[] args) {
//        Main o1 = new Main();
        User user1 = new User();
//        user1.login;
        user1.setLogin("michal");
        System.out.println(user1.getLogin());
    }
}
