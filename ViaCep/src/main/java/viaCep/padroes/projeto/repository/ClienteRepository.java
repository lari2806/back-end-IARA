package dio.padroes.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.padroes.projeto.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
