package repetition.oop;

public class UserController {
    // deklaracja tablicy użytkowników
    User users_table [] = new User[100];
    int index = 0;
    // dodawanie użytkownika do tablicy
    public void addUser(String name,
                        String lastame,
                        String email,
                        String phone,
                        String login,
                        String password){
        User u = new User(
                "Michał",
                "Kruczkowski",
                "mk@mk.pl",
                "123456654",
                "mk",
                "mk");
        users_table[index] = u;
        index++;
        System.out.println("Pomyślnie zarejestrowano: \n"+u);
    }

}
