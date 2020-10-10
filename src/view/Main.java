package view;

import processing.core.PApplet;

public class Main extends PApplet{

	FigureDraw figuredraw;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		figuredraw = new FigureDraw(this);
		
	}
	
	public void draw() {
			
	}
	
	public void mouseClicked() {
		
	}

}
