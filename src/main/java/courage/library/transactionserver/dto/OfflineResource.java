package courage.library.transactionserver.dto;

import courage.library.transactionserver.dao.ResourceTypeDocument;
import courage.library.transactionserver.dao.TopicDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfflineResource {

    private String uuid;
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
    private String shelf;
    @NonNull private Integer totalQuantity;
    @NonNull private Integer availableQuantity;

}
