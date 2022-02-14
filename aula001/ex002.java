package aula001;
import java.util.*;

public class ex002 {
    public static void main(String[] args) {
        System.out.print("Seu sistema está em ");
        Locale local = Locale.getDefault();
        System.out.print(local.getDisplayLanguage());
        System.out.print(" - ");
        System.out.println(local.getLanguage());
    }
}
