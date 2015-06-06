package Controlador;

import Modelo.ConexionDB;
import Modelo.User;
import Modelo.UsuariosModel;
import Vista.VistaApp;

public class MainController {
	// INSTANCIA UNICA
	private static MainController instance = null;
	// atributo DB
	ConexionDB corredoresDB;

	// vistas
	VistaApp vApp;

	// usuarios
	UsuariosModel usuarios = null;

	private MainController() {

		// Conexion con BD
		corredoresDB = ConexionDB.getInstance("localhost", "juegos", "root",
				"password");
		if (corredoresDB.connectDB() == true) {
			System.out.println("CONECTADOS CON EXITO");
		} else {
			System.out.println("ERROR EN LA CONEXION");
		}

		this.showMain();
	}

	// SingleTon sirve para restringir la creación de objetos pertenecientes a
	// una clase
	public static MainController getInstance() {
		if (instance == null) {
			instance = new MainController();
		}
		return instance;
	}

	// vista inicial
	public void showMain() {
		usuarios = new UsuariosModel();
		// ventana principal
		vApp = new VistaApp();
		// Mostrar la vista principal
		showPrincipal();
		// hacemos visible la pantalla inicial
		vApp.setVisible(true);
	}

	// lanzar juegos
	public void showJuegos() {
		vApp.showJuegos();
	}

	public void showPrincipal1() {
		vApp.showPrincipal();
	}

	// lanzar Principal
	public void showPrincipal() {
		// cargamos la vista principal y le enviamos los usuarios

		vApp.showPrincipal(usuarios.getUsuarios());
	}
}
