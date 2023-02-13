package br.com.apidenuncia.apidenuncia.repository;

import br.com.apidenuncia.apidenuncia.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
