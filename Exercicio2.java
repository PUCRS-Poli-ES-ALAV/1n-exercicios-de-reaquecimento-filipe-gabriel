public class Exercicio2 {
    public static int somar(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("Incrementando: " + a + " + 1");
        return somar(a + 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println("Resultado final: " + somar(3, 2)); // Exemplo: 3 + 2 = 5
    }
}
