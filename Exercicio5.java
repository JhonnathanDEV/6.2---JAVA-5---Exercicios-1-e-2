package pratica_6_2_exercicio_1_5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int codigo, quantidade;
        String produto = "";
        double preco = 0;

        System.out.print("Código do Produto: ");
        codigo = leia.nextInt();

        System.out.print("Quantidade: ");
        quantidade = leia.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;

            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;

            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;

            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;

            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;

            case 6:
                produto = "Suco de Laranja";
                preco = 13.00;
                break;

            default:
                System.out.println("Código inválido!");
                return;
        }

        double total = quantidade * preco;

        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f%n", total);

        leia.close();
    }
}
