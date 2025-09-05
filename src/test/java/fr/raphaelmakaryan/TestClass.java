package fr.raphaelmakaryan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class TestClass {

    private int a = 10;
    private int b = 8;

    @Test
    @DisplayName("Test d'affiche")
    void testAddition() {
        Calculator calculator = new Calculator();
        System.out.println("Test de la fonction : Addition");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        int calcul = calculator.addition(this.a, this.b);
        Assertions.assertEquals(18, calcul);
    }

    @Test
    void testSoustraction() {
        Calculator calculator = new Calculator();
        System.out.println("Test de la fonction : Soustraction");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        int calcul = calculator.soustraction(this.a, this.b);
        Assertions.assertEquals(2, calcul);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        System.out.println("Test de la fonction : Multiplication");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        int calcul = calculator.multiplication(this.a, this.b);
        Assertions.assertEquals(80, calcul);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        System.out.println("Test de la fonction : Division");
        System.out.println("Valeur A : " + this.a + " | Valeur B : " + this.b);
        double calcul = calculator.division(this.a, this.b);
        Assertions.assertEquals(1.25, calcul);
        //1.25
    }

}
