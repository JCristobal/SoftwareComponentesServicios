package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Clase de datos que gestiona la BD de usuarios.
 * @author jcristobal
 *
 */
public class BDUsuario {
	
	private static final String PERSISTENCE_UNIT_NAME = "usuario";
	private static EntityManagerFactory factoria;
	
	/**
	 * 
	 * Insertamos nuevos usuarios en la base de datos
	 * @param nuevo usuario
	 */
	public static void insertar(Usuario usuario){
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();		
	}
	
	/**
	 * 
	 * Actualizamos nombre y apellidos del usuario
	 * @param usuario
	 */
	public static void actualizar(Usuario usuario){
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		Usuario aux = em.find(Usuario.class, usuario.getIdUsuario());
		
		em.getTransaction().begin();
	
		aux.setNombre(usuario.getNombre());
		aux.setApellido(usuario.getApellido());
		
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * 
	 * Eliminamos un usuario
	 * @param usuario
	 */
	public static void eliminar(Usuario usuario){
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		Usuario aux = em.find(Usuario.class, usuario.getIdUsuario());
		
		em.getTransaction().begin();
		em.remove(aux);
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 *
	 * Buscamos un usuario con según su email
	 * @param email del usuario que queremos seleccionar
	 * @return usuario seleccionado
	 */
	public static Usuario seleccionarUsuario(String email){
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email='"+email+"'");
		
		return (Usuario) q.getSingleResult();
		
	}
	
	/**
	 *
	 * Comprobamos que un usuario está en la BD
	 * @param email del usuario que queremos comprobar
	 * @return true si está registrado
	 */
	public static boolean existeEmail(String email){
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email='"+email+"'");
				
		return !q.getResultList().isEmpty();
		
	}
	
	
	/**
	 *
	 * Devolvemos los usuarios en la BD
	 * @return Lista de usuarios
	 */
	public static List<Usuario> listarUsuarios(){
		
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		Query q = em.createQuery("SELECT u FROM Usuario u");
				
		return (List<Usuario>) q.getResultList();
	
	}
	
	

}
