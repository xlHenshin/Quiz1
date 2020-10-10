package view;


import processing.core.PApplet;

public class Main extends PApplet{

	FigureDraw figuredraw;
	
	
	int randomfigure;
	
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
		background(0);
		
		figuredraw.randomFig();
		
	}
	
	public void mouseClicked() {
		
		figuredraw.setup();
	}

}
