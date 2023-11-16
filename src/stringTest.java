import java.io.PrintStream;

public class stringTest {
    public static void main(String[] args) {
        PrintStream output = System.out;
        String s = "helloworld";
        output.println(s.charAt(s.length()/2));
        //se volessi fare l'upper e il lower case print dovrei farlo su due righe diverse
        output.println(s.replace("world", "universe").toUpperCase());
        String primaParte = s.substring(0, s.length()/2);
        String secondaParte = s.substring(s.length()/2);
        output.println(primaParte);
        output.println(secondaParte);
        //il + autorizza il concatenamento di stringhe implicito
        output.println("La stringa concatenata è "+primaParte+secondaParte);
        /*terzo esercizio, Scrivere un programma che scambi
        tra loro le lettere ”e” ed “o” in una
        stringa usando ripetutamente il
        metodo replace.*/
        String S = "Hello, World!";
        System.out.println("La stringa "+S+" è stata rimpiazzata da "
                //divido He dal resto della stringa per poter rimpiazzare la e con la o
                +S.substring(0, 2).replace("e", "o")
                //rimpiazzo le o della restante parte della stringa con delle e
                +S.substring(2).replace("o", "e"));
    }
}