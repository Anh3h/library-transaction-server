package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, String> {

    UserDocument findByUuid(@Param("uuid") String uuid);
    UserDocument findByEmail(@Param("email") String email);

}
