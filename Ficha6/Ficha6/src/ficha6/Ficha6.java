package ficha6;

import enums.Origem;
import enums.Tamanho;

/**
 *
 * @author joaoc
 */
public class Ficha6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingrediente queijo = new Ingrediente(1, "Queijo", Origem.ANIMAL, 100);
        Ingrediente bacon = new Ingrediente(2, "Bacon", Origem.ANIMAL, 100);
        Ingrediente tomate = new Ingrediente(3, "Tomate", Origem.VEGETAL, 100);
        Ingrediente fiambre = new Ingrediente(4, "fiambre", Origem.ANIMAL, 100);
        Ingrediente ananas = new Ingrediente(5, "Ananás", Origem.VEGETAL, 100);
        Ingrediente sal = new Ingrediente(6, "Sal", Origem.MINERAL, 20);
        Ingrediente ing5 = new Ingrediente(7, "Ananás", Origem.VEGETAL, 20);
        
        
        Pizza pizza1 = new Pizza(1, "Pizza da casa", "Pizza muito boa", 5.90f, Tamanho.BIG);
        pizza1.adicionarIngrediente(bacon);
        pizza1.adicionarIngrediente(queijo);
        pizza1.adicionarIngrediente(tomate);
        pizza1.adicionarIngrediente(fiambre);
        pizza1.adicionarIngrediente(sal);
        //pizza1.removerIngrediente(3);
        System.out.println(pizza1.imprimirIngrediente());
        System.out.println("Ingredientes Animal: " + pizza1.findOrigemIngredients(Origem.ANIMAL));
        
        
        Pizza pizza2 = new Pizza(2, "Pizza Romana", "Pizza caseira", 6.50f, Tamanho.MEDIUM);
        pizza2.adicionarIngrediente(queijo);
        pizza2.adicionarIngrediente(bacon);
        pizza2.adicionarIngrediente(tomate);
        pizza2.removerIngrediente(queijo);
        System.out.println(pizza2.imprimirIngrediente());
        
        
        Ementa ementa1 = new Ementa("Ementa do dia", 1, "09/04/2021", "19/04/2021");
        ementa1.addPizza(pizza1);
        ementa1.addPizza(pizza2);
        //ementa1.removerPizza(2);
        System.out.println(ementa1.imprimirPizza());
        
        
        System.out.println("Pizza 1: \n" + pizza1.totalCalorias());
        System.out.println("Pizza 2: \n" + pizza2.totalCalorias());
        //System.out.println("Nº de Ingredientes de origem vegetal: " + pizza2.findVegetalIngredients());
        System.out.println(ementa1.countPizzaSize(Tamanho.SMALL));
    }    
}
