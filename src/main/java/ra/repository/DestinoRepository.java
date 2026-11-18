package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ra.model.Destino;

	@Repository	
	public interface DestinoRepository extends JpaRepository<Destino, Long>{
		

}
