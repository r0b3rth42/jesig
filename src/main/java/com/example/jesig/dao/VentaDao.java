
package com.example.jesig.dao;


import com.example.jesig.entidades.Venta;
import java.util.HashMap;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author ZetaGzR
 */
public interface VentaDao extends JpaRepository<Venta, Integer>{
    
    @Query(value = "{call sp_reporte_ganancias()}", nativeQuery = true)
    List<HashMap<String,Object>> reporteGanacia();
    
}
