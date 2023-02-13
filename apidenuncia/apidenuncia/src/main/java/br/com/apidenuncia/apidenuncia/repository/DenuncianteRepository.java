package br.com.apidenuncia.apidenuncia.repository;

import br.com.apidenuncia.apidenuncia.domain.Denunciante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenuncianteRepository extends JpaRepository<Denunciante, Long> {
}
