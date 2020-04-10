package ejercicio3;

public class Circulo extends Figura{
	//atributos
	private double radio;
	
	//setters
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//getters
	public double getRadio() {
		return radio;
	}
	
	//Constructor
	public Circulo(String color,boolean coloreada,double radio) {
		super(color,coloreada);
		this.radio = radio;
	}
	
	//@override del perimetro de Circulo
	@Override
	public double getPerimetro() {
		double perimetro = (2 * (Math.PI) * radio);
		return perimetro;
	}
	
	//@override del area de Circulo
	@Override 
	public double getArea() {
		double area = ((Math.PI) * (Math.pow(radio,2)));
		return area;
	}
	
	//devuelve String con los datos de Circulo
	@Override 
	public String toString() {
		String circulo = super.toString() + String.format("Radio: %.2f\nPerimetro: %.2f\nArea: %.2f\n",radio,getPerimetro(),getArea());
		return circulo;
	}
	
	
}
