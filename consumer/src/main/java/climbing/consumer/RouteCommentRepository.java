package climbing.consumer;

import climbing.model.RouteComment;
import org.springframework.data.repository.CrudRepository;

public interface RouteCommentRepository extends CrudRepository<RouteComment,Long> {
}
