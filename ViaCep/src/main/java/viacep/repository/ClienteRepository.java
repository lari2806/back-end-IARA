package viacep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import viacep.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
