package com.example.jesig.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface ReportesMapper {

    /*@Select("select v.FECHA, count(*) as vendidos, p.IDPRODUCTO, p.DESCRIPCION from detalleventa dv\n" +
            "\tleft join venta v on v.IDVENTA = dv.IDVENTA \n" +
            "\tleft join producto p on p.IDPRODUCTO = dv.IDPRODUCTO \n" +
            "\tWHERE MONTH(v.FECHA) = #{mes} AND YEAR(v.FECHA)= #{anio}\n" +
            "\tGROUP BY p.IDPRODUCTO;\t")*/
    ArrayList<HashMap> obtenerReporteMensual(HashMap map);

    ArrayList<HashMap> reporteVentasMensual(int anio);

    ArrayList<HashMap> ventasAlMes(HashMap map);
}
