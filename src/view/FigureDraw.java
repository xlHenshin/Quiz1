package view;

import controller.Controller;
import processing.core.PApplet;

public class FigureDraw {

	PApplet app;
	Controller controller;
	
	public FigureDraw(PApplet app) {
		
		this.app = app;
		controller = new Controller(app);
	}
	
	public void randomFig() {
		
		controller.randomFig();
	}
	
	public void setup() {
		
		controller.setup();
	}
	
	public void drawCircle() {
		
		controller.drawCircle();
	}
	
	public void drawSquare() {
		
		controller.drawSquare();
	}
}
