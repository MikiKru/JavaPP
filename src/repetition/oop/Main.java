package repetition.oop;

public class Main {
    public static void main(String[] args) {
        UserController uc = new UserController();
        // dodawanie użytkowników do listy
        uc.addUser("Michał","Kruczkowski",
                "mk@mk.pl","32213321",
                "mk","mk");
        uc.addUser("Anna","Nowak",
                "an@an.pl", "2212233211",
                "an","an");
        // wywołanie metody zwracającej wszystkich użytkowników
        uc.getAllUsers();
    }
}
