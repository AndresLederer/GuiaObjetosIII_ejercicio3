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
	
	//devuelve un String con los datos de Figura
	@Override
	public String toString() {
		String figura;
		if(coloreada)
			figura = "Color: "+color+"\nColoreada: La figura esta coloreada\n";
		else
			figura = "Color: "+color+"\nColoreada: La figura no esta coloreada aun\n";
		return figura;
	}

	//calcula y devuelve el perimetro (abs)
	public abstract double getPerimetro();
	
	//calcula y devuelve el area (abs)
	public abstract double getArea();
}
