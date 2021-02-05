package com.example.jesig.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface ReporteService {

    ArrayList<HashMap> obtenerReporteMensual(HashMap parametros);

    ArrayList<HashMap> reporteVentasGananciaMensual(int anio);

    ArrayList<HashMap> ventasAlMes(HashMap map);
}
