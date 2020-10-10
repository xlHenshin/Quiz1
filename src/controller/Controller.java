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
	

	
	public void drawCircle() {
		
		logic.drawCircle();
	}
	
	public void drawSquare() {
		
		logic.drawSquare();
	}
}
