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
		
		figure = loadStrings("../resources/TXT.txt");
		words = new ArrayList<String>();
		
		for (int i = 0; i < figure.length; i++) {
			String [] tempArray = figure[i].split("\\r\\n|\\n|\\r");
			
			for (int j = 0; j < tempArray.length; j++) {
				words.add(tempArray[j]);
			}
		}

		for (String element : words) {
			System.out.println(element);
		}
	}
	
	public void draw() {
		background(0);
		
		figuredraw.drawCircle();
		figuredraw.drawSquare();
		
		
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
	}
	
	public void mousePressed() {
		
		int generate = (int) random (0,2);
		
		switch (generate) {
		case 1:
			
			randomfigure=generate;
			
			break;
			
		case 2:
			
			randomfigure=generate;
			
			break;

		default:
			break;
		}
	}

}
