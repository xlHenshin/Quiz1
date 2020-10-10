package view;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet{

	FigureDraw figuredraw;
	
	String [] figure;
	ArrayList <String> words;
	
	int randomfigure;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		
		figuredraw = new FigureDraw(this);
		randomfigure=0;
	
	}
	
	public void draw() {
		background(0);
		
		switch (randomfigure) {
		case 1:
			figuredraw.drawCircle();
			randomfigure=0;
			break;
			
		case 2:
			figuredraw.drawSquare();
			randomfigure=0;
			break;

		default:
			break;
		}
		
		//figuredraw.drawCircle();
		//figuredraw.drawSquare();
		
		
	}
	
	public void mouseClicked() {
		
		int generate = (int) random (0,3);
		
		switch (generate) {
		
		case 1:
			
			randomfigure=1;
			break;
			
		case 2:
			
			randomfigure=2;
			break;
			
		default:
			break;
		}
	}

}
