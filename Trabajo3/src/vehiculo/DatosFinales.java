package vehiculo;

public class DatosFinales {

	public static void main(String[] args) {
		TipoVehiculo datos = new TipoVehiculo("Automovil", "Toyota", 2003, "Rojo", 4, 230);
		TipoVehiculo datos1 = new TipoVehiculo("Moto", "Suzuki", 2016, "Negro", 0, 320);
		TipoVehiculo datos2 = new TipoVehiculo("Camion", "Nissan", 1990, "Azul", 2, 220);
		datos.mostrarDatos();
		datos1.mostrarDatos();
		datos2.mostrarDatos();
	}

}

