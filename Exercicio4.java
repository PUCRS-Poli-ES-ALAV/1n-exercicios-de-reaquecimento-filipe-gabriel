// Inversão de uma string.
public class Exercicio4 {
    public static String inverter(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return s.charAt(s.length() - 1) + inverter(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(inverter("Gabriel"));
    }
}
