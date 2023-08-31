package numero_Primo;

public class VerificaNumeroPrimo {
    
    // Método para verificar se um número é primo
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // 0 e 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Não é primo, pois é divisível por um número diferente de 1 e ele mesmo.
            }
        }
        
        return 1; // É primo
    }
    
    public static void main(String[] args) {
        Integer numero = 17; // Altere o número que você deseja verificar aqui
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
