package repetition;

public class Types {
    public static void main(String[] args) {
        // typy proste
        int year = 2_000;
        char flag = 'A';
        double salary = 8999.955439;
        boolean decision = true;


        System.out.println(year / 3);           // int / int = int
        // konwersja -> rozszerzająca
        System.out.println("Konwersja rozszerzająca: "+ (double)year / 3);   // double / int = double
        System.out.println(year / 3.);          // int / double = double

        // konwersja -> zawężająca
        System.out.println("Konwersja zawężająca: "+ (int) salary);
//        salary = (int) salary;
        System.out.println("Warotść oryginalna:" + salary);
        // zaokrąglanie
        System.out.printf("%d | %c | %.2f | %s \n", year, flag, salary, decision);

        // opearcje na znakach
        System.out.println(flag + 10);
        System.out.println((char)(flag + 10));



    }
}
