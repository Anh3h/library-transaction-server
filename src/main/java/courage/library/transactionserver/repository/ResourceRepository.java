package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.ResourceDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends MongoRepository<ResourceDocument, String> {

    ResourceDocument findByUuidAndIsOnline(@Param("uuid") String uuid, @Param("isOnline") Boolean isOnline);
    ResourceDocument findByTitleAndIsOnline(@Param("title") String title, @Param("isOnline") Boolean isOnline);
    ResourceDocument findByAuthorAndIsOnline(@Param("author") String author, @Param("isOnline") Boolean isOnline);
    ResourceDocument findByLibraryIdAndIsOnline(@Param("libraryId") String libraryId, @Param("isOnline") Boolean isOnline);

}
