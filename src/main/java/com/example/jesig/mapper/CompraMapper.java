package com.example.jesig.mapper;

import com.example.jesig.entidades.Compra;
import com.example.jesig.entidades.CompraProducto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CompraMapper {
    //@ResultMap("CompraResult")
    //@Select("select * from compra c left join compra_producto cp on cp.compra_id = c.id")
    ArrayList<HashMap> lista();

    int registrarCompra(Compra model);
    int registrarCompraProducto(CompraProducto model);
}
