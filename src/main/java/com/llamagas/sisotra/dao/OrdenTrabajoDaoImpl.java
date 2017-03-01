package com.llamagas.sisotra.dao;

import com.llamagas.sisotra.modelo.OrdenTrabajo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * @author DENIS
 */
public class OrdenTrabajoDaoImpl implements OrdenTrabajoDao {

    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void registrar(OrdenTrabajo OrdTra) {
        em.persist(OrdTra);
        //OrdTra.setEstado("Pendiente");
        //Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra); //Map
    }

    @Override
    public void actualizar(OrdenTrabajo OrdTra) {
        em.merge(OrdTra);
        //Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra);
    }

    @Override
    public void eliminarSegun(OrdenTrabajo OrdTra) {
        //String idOT = OrdTra.getIdOrdenT().trim();
        //Contenedor.ORDEN_TRABAJO.remove(c);
        em.remove(OrdTra);
    }

    @Override
    public List<OrdenTrabajo> listarTodo() {
//        Iterator it = Contenedor.ORDEN_TRABAJO.entrySet().iterator();
//        List<OrdenTrabajo> lista = new ArrayList<>();
//        while (it.hasNext()) {
//            Entry<String, OrdenTrabajo> orden = (Entry<String, OrdenTrabajo>) it.next();
//            lista.add(orden.getValue());
//        }
        TypedQuery<OrdenTrabajo> tquery = em.createNamedQuery("OT.getTodos", OrdenTrabajo.class);
        return tquery.getResultList();
    }

    @Override
    public void Asignar(OrdenTrabajo OrdTra) {
//        OrdTra.setEstado("Abierto");
//        Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra);
        em.merge(OrdTra);
    }

    @Override
    public OrdenTrabajo ObtenerOT(Integer c) {
        //OrdenTrabajo getOT = Contenedor.ORDEN_TRABAJO.get(c);
        //return getOT;
        return em.find(OrdenTrabajo.class, c);
    }

//    private static class Contenedor {
//        // private static List<OrdenTrabajo> ddd = new LinkedList<OrdenTrabajo>();
//        private static Map<String, OrdenTrabajo> ORDEN_TRABAJO = new HashMap<>();
//    }
}
