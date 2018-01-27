package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.LibraryDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends MongoRepository<LibraryDocument, String> {

    LibraryDocument findByUuid(@Param("uuid") String uuid);
    LibraryDocument findByName(@Param("name") String name);
    
}
