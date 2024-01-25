package com.example.mercaweb.persistance.Mapper;
import com.example.mercaweb.domain.dto.TiendaDteo;
import com.example.mercaweb.persistance.Entity.TiendaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ITiendaMapper {
    @Mapping(target = "mercadoEntity", ignore = true  )
    TiendaEntity TIENDA_ENTITY(TiendaDteo tiendaDteo);
      TiendaDteo TIENDA_DTEO(TiendaEntity tiendaEntity);

    List<TiendaDteo> TIENDA_DTO_LIST (List<TiendaEntity> tiendaEntityList);
}
