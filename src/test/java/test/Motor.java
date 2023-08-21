package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	   void cambiarRegistro(int registro) {
		 this.registro = registro;       
	    
	}
	 void asignarTipo(String tipo) {	
		if (tipo.equalsIgnoreCase("electrico") || tipo.equalsIgnoreCase("gasolina")) {
            this.tipo = tipo;
           
        } 
    
		
	}

}
