package climbing.consumer;

import climbing.model.Site;
import org.springframework.data.repository.CrudRepository;

public interface SiteRepository extends CrudRepository<Site,Long> {
}
