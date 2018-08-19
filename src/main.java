import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 double lado;
		 int figura = 0;
		 int opcion = 0;
		 boolean bandera = true;
		 boolean bandera2 = true;
		 double resultado;
		 int cancelar;
		 //llamo al metodo inicio 
		 figura = inicio(); 
		 
			while(bandera) { 
				System.out.println("ingrese la medida del lado: ");
				 lado = entrada.nextDouble();
				 bandera2 = true;
				while(bandera2) {
		
					 opcion = menu(figura);
					 resultado = operaciones(figura, opcion, lado);
					 System.out.println(resultado);
					 System.out.println("desea 1:cancelar o 2:salir");
					 cancelar = entrada.nextInt();
					 
					 if(cancelar != 1) {
						 bandera2 = false;
						 break;
					 }
					 
			}
		 }
	}
	//metodo que me evalua que tipo de operacion se va a realizar
	public static double operaciones(int figura,int opcion, double lado) {
		Cuadrado cuadro = new Cuadrado(lado);
		Cubo cubo = new Cubo(lado);
		double resultado = 0;
		switch(opcion) {
		case 1:
			resultado = cuadro.calcularPerimetro();
			break;
		case 2:
			//el if es para validar el tipo de figura y dependiendo es el que me hara el calculo
			if(figura == 1) {
				resultado = cuadro.calcularArea();
			}else if(figura == 2) {
				resultado = cubo.calcularVolumen();
			}
			break;
		}
		
		return resultado;
	}
	//captura el tipo de figura que se va a trabajar
	public static int inicio() {
		Scanner entrada = new Scanner(System.in);
		int figura;
		System.out.println("que figura deseas conocer sus datos: 1:cuadro, 2:cubo");
		figura = entrada.nextInt();
		return figura;
	}
	
	public static int menu(int figura) {
		Scanner entrada = new Scanner(System.in);
		//opciones de menu
		int resulMenu;
		 if(figura == 1) {
			 System.out.println("1:perimetro, 2:area, 3:cancelar, 4:salir");
		 }else if(figura == 2) {
			 System.out.println("1:perimetro, 2:volumen, 3:cancelar, 4:salir");
		 }
		 resulMenu = entrada.nextInt();
		 return resulMenu;
	}
	
}
