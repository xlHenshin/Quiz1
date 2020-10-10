package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {

	PApplet app;
	Logic logic;
	
	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}
	
	public void randomFig() {
		
		logic.randomFig();
	}
	
	public void setup() {
		
		logic.setup();
	}
	
	public void drawCircle() {
		
		logic.drawCircle();
	}
	
	public void drawSquare() {
		
		logic.drawSquare();
	}
}
