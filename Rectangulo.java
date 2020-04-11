package ejercicio3;

public class Rectangulo extends Cuadrilatero {
	//constructor
	public Rectangulo(String color,boolean coloreada,double largo,double altura) {
		super(color,coloreada,largo,altura);
	}
	
	//calcula y devuelve el perimetro de Rectangulo
	@Override
	public double getPerimetro() {
		double perimetroRectangulo = 2 * (super.getAltura() + super.getLargo());
		return perimetroRectangulo;
	}
	
	//calcula y devuelve el area de Rectangulo
	@Override
	public double getArea() {
		double areaRectangulo = super.getAltura() * super.getLargo();
		return areaRectangulo;
	}
	
	//devuelve un String con todos los datos de Rectangulo
	@Override
	public String toString() {
		String Rectangulo = super.toString() + String.format("Perimetro: %.2f\nArea: %.2f (unidad al cuadrado)\n",getPerimetro(),getArea());
		return Rectangulo;
	}
}
