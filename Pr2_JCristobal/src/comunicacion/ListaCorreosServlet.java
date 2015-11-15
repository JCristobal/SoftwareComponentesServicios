package comunicacion;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.BDUsuario;
import modelo.Usuario;


/**
 * Clase que actúa como servlet para conectar el programa "Cliente" con la BD
 * @author jcristobal
 *
 */
public class ListaCorreosServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
		
	/**
	 * 
	 * Función para recibir peticiones
	 * @param request Petición Http
	 * @param response Respuesta Http
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List <Usuario> listaUsuarios = BDUsuario.listarUsuarios();
		request.setAttribute("usuarios", listaUsuarios);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * Función para mandar la petición HTTP
	 * @param request Petición Http
	 * @param response Respuesta Http
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String accion = request.getParameter("action");
		String email = request.getParameter("email");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		
		/**
		 * Recogemos el valor de "acción", y realizamos dicha acción		
		 */
		if(accion.equals("insertar")){		
			if(!BDUsuario.existeEmail(email)){
				Usuario user = new Usuario(nombre, apellido, email);
				BDUsuario.insertar(user);
			}
		}
		else if(accion.equals("seleccionarUsuario")){
			Usuario user = BDUsuario.seleccionarUsuario(email);
			request.setAttribute("buscado", user);
		}
		else if(accion.equals("actualizar")){
			Usuario user = BDUsuario.seleccionarUsuario(email);
			user.setNombre(nombre);
			user.setApellido(apellido);
			BDUsuario.actualizar(user);
		}
		else if(accion.equals("eliminar")){
			Usuario user = BDUsuario.seleccionarUsuario(email);
			BDUsuario.eliminar(user);
		}
		
			
		List<Usuario> listaUsuarios = BDUsuario.listarUsuarios();
		request.setAttribute("usuarios", listaUsuarios);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
