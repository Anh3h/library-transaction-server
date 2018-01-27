package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.ResourceTypeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceTypeRepository extends MongoRepository<ResourceTypeDocument, String> {

    ResourceTypeDocument findByUuid(@Param("uuid") String uuid);
    ResourceTypeDocument findByName(@Param("name") String name);

}
