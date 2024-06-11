package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.propietarioDto;
import dtos.VehiculoDto;
import servicios.FicherosImplementacion;
import servicios.FicherosInterfaz;

/** Clase principal de nuestra aplicacion */
public class Inicio {

	public static final String rutaArchivo = "C:\\Users\\Carlos\\Desktop\\FICHEROS\\JAVAextra\\vehiculosypropietarios.txt";
	public static final List<propietarioDto> listaPropietarios = new ArrayList<propietarioDto>();
	public static final List<VehiculoDto> listaVehiculos = new ArrayList<VehiculoDto>();

	/** Metodo principal de entrada de nuestra aplicaccion */
	public static void main(String[] args) {

		
		
		FicherosInterfaz fi = new FicherosImplementacion();

		fi.leerFichero();
		

		for (VehiculoDto vehiculo : Inicio.listaVehiculos) {

			System.out.println(vehiculo.toString());

		}
		for (propietarioDto propietario : Inicio.listaPropietarios) {

			System.out.println(propietario.toString());

		}

	}

}
