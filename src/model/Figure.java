package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int tam;
	protected int posX;
	protected int posY;
	protected int direccion;
	
	protected int r;
	protected int g;
	protected int b;
	
	public Figure(int tam, int posx, int posy, int dir, int r, int g, int b, PApplet app) {
		
		this.tam=tam;
		this.posX=posx;
		this.posY=posy;
		this.direccion=dir;
		this.app=app;
		
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	protected abstract void drawFigure();
	
	protected void moveFigure() {
		
		posX += posX*direccion;
		posY += posY*direccion;
		
		
	}
	
}
