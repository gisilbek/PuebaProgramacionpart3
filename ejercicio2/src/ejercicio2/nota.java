package ejercicio2;

import java.util.Scanner;




public class nota extends inscripcion{
	static int nota;
	static int sumanot;
	static double calculo_promedio;
	 static  Scanner lector = new Scanner(System.in);
     public static  double validarNumero(String string){ // Validar Que La Lectura Solo Sea Double
      boolean veri=false;
         double numero=0;

         while(veri==false){
         try{
               numero = Double.parseDouble(string);
         veri=true;
         }
              catch(NumberFormatException ex){
                System.out.println("!!No Es Un Número!!");
                  System.out.println("Ingrese Solo Numero.");
                    string=lector.next();
                          veri=false;}
        }
          return numero;
  }
        public static int validarNumeroInt(String string){ // Validar Que La Lectura Solo Sea Int
      boolean veri=false;
         int numero=0;

         while(veri==false){
         try{
               numero = Integer.parseInt(string);
         veri=true;
         }
              catch(NumberFormatException ex){
                System.out.println("!!No Es Un Número!!");
                  System.out.println("Ingrese Solo Numero.");
                    string=lector.next();
                          veri=false;}
        }
          return numero;
}
        public static double calprome(){
    		sumanot=sumanot+nota;
            int n = 0;
			calculo_promedio= sumanot/n;
            return calculo_promedio;
        }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 0;
	        int a = 0;
	        int op2 = 1;
		 Scanner leer = new Scanner(System.in);
	        System.out.println("*********************************************************");
	        System.out.println("BIENVENIDO AL SISTEMA DE INSCRIPCION");
	        System.out.println("Por favor ingrese los siguientes datos");
	        System.out.println("Ingrese Cantidad de nota: ");
	        n = validarNumeroInt(leer.next());
	        inscripcion inscripcion[] = new inscripcion[n];
	        for (int i = 0; i < n; i++) {
	            inscripcion[i] = new inscripcion();//llamada del contructor inscripcion
	        }
	        int op = validarNumeroInt(leer.next());
	       
	       while (op2 != 0) {
	            System.out.println("********************************************************");
	            System.out.println("BIENVENIDO A LA SECCION (A) INGRESO DE DATOS ");
	            System.out.println("Por favor ingrese que desea hacer");
	            System.out.println("Entrar al Sistema [1]");
	            System.out.println("Imprimir Datos [2]");
	            System.out.println("Salir del Sistema [0]");
	            op2 =validarNumeroInt(leer.next());
	            a = validarNumeroInt(leer.next());
	            switch (op2) {
	                case 1: {
	                    System.out.println("Ingrese Cedula: ");
	                    inscripcion[a].documentsid = leer.next();
	                    System.out.println("Ingrese Nombre: ");
	                    inscripcion[a].nombre = leer.next();
	                    System.out.println("Ingrese Apellido: ");
	                    inscripcion[a].apellido = leer.next();
	                    System.out.println("Ingrese Sexo: ");
	                    inscripcion[a].sexo = leer.next();
	               
	                    System.out.println("Ingrese Edad: ");
	                    inscripcion[a].edad = leer.next();
	                    System.out.println("Ingrese Fecha de Nacimiento: ");
	                    inscripcion[a].fechanac = leer.next();
	                    System.out.println(" ");
	                    System.out.println("********************************************************");
	                    System.out.println("BIENVENIDO A LA SECCION (B) NOTA ");
	                
	                    
	}

}
	        }
	        
	}
}       
