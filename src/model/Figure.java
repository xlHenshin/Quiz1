package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int tam;
	protected int posX;
	protected int posY;
	protected int dirX;
	protected int dirY;
	protected int speed;
	
	protected int r;
	protected int g;
	protected int b;
	
	public Figure(int tam, int posx, int posy, int dirx, int diry, int r, int g, int b, PApplet app) {
		
		this.tam=tam;
		this.posX=posx;
		this.posY=posy;
		this.dirX=dirx;
		this.dirY=diry;
		this.app=app;
		
		this.r = r;
		this.g = g;
		this.b = b;
		
		this.speed=5;
	}
	
	protected abstract void drawFigure();
	
	protected void moveFigure() {
		
		posX += dirX* speed;
		posY += dirY* speed;
		
		if (posX <= 0 || posX >= 780) {
			dirX = dirX *(-1);
	
		
		if (posY <= 0 || posY >=200) {
			dirY = dirY*(-1); 
		} 
		
	}
		
	}
	
}
