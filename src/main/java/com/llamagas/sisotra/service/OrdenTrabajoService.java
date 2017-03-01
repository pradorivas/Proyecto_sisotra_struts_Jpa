/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.service;

import com.llamagas.sisotra.modelo.OrdenTrabajo;
import java.util.List;

/**
 *
 * @author DENIS
 */
public interface OrdenTrabajoService {

    void registrar(OrdenTrabajo OrdTra);

    void actualizar(OrdenTrabajo OrdTra);

    void eliminarSegun(Integer cod);

    List<OrdenTrabajo> listar();

    void Asignar(OrdenTrabajo OrdTra);

    OrdenTrabajo ObtenerOT(Integer c);
}
