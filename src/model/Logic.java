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
		
		int tam = (int) random(30,80);
		int posX = (int) random(10,690);
		int posY = (int) random(40,690);
		int dir=1;
		int r= (int) random (0,255);
		int g= (int) random (0,255);
		int b= (int) random (0,255);
		circle = new Circle(tam, posX, posY, 1, r, g, b, app);
		figure.add(new Circle(tam, posX, posY, dir, r, g, b, this));
		System.out.println(figure);
		circle.drawFigure();
	}
	
	public void drawSquare() {
		
		int tam = (int) random(30,80);
		int posX = (int) random(10,690);
		int posY = (int) random(40,690);
		int dir=1;
		int r= (int) random (0,255);
		int g= (int) random (0,255);
		int b= (int) random (0,255);
		square = new Square(tam, posX, posY, dir, r, g, b, app);
		figure.add(new Square(tam, posX, posY, dir, r, g, b, this));
		System.out.println(figure);
		square.drawFigure();
	}
	
}
