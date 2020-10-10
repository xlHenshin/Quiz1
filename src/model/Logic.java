package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic extends PApplet {
	
	PApplet app;
	Figure circle;
	Figure square;
	ArrayList<Figure> figure;
	String [] figures;
	ArrayList <String> words;
		
	public Logic(PApplet app) {
		
		figure = new ArrayList<Figure>();
		this.app = app;
		circle = new Circle(50, 50, 50, 1, 255, 0, 255, app);
		square = new Square(50, 50, 50, 1, 255, 0, 255, app);
		
		figures = app.loadStrings("../resources/TXT.txt");
		words = new ArrayList<String>();
		
		for (int i = 0; i < figures.length; i++) {
			String [] tempArray = figures[i].split("\\r\\n|\\n|\\r");
			
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
			}
		}

		for (String element : words) {
			System.out.println(element);
		}
		
		
	}
	
	public void drawCircle() {

		circle.drawFigure();
	}
	
	public void drawSquare() {

		square.drawFigure();
	}
	
	public void randomFig() {
		for (int i = 0; i < figure.size(); i++) {
            figure.get(i).drawFigure();
            //figure.get(i).moveAlt();
        }
	}
	
	public void setup() {
		
		int generate = (int) random (0,2);
		int tam = (int) random(30,80);
		int posX = (int) random(10,690);
		int posY = (int) random(40,690);
		int dir=1;
		int r= (int) random (0,255);
		int g= (int) random (0,255);
		int b= (int) random (0,255);
		
		switch (generate) {
		case 0:
			
			figure.add(new Circle(tam, posX, posY, dir, r, g, b, app));
			
			break;
		
		case 1:
			
			figure.add(new Square(tam, posX, posY, dir, r, g, b, app));
			
			break;
			
		}
		
	}
	
}
