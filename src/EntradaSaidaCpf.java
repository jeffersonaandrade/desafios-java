import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class EntradaSaidaCpf {

    private static final String SEPARADOR_CPF = "[.\\-]";

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Arrays.stream(getCPFInSeparatedStrings(new Scanner(System.in).nextLine())).forEach(System.out::println);
    }

    public static String[] getCPFInSeparatedStrings(String cpfWithSpecialChars) {
        return cpfWithSpecialChars.split(SEPARADOR_CPF);
    }
}
