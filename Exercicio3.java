public class Exercicio3 {
    public static double somarFracao(int n) {
        if (n == 1) {
            System.out.println("parou aqui");
            return 1;
        }
        return 1.0 / n + somarFracao(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Resultado final: " + somarFracao(5)); // Exemplo: 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.283333333333333
    }
}
