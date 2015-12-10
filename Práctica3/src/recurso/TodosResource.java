package recurso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import modelo.Todo;
import modelo.TodoDao;
/**
 * 
 * @author jcristobal
 * Clase que recibe los datos de la web y los manda a sus respectivos métodos a la clase TodoResource
 *
 */

// Will map the resource to the URL todos
@Path("/todos")
public class TodosResource {

	  @Context
	  UriInfo uriInfo;
	  @Context
	  Request request;
	
	  /**
	   * 
	   * @return la lista de todos al usuario en el navegador
	   */
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public List<Todo> getTodosBrowser() {
	    List<Todo> todos = new ArrayList<Todo>();
	    todos.addAll(TodoDao.INSTANCE.getModelo().values());
	    return todos;
	  }


	  /**
	   * 
	   * @return la lista de todos
	   */
	  @GET
	  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	  public List<Todo> getTodos() {
	    List<Todo> todos = new ArrayList<Todo>();
	    todos.addAll(TodoDao.INSTANCE.getModelo().values());
	    return todos;
	  }

	  /**
	   * 
	   * @return el número de "todos": número total de entradas
	   */
	  @GET
	  @Path("count")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getCount() {
	    int count = TodoDao.INSTANCE.getModelo().size();
	    return String.valueOf(count);
	  }
	
	  /**
	   * 
	   * @param id de la nueva entrada que se inserta
	   * @param titulo
	   * @param anio
	   * @param genero
	   * @param autor
	   * @param sinopsis
	   * @param servletResponse
	   * @throws IOException
	   */
	  @POST
	  @Produces(MediaType.TEXT_HTML)
	  @Path("insert")
	  //@Consumes(MediaType.MULTIPART_FORM_DATA)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public void newTodo(@FormParam("id") String id,
	      @FormParam("titulo") String titulo,
	      @FormParam("anio") String anio,
	      @FormParam("genero") String genero,
	      @FormParam("autor") String autor,
	      @FormParam("sinopsis") String sinopsis,

		  
	      @Context HttpServletResponse servletResponse) throws IOException{
		    Todo todo = new Todo(id, titulo);
		    if (anio != null && genero != null && autor != null  && sinopsis != null ) {
		    	todo.setAnio(anio);
		    	todo.setGenero(genero);
		    	todo.setAutor(autor);
		    	todo.setSinopsis(sinopsis);
		    	
		    }
		    
		     
		    TodoDao.INSTANCE.getModelo().put(id, todo);
	
		    servletResponse.sendRedirect("../../index.html");
	  }
	
	
	  /**
	   * 
	   * @param id de la entrada a actualizar
	   * @param titulo
	   * @param anio
	   * @param genero
	   * @param autor
	   * @param sinopsis
	   * @param servletResponse
	   * @throws IOException
	   */
	  @POST
	  @Produces(MediaType.TEXT_HTML)
      @Path("update")
	  //@Consumes(MediaType.MULTIPART_FORM_DATA)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public void updateTodo(@FormParam("id") String id,
	      @FormParam("titulo") String titulo,
	      @FormParam("anio") String anio,
	      @FormParam("genero") String genero,
	      @FormParam("autor") String autor,
	      @FormParam("sinopsis") String sinopsis,

		  
	      @Context HttpServletResponse servletResponse) throws IOException{
			  Todo todo = getTodo(id).getTodo();
		    
			  
			  if (titulo !=null) { todo.setTitulo(titulo); }
			  if (anio !=null) { todo.setAnio(anio); }
			  if (genero !=null) { todo.setGenero(genero); }
			  if (autor !=null) { todo.setAutor(autor); }
			  if (sinopsis !=null) { todo.setSinopsis(sinopsis); }
		     
		    
			  TodoDao.INSTANCE.getModelo().put(id, todo);
	
			  servletResponse.sendRedirect("../../index.html");
	  }
	
	  /**
	   * 
	   * @param id ID de la entrada a borrar
	   * @param servletResponse
	   * @throws IOException
	   */
	  @POST
	  @Produces(MediaType.TEXT_HTML)
	  @Path("delete")
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public void removeTodo(@FormParam("id") String id,			  
		      @Context HttpServletResponse servletResponse) throws IOException{
		
				getTodo(id).deleteTodo();
				
			    servletResponse.sendRedirect("../../index.html");

	  }

	  /**
	   * 
	   * @param id parámetro que se pasa a TodoResources para mostrar sus datos
	   * @return datos de la entrada con el ID pasado
	   */
	  @Path("{todo}")
	  public TodoResource getTodo(@PathParam("todo") String id) {
		return new TodoResource(uriInfo, request, id);
	  }
	  
	  
	 

} 
