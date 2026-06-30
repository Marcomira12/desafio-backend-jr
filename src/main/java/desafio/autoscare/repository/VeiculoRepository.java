package desafio.autoscare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio.autoscare.models.Veiculo;
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
