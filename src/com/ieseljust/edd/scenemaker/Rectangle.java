package com.ieseljust.edd.scenemaker;
//package figures;

import java.awt.Graphics;
import java.awt.Color;

//import com.ieseljust.edd.scenemaker.Renderizable;

public class Rectangle extends Figures{
    /*
     * Aquesta classe representa un element gràfic de tipus rectangle
     */

    //Constructor

    public Rectangle(int x, int y, int width, int height, Color color) {

        super(x, y, width, height, color);
    };

    // Mètode Accessors
    @Override
    public void describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        System.out.println("rectangle " + x + " " + y + " " + width + " " + height + " " + color);
    }

    @Override
    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);             // Establim el color interior
        g.fillRect(x, y, width, height);    // Dibuixem un rectangle en la posició i mida indicades
    };

}
