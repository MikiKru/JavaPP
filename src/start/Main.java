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
        System.out.println(user1);

        User user2 = new User(
                "tiger",
                "qwe321",
                10000.50,
                true,
                new Date(2000,01,04));

        System.out.println(user2);
    }

}
