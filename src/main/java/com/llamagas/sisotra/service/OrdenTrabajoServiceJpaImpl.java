/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.service;

import com.llamagas.sisotra.dao.OrdenTrabajoDao;
import com.llamagas.sisotra.dao.OrdenTrabajoDaoImpl;
import com.llamagas.sisotra.modelo.OrdenTrabajo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author DENIS
 */
public class OrdenTrabajoServiceJpaImpl implements OrdenTrabajoService {

    private EntityManagerFactory emf;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public OrdenTrabajoDaoImpl creaOTDao(EntityManager em) {
        OrdenTrabajoDaoImpl ordenTrabajoDaoImpl = new OrdenTrabajoDaoImpl();
        ordenTrabajoDaoImpl.setEm(em);
        return ordenTrabajoDaoImpl;
    }

    @Override
    public void registrar(OrdenTrabajo OrdTra) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        OrdTra.setEstado("PENDIENTE");
        creaOTDao(em).registrar(OrdTra);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void actualizar(OrdenTrabajo OrdTra) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        creaOTDao(em).actualizar(OrdTra);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminarSegun(Integer cod) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        OrdenTrabajoDao ordenTrabajoDao = creaOTDao(em);
        OrdenTrabajo ordenTrabajo = ordenTrabajoDao.ObtenerOT(cod);
        ordenTrabajoDao.eliminarSegun(ordenTrabajo);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<OrdenTrabajo> listar() {
        EntityManager em = emf.createEntityManager();
        List<OrdenTrabajo> lista = creaOTDao(em).listarTodo();
        em.close();
        return lista;
    }

    @Override
    public void Asignar(OrdenTrabajo OrdTra) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        OrdTra.setEstado("Abierto");
        creaOTDao(em).Asignar(OrdTra);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public OrdenTrabajo ObtenerOT(Integer c) {
        EntityManager em = emf.createEntityManager();
        OrdenTrabajo ordenTrabajo = creaOTDao(em).ObtenerOT(c);
        em.close();
        return ordenTrabajo;
    }

}
