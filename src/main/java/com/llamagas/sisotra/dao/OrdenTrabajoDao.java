/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.dao;

import com.llamagas.sisotra.modelo.OrdenTrabajo;
import java.util.List;

/**
 *
 * @author locador233dnce
 */
public interface OrdenTrabajoDao {

    void registrar(OrdenTrabajo OrdTra);

    void actualizar(OrdenTrabajo OrdTra);

    void eliminarSegun(OrdenTrabajo OrdTra);

    List<OrdenTrabajo> listarTodo();

    void Asignar(OrdenTrabajo OrdTra);

    OrdenTrabajo ObtenerOT(Integer c);
}
