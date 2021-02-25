package be.techni.ilir.labo3SB.model.services;

import java.util.List;

public interface Crudable<ENTITY,DTO,ID> {
    List<DTO> getAll();
    DTO getById(ID id);
    boolean insert(ENTITY entity);
    boolean update(ENTITY entity, ID id);
    boolean delete(ID id);
}
