package ejercicio3;

public abstract class Figura {
	//atributos
	private String color;
	private boolean coloreada;
	
	//setters
	public void setColor(String color) {
		this.color = color;
	}
	public void setColoreada(boolean coloreada) {
		this.coloreada = coloreada;
	}
	
	//getters
	public String getColor() {
		return color;
	}
	
	public boolean getColoreada() {
		return coloreada;
	}
	
	//constructor
	public Figura(String color,boolean coloreada) {
		setColor(color);
		setColoreada(coloreada);
	}
	
	//calcula y devuelve el perimetro (abs)
	public abstract double getPerimetro();
	
	//calcula y devuelve el area (abs)
	public abstract double getArea();
}
