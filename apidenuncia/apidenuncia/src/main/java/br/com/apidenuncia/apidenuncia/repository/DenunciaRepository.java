package br.com.apidenuncia.apidenuncia.repository;

import br.com.apidenuncia.apidenuncia.domain.Denuncia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Long> {

}
