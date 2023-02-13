package br.com.apidenuncia.apidenuncia.repository;

import br.com.apidenuncia.apidenuncia.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {

}
