package jpa.simple.main;

import java.util.ArrayList;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.simple.modelo.Completo;

public class Principal {
	
	private static final String PERSISTENCE_UNIT_NAME = "tutorialJPA";
	private static EntityManagerFactory factoria;

	public static void main(String[] args) {
		factoria = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factoria.createEntityManager();
		
		// leer las entradas existentes y escribir en la consola
		Query q = em.createQuery("select t from Completo t");
		
		//Crearse una lista con template: "Completo" a la que asignameros el resultado de la consulta
		//en la base de datos ("q.getResultList()"
		Vector<Completo> listaCompleto = (Vector<Completo>) q.getResultList();
				
		//Iterar en la lista e imprimir las instancias "completo"
		for (Completo completo : listaCompleto) {
			System.out.println(completo.toString());
		}
		
		//Ahora imprimimos el numero de registros que tiene ya la base de datos
		System.out.println("Tamano: " + listaCompleto.size());
		
		//Ahora vamos a trabajar con una transaccion en la base de datos
		em.getTransaction().begin();
		
		//Crearse una instancia de completo y utilizar los metodos "setResumen()" y "setDescripcion()"
		Completo aux = new Completo();
		double numAle = Math.floor(Math.random()*100+1);
		aux.setResumen(" resumen "+numAle+"." );
		aux.setDescripcion(" descripcion "+numAle);
		
		//Posteriormente hay que decir al gestor de entidad (em) que la instancia va a ser persistente;
		//conseguir la transaccion ("em.getTransaction()") y hacerla definitiva ("commit()")
		em.persist(aux);		
		em.getTransaction().commit();
		
		// TAREA
		em.close();
	}
}
