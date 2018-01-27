package courage.library.transactionserver.repository;

import courage.library.transactionserver.dao.ResourceDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceTemplate {

    @Autowired
    private MongoTemplate mongoTemplate;

    public ResourceDocument findByTopic(String uuid, Boolean isOnline) {
        return mongoTemplate.findOne(new Query(Criteria.where("topic.uuid").is(uuid).
                andOperator(Criteria.where("isOnline").is(isOnline))), ResourceDocument.class);
    }

    public ResourceDocument findByResourceType(String uuid, Boolean isOnline) {
        return mongoTemplate.findOne(new Query(Criteria.where("resourceType.uuid").is(uuid).
                        andOperator(Criteria.where("isOnline").is(isOnline))), ResourceDocument.class);
    }

}
