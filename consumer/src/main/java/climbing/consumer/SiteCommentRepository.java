package climbing.consumer;

import climbing.model.SiteComment;
import org.springframework.data.repository.CrudRepository;

public interface SiteCommentRepository extends CrudRepository<SiteComment, Long> {
}
