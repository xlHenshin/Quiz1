package model;

import processing.core.PApplet;

public class Square extends Figure {

	public Square(int tam, int posx, int posy, int dirx, int diry, int r, int g, int b, PApplet app) {
		super(tam, posx, posy, dirx, diry, r, g, b, app);
		
	}

	protected void drawFigure() {
	
		app.fill(r,g,b);
		app.rect(posX, posY, tam, tam);	
	}

	
}
