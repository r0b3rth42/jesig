package com.example.jesig.mapper;

import com.example.jesig.entidades.Compra;
import com.example.jesig.entidades.CompraProducto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface CompraMapper {
    @ResultMap("CompraResult")
    @Select("select * from compra left join CompraProducto")
    ArrayList<Compra> lista();

    int registrarCompra(Compra model);
    int registrarCompraProducto(CompraProducto model);
}
