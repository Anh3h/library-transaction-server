package courage.library.transactionserver.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "resource_type")
@Data
@NoArgsConstructor
public class ResourceTypeDocument {

    @Id @NonNull private String uuid;
    @NonNull private String name;

    public ResourceTypeDocument(String name) {
        this.name = name;
    }

}
