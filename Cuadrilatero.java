package ejercicio3;

public abstract class Cuadrilatero extends Figura {
	//atributos
	private double largo;
	private double altura;
	
	//setters
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//getters
	public double getLargo() {
		return largo;
	}
	public double getAltura() {
		return altura;
	}
	
	//construtor para rectangulo
	public Cuadrilatero(String color,boolean coloreada,double lardo,double altura) {
		super(color,coloreada);
		setLargo(lardo);
		setAltura(altura);
	}
	//constructor para cuadrado
	public Cuadrilatero(String color,boolean coloreada,double lado) {
		super(color,coloreada);
		setLargo(lado);
		setAltura(lado);
	}
	
	@Override
	public String toString() {
		String Cuadrilatero = super.toString()+String.format("Largo: %.2f\nAltura: %.2f\n",largo,altura);
		return Cuadrilatero;
	}
}
