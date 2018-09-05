package climbing.consumer;

import climbing.model.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepository extends CrudRepository<Route,Long> {
}
