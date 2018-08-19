public class Cubo extends Cuadrado{

	private double volumen;
	private double perimetro;
	
	public Cubo(double lado) {
		super(lado);
	}
	
	public double calcularVolumen() {
		
		volumen = Math.pow(lado, 3);
		
		return volumen;
	}
	
	@Override
	public double calcularPerimetro() {
		
		perimetro = lado * 12;
		
		return perimetro;
	}
	
	public double getVolumen() {
		return calcularVolumen();
	}
	
}