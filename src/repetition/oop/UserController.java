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
                name,
                lastame,
                email,
                phone,
                login,
                password);
        users_table[index] = u;
        index++;
        System.out.println("Pomyślnie zarejestrowano: \n"+u);
    }
    // wypisania wszystków użytkowników
    public void getAllUsers(){
        System.out.println("LISTA UŻYTKOWNIKÓW");
        for(int i = 0; i < index; i++){
            System.out.println(users_table[i]);
        }
    }

}
