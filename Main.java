package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Figura circulo = new Circulo("Azul",true,8);
		Figura cuadrado = new Cuadrado("Rojo",false,5);
		Figura rectangulo = new Rectangulo("Amarillo",true,12,6);
		
		System.out.println(circulo.toString());
		System.out.println(cuadrado.toString());
		System.out.println(rectangulo.toString());
	}

}
