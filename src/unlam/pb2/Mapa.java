package unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	private String nombreDelMap;
	private Set <Vehiculo> vehiculosEnLaCalle = new HashSet();

	public Mapa(String nombreDelMap) {
		this.nombreDelMap = nombreDelMap;
	}

	public void agregarVehiculo(Vehiculo vehiculoParaAgregar) {
		vehiculosEnLaCalle.add(vehiculoParaAgregar);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculosEnLaCalle.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		for (Vehiculo vehiculo : vehiculosEnLaCalle) {
			for (Vehiculo vehiculo2 : vehiculosEnLaCalle) {
				if(vehiculo.longitudActual() == vehiculo2.longitudActual() && vehiculo.latitudActual() == vehiculo2.latitudActual()) {
					throw new ColitionException();
				}return true;
			}
		} return false;
	}

	

}
