package courage.library.transactionserver.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "topic")
@Data
@NoArgsConstructor
public class TopicDocument {

    @Id @NonNull private String uuid;
    @NotNull private String name;
    private List<TopicDocument> subTopic;

    public TopicDocument(String name) {
        this.name = name;
        subTopic = null;
    }

    public TopicDocument(String name, List<TopicDocument> subTopic) {
        this.name = name;
        this.subTopic = subTopic;
    }

    public TopicDocument(String name, TopicDocument subTopic) {
        this.name = name;
        this.subTopic.add( subTopic );
    }
}
