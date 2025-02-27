// Gerador da sequência dada por:
//F(1) = 1
//F(2) = 2
//F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
public class Exercicio5 {
    public static int gerarSequencia(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return 2 * gerarSequencia(n - 1) + 3 * gerarSequencia(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("F(" + n + ") = " + gerarSequencia(n));
    }
}
