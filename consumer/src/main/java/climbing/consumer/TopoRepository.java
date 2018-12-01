package climbing.consumer;

import climbing.model.Topo;
import org.springframework.data.repository.CrudRepository;

public interface TopoRepository extends CrudRepository<Topo, Long> {
}
