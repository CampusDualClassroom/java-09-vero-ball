package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        int num = 8;
        doWhileLoop(num);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        String txt = "";
        int x = 0;
        do {
            txt = "Entra con valor: " + x;
            x++;
            txt = txt + ", sale con valor: " + x;
            System.out.println(txt);
        } while(x < num);
    }
}