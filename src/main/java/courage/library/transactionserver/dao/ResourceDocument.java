package courage.library.transactionserver.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection = "resource")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDocument {

    @Id private String uuid;
    private String ISBN;
    @NotNull String title;
    @NotNull private TopicDocument topic;
    private String author;
    private String edition;
    private String publisher;
    private Date publicationDate;
    @NonNull private ResourceTypeDocument resourceType;
    @NonNull private String libraryId;
    @NonNull private Boolean isOnline;
    private String location;
    private Integer totalQuantity;
    private Integer availableQuantity;

}
