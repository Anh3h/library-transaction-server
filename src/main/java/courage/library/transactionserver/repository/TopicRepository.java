package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.TopicDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends MongoRepository<TopicDocument, String> {

    TopicDocument findByUuid(@Param("uuid") String uuid);
    TopicDocument findByName(@Param("name") String name);

}
