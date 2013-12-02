package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends AbstractForm{

	public Point(int x, int y, Color c) throws IllegalPositionException{
		super(x, y, c);
		setValues();
	}

	public Point(GeometricalForm f, Color c){
		super(f, c);
		setValues();
	}
	
	private void setValues(){
		this.height = 0;
		this.width = 0;
		this.area = 0;
		this.perimeter = 0;
	}
}
