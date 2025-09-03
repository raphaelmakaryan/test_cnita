package fr.raphaelmakaryan;

import org.junit.jupiter.api.Test;

class TestClass {

    private int a = 10;
    private int b = 8;


    @Test
    public void testAddition() {
        System.out.println("Test de la fonction : Addition");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        System.out.println(new Calculator().addition(this.a, this.b));
    }

    @Test
    public void testSoustraction() {
        System.out.println("Test de la fonction : Soustraction");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        System.out.println(new Calculator().soustraction(this.a, this.b));
    }

    @Test
    public void testMultiplication() {
        System.out.println("Test de la fonction : Multiplication");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        System.out.println(new Calculator().multiplication(this.a, this.b));
    }

    @Test
    public void testDivision() {
        System.out.println("Test de la fonction : Division");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        System.out.println(new Calculator().division(this.a, this.b));
    }

}
