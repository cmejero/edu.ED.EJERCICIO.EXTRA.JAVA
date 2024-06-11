package servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.VehiculoDto;
import dtos.propietarioDto;

public class FicherosImplementacion implements FicherosInterfaz {

	public void leerFichero() {

				

		try {

			File archivo = new File(Inicio.rutaArchivo);
			BufferedReader bf = new BufferedReader(new FileReader(archivo));

			String lineas = "";

			while((lineas = bf.readLine()) != null) {

				String[] linea = lineas.split(";");
				

				propietarioDto propietario = new propietarioDto();
				
				propietario.setId(crearIdPropietario());
				propietario.setDni(linea[2]);
				String fechaCom = linea[3];
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaCompra = LocalDate.parse(fechaCom, formato);
				System.out.println(fechaCompra);
				propietario.setFechaCompra(fechaCompra);
				propietario.setMatricula(linea[0]);

				Inicio.listaPropietarios.add(propietario);

				VehiculoDto vehiculo = new VehiculoDto();

				vehiculo.setIdVehiculo(crearIdVehiculo());
				vehiculo.setMatricula(linea[0]);
				String fechaMa = linea[1];
				DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaMatriculacion = LocalDate.parse(fechaMa, formato2);
				
				vehiculo.setFechaMatriculacion(fechaMatriculacion);

				Inicio.listaVehiculos.add(vehiculo);
			}
			bf.close();
			

		} catch (IOException io) {

		}
		

	}

	/** Metodo que se encarga de generar un Id */
	private long crearIdPropietario() {

		long nuevoId;
		int tamanioLista = Inicio.listaPropietarios.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.listaPropietarios.get(tamanioLista - 1).getId() + 1;

		} else {

			nuevoId = 1;
		}
		return nuevoId;

	}

	/** Metodo que se encarga de generar un Id */
	private long crearIdVehiculo() {

		long nuevoId;
		int tamanioLista = Inicio.listaVehiculos.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.listaVehiculos.get(tamanioLista - 1).getIdVehiculo() + 1;

		} else {

			nuevoId = 1;
		}
		return nuevoId;

	}
}
