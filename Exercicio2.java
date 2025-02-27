public class Exercicio2 {
    public static int somar(int a, int b) {
        if (b == 0) {
            return a;
        }
        return somar(a + 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(somar(3, 2));
    }
}
