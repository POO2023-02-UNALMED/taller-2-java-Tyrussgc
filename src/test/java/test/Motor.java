package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int nregistro) {
		 this.registro = nregistro;
	        System.out.println("El numero de registro cambio a " + nregistro);
	    
	}
	public void asignarTipo(String ntipo) {	
		if (ntipo.equalsIgnoreCase("electrico") || ntipo.equalsIgnoreCase("gasolina")) {
            this.tipo = ntipo;
            System.out.println("El tipo de motor ha cambiado a " + ntipo);
        } else {
            System.out.println("Solo podrá ser cambiado por el valor electrico o gasolina.");
        }
    
		
	}

}
