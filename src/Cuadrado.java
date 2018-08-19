
public class Cuadrado {
	
	private double perimetro;
	private double area;
	protected double lado;
	char tipo;
	
	public Cuadrado(double lado) {
		
		this.lado = lado;
		
	}

	 public double calcularArea() {
		
		area = Math.pow(lado, 2);
		
		return area;
	}
	
	public double calcularPerimetro() {
		
		perimetro = lado * 4;
		
		return perimetro;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return calcularPerimetro();
	}
	
	public double getArea() {
		return calcularArea();
	}
	
	
}
