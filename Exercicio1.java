    public class Exercicio1 {
        public static int multiplicar(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return a + multiplicar(a, b - 1);
        }
        public static void main(String[] args) {
            System.out.println(multiplicar(4, 6)); // Exemplo: 4 * 6 = 24
        }
    }

