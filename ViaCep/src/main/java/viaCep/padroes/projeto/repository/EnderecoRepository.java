package dio.padroes.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.padroes.projeto.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
