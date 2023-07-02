package vehiculo;

public class TipoVehiculo extends vehiculo{

			private int velocidadMaxima;
			

			public TipoVehiculo(String tipoVehiculo ,String marca, int anio,String color, 
					int numeroPuertas, int velocidadMaxima){
				super(tipoVehiculo, marca, anio, color, numeroPuertas);
			
				this.velocidadMaxima = velocidadMaxima; 
			}
			public void mostrarDatos(){
				System.out.println("------INFORMACION DEL VEHICULO------"+
						"\nTipo de vehiculo: "+ getTipoVehiculo()+
						"\nMarca: "+ getMarca() +
						"\nFabricacion: "+ getAnio() + 
						"\nColor: "+ getColor() +
						"\npuertas: "+ getNumeroPuertas()+
						"\nVelocidad maxima del vehiculo (km/h): "+ velocidadMaxima+ "\n");
			}	
		
	}


