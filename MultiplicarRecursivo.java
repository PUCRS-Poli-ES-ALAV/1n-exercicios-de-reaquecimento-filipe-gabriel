    public class MultiplicarRecursivo {
        public static int multiplicar(int a, int b) {
            if (b == 0) {
                return 0;
            }
            int resultado = a + multiplicar(a, b - 1);
            return resultado;
        }
        public static void main(String[] args) {
            System.out.println("Resultado final: " + multiplicar(4, 6)); // Exemplo: 4 * 6 = 24
        }
    }

