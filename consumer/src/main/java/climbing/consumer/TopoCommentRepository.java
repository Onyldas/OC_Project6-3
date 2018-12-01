package climbing.consumer;

import climbing.model.TopoComment;
import org.springframework.data.repository.CrudRepository;

public interface TopoCommentRepository extends CrudRepository<TopoComment, Long> {
}
