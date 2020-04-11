package ejercicio3;

public class Cuadrado extends Cuadrilatero{
	//constructor
	public Cuadrado(String color,boolean coloreada,double lado) {
		super(color,coloreada,lado);
	}
	
	//calcula y devuelve el perimetro de Cuadrado
	@Override 
	public double getPerimetro() {
		double perimetroCuadrado = 4*super.getAltura();
		return perimetroCuadrado;
	}
	
	//calcula y devuelve el area de Cuadrado
	@Override
	public double getArea() {
		double areaCuadrado = Math.pow(super.getAltura(),2);
		return areaCuadrado;
	}
	
	//devuelve un String con todos los datos de Cuadrado
	@Override
	public String toString() {
		String Cuadrado = super.toString() + String.format("Perimetro: %.2f\nArea: %.2f (unidad al cuadrado)\n",getPerimetro(),getArea());
		return Cuadrado;
	}

}
