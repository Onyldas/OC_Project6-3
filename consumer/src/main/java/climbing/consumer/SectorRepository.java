package climbing.consumer;

import climbing.model.Sector;
import org.springframework.data.repository.CrudRepository;

public interface SectorRepository extends CrudRepository<Sector, Long> {
}
