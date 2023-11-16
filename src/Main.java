/*Primo esercizio:
Scrivere un programma che inizializzi una
variabile square con un rettangolo il cui
angolo superiore sinistro abbia coordinate
(10,20) ed i cui lati abbiano lunghezza 40.
Sostituire poi il contenuto di square con
un rettangolo avente le stesse dimensioni
ma angolo superiore sinistro posizionato
nel punto (20,20).*/

/*Secondo esercizio:
Scrivere un programma che istanzi un
oggetto Rectangle e lo stampi. Poi,
modificare il programma in modo che sposti
il rettangolo stampato prima e lo stampi
per altre 3 volte in modo che, se i 4
rettangoli stampati fossero disegnati,
formerebbero un unico grande rettangolo
*/

/*
Terzo esercizio:
Scrivere un programma che istanzi un
oggetto Rectangle e ne calcoli l’area e il
perimetro. Visualizzare i risultati.
*/

import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        //Primo esercizio
        Rectangle square = new Rectangle(10, 20, 40, 40);
        Rectangle box = square;
        square.translate(10, 0);
        System.out.println("Ascissa: "+box.getX());
        System.out.println("Ordinata: "+box.getY());
        //Secondo esercizio (vedi rettangolo grande documentazione)
        Rectangle box2 = new Rectangle(0, 0, 40, 20);
        //stampa default
        System.out.println("Expected x:0, y:0"+box2);
        //seconda stampa
        box2.translate(40, 0);
        System.out.println("Expected x:40, y:0"+box2);
        //terza stampa
        box2.translate(0, -20);
        System.out.println("Expected x:40, y:-20"+box2);
        //ultima stampa
        box2.translate(-40, 0);
        System.out.println("Expected x:0, y:-20"+box2);
        //Terzo esercizio
        Rectangle box3 = new Rectangle(0, 0, 30, 25);
        int area = (int)(box3.getHeight()*box3.getWidth());
        System.out.println("L'area del rettangolo è "+area);
    }
}