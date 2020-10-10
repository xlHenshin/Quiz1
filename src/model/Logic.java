package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic extends PApplet {
	
	PApplet app;
	Figure circle;
	Figure square;
	ArrayList<Figure> figure;
		
	public Logic(PApplet app) {
		
		figure = new ArrayList<Figure>();
		this.app = app;
		
	}
	
	public void drawCircle() {
		
		int tam = (int) random(30,80);
		int posX = (int) random(10,690);
		int posY = (int) random(40,690);
		int dir;
		int r= (int) random (0,255);
		int g= (int) random (0,255);
		int b= (int) random (0,255);
		circle = new Circle(tam, posX, posY, 1, r, g, b, app);
		circle.drawFigure();
	}
	
	public void drawSquare() {
		
		int tam = (int) random(30,80);
		int posX = (int) random(10,690);
		int posY = (int) random(40,690);
		int dir;
		int r= (int) random (0,255);
		int g= (int) random (0,255);
		int b= (int) random (0,255);
		square = new Square(tam, posX, posY, 1, r, g, b, app);
		square.drawFigure();
	}
	
}
