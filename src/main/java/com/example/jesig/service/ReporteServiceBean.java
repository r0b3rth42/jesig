package com.example.jesig.service;

import com.example.jesig.mapper.ReportesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional(propagation = Propagation.SUPPORTS,
               readOnly = true)
public class ReporteServiceBean implements  ReporteService{

    @Autowired
    private ReportesMapper reportesMapper;

    @Override
    public ArrayList<HashMap> obtenerReporteMensual(HashMap map) {
        return reportesMapper.obtenerReporteMensual(map);
    }
}
