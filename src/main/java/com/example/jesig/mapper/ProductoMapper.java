package com.example.jesig.mapper;

import com.example.jesig.entidades.Producto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductoMapper {
    List<Producto> lista();

    int registrar(Producto producto);
}
