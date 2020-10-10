package model;

import processing.core.PApplet;

public class Circle extends Figure {

	public Circle(int tam, int posx, int posy, int dir, int r, int g, int b, PApplet app) {
		super(tam, posx, posy, dir, r, g, b, app);
		this.app=app;
	}

	protected void drawFigure() {
		
		app.fill(r,g,b);
		app.ellipse(posX, posY, tam, tam);	
	}

	

}
