package model;

import processing.core.PApplet;

public abstract class Figure extends PApplet {
	
	PApplet app;
	protected int tam;
	protected int posX;
	protected int posY;
	protected int direccion;
	
	public Figure(int tam, int posx, int posy, int dir, PApplet app) {
		
		this.tam=tam;
		this.posX=posx;
		this.posY=posy;
		this.direccion=dir;
		this.app=app;
	}
	
}
