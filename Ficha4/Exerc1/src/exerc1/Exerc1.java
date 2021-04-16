package exerc1;

import pp_fp04.exchange.CurrencyRates;

/**
 *
 * @author joaoc
 */
public class Exerc1 {

    /**
     * @param args the command line arguments
     */

    //static User user2;
    
    public static void main(String[] args) {
        User user1 = null;
        User user2 = null;
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','e','s','t','g','.','i','p','p','.','p','t'};
        
        user1.despesa.carValues[0] = 25.99;
        user1.despesa.foodValues[0] = 16.00;
        
        
        user1.despesa.carValues[5] = 20.00;
        user1.despesa.foodValues[5] = 8.00;
        
        user1.despesa.number1 = 2;
        user1.despesa.number2 = 2;
        
        user2.id2[0] = 'J';
        user2.id2[1] = 'C';
        user2.id2[2] = 'L';
        user2.name2 = new char[]{'J','o','ã','o'};
        user2.email2 = new char[]{'j','c','l','@','e','s','t','g','.','i','p','p','.','p','t'};
        
        float somaCarro = 0;
        float somaComida = 0;
        double valorDolar = CurrencyRates.TaxaConv[1][0];
        double valorIene = CurrencyRates.TaxaConv[1][2];
        double valorGBP = CurrencyRates.TaxaConv[1][3];
        
        
        for (int i = 0; i < user1.despesa.carValues.length; i++) {
            if (user1.despesa.carValues[i] != 0) {
                somaCarro += user1.despesa.carValues[i];
            }
        }
        
        
        for (int i = 0; i < user1.despesa.foodValues.length; i++) {
            if (user1.despesa.foodValues[i] != 0) {
                somaComida += user1.despesa.foodValues[i];
            }
        }
        
        float mediaCarro = (somaCarro / user1.despesa.number1);
        float mediaComida = (somaComida / user1.despesa.number2);
        
        System.out.println("-----User 1-----");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        System.out.print("Despesas Automóvel: ");
        System.out.printf("%.2f euros\n", somaCarro);
        System.out.print("Despesas Comida: ");
        System.out.printf("%.2f euros\n", somaComida);
        System.out.print("Total Gasto: ");
        System.out.printf("%.2f euros\n", (somaCarro + somaComida));
        System.out.printf("Valor médio gasto com o carro: %.2f euros\n", mediaCarro);
        System.out.printf("Valor médio gasto com comida: %.2f euros\n", mediaComida);
        
        System.out.println("");
        System.out.println("******** Conversão *********");
        System.out.printf("Total Gasto convertido para dólares: %.2f Dólares\n", (somaCarro + somaComida) * valorDolar);
        System.out.printf("Total Gasto convertido para Iénes: %.2f Ienes\n", (somaCarro + somaComida) * valorIene);
        System.out.printf("Total Gasto convertido para GBP: %.2f Libras\n", (somaCarro + somaComida) * valorGBP);
        
        System.out.println("");
        System.out.println("******** Conversão do valor médio gasto com o carro*********");
        System.out.printf("Total Gasto convertido para dólares: %.2f Dólares\n", mediaCarro * valorDolar);
        System.out.printf("Total Gasto convertido para Iénes: %.2f Ienes\n", mediaCarro * valorIene);
        System.out.printf("Total Gasto convertido para GBP: %.2f Libras\n", mediaCarro * valorGBP);
        
        System.out.println("");
        System.out.println("******** Conversão do valor médio gasto com comida*********");
        System.out.printf("Total Gasto convertido para dólares: %.2f Dólares\n", mediaComida * valorDolar);
        System.out.printf("Total Gasto convertido para Iénes: %.2f Ienes\n", mediaComida * valorIene);
        System.out.printf("Total Gasto convertido para GBP: %.2f Libras\n", mediaComida * valorGBP);
        
        
        System.out.println("-----User 2-----");
        System.out.print("ID: ");
        System.out.println(user2.id2);
        System.out.print("Name: ");
        System.out.println(user2.name2);
        System.out.print("Email: ");
        System.out.println(user2.email2);
    }   
}
