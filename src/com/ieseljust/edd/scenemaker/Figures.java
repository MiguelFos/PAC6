package com.ieseljust.edd.scenemaker;
//package figures;

import java.awt.Graphics;
import java.awt.Color;

//import com.ieseljust.edd.scenemaker.Renderizable;

public class Figures implements Renderizable{
    /*
     * Aquesta classe representa un element gràfic de tipus rectangle
     */

    protected Integer x;
    protected Integer y;
    protected Color color;
    protected Integer width;
    protected Integer height;

    // Constructors

    protected Figures() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 0;
        this.width = 100;
        this.height = 100;
        this.color = Color.BLACK;
    }

    protected Figures(int x, int y) {
        // Constructor on s'especifica només pa posició
        this.x = x;
        this.y = y;
        this.width = 100;
        this.height = 100;
        this.color = Color.BLACK;
    }
    

    protected Figures(int x, int y, Color color) {
        // Constructor on s'especifica la posició i el color
        this.x = x;
        this.y = y;
        this.width = 100;
        this.height = 100;
        this.color = color;
    }
    
    protected Figures(int x, int y, int width, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = width;
        this.color = color;
    }

    protected Figures(int x, int y, int width, int height, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Mètode Accessors

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("figura " + x + " " + y + " " + width + " " + height + " " + color);
    };

    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);             // Establim el color interior
        //g.fillRect(x, y, width, height);    // Dibuixem un rectangle en la posició i mida indicades
    };

}
