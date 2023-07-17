import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor numérico:");
        n = ler.nextInt();
        System.out.println("O valor numérico digitado foi: " + n);

        Integer n2 = n;
        System.out.println("O valor de n2 é: " + n2);
    }
}