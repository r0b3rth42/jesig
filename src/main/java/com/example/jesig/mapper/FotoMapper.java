package com.example.jesig.mapper;

import com.example.jesig.entidades.Foto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FotoMapper {
    int registrarMasivo(List<Foto> lista);
}
