package courage.library.transactionserver.changelog;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import courage.library.transactionserver.dao.LibraryDocument;
import courage.library.transactionserver.dao.ResourceTypeDocument;
import courage.library.transactionserver.dao.TopicDocument;
import courage.library.transactionserver.dao.UserDocument;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ChangeLog
public class DatabaseChangeLog {

    @ChangeSet(order="001", id="initialize", author="Ang3h")
    public void initialize(MongoTemplate mongoTemplate) {

        initializeLibraryDocument(mongoTemplate);
        initializeResourceTypeDocument(mongoTemplate);
        initializeTopicDocument(mongoTemplate);
        initializeUserDocument(mongoTemplate);

    }

    private void initializeLibraryDocument(MongoTemplate mongoTemplate){
        LibraryDocument libraryDoc = new LibraryDocument("Default library", "Online", null);
        libraryDoc.setUuid(UUID.randomUUID().toString());
        mongoTemplate.insert(libraryDoc, "library");
    }

    private void initializeResourceTypeDocument(MongoTemplate mongoTemplate) {
        List<String> resourceTypes = new ArrayList<>();
        resourceTypes.add("Book");
        resourceTypes.add("Report");
        resourceTypes.add("Theses");
        resourceTypes.forEach(resourceType -> {
            ResourceTypeDocument resourceTypeDoc = new ResourceTypeDocument(resourceType);
            resourceTypeDoc.setUuid(UUID.randomUUID().toString());
            mongoTemplate.insert(resourceTypeDoc, "resource_type");
        });
    }

    private void initializeTopicDocument(MongoTemplate mongoTemplate){
        List<String> topics = new ArrayList<>();
        topics.add("Science");
        topics.add("History");
        topics.add("Literature");
        topics.forEach(topic -> {
            TopicDocument topicDoc = new TopicDocument(topic);
            topicDoc.setUuid(UUID.randomUUID().toString());
            mongoTemplate.insert(topicDoc, "topic");
        });
    }

    private void initializeUserDocument(MongoTemplate mongoTemplate){
        UserDocument userDoc = new UserDocument("Admin", "Admin", "admin@gamil.com");
        userDoc.setUuid(UUID.randomUUID().toString());
        mongoTemplate.insert(userDoc, "user");
    }

}
