package repetition;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        String sentence = "Used to restrict the output depending on the conversion";
        // podział napisu względem ustalonego separatora
        String[] words = sentence.split(" ");
        // wypisanie elementów tablicy
        // foreach - typ_komórki nazwa_pomocnicza_obiektu : sekwencja
        for (String word : words) {
            // operacje podniwsienia liter do wielkich i odczytu długości napisu
            System.out.printf("%10s %10s %5d \n", word, word.toUpperCase(), word.length());
        }
        // wyszukiwanie znaku na ostatniej pozycji
        // wyszukaj słowa, które kończą się na E
        System.out.println("Słowa kończące się na e");
        for (String word : words) {
            if (word.toUpperCase().endsWith("E")) {
                System.out.println(word);
            }
        }
        System.out.println("Słowa z przedostatnim znakiem = \"O\"");
        for (String word : words) {
            if (word.toUpperCase().charAt(word.length() - 2) == 'O') {
                System.out.println(word);
            }
        }
        String login;
        String password;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String permission = null;
        // login.equals("admin")  -> ==
        // !login.equals("admin") -> !=
        while (count <= 3) {
            System.out.println("Podaj login i hasło");
            login = sc.nextLine();
            password = sc.nextLine();
            if (login.equals("admin") && password.equals("admin")) {
                permission = "ROLE_ADMIN";
                System.out.printf("login:%s | password:%s | permission:%s", login, password, permission);
                break;
            } else if (login.equals("user") && password.equals("user")) {
                permission = "ROLE_USER";
                System.out.printf("login:%s | password:%s | permission:%s", login, password, permission);
                break;
            } else {
                System.out.println("Błąd logowania!");
                count++;
            }
        }


    }
}
