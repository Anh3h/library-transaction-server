package courage.library.transactionserver.service.mapper;

import courage.library.transactionserver.dao.ResourceDocument;
import courage.library.transactionserver.dto.OnlineResource;

public class OnlineResourceMapper {

    public static OnlineResource toOfflineResource(ResourceDocument resourceDoc) {
        return new OnlineResource(resourceDoc.getUuid(), resourceDoc.getISBN(), resourceDoc.getTitle(),
                resourceDoc.getTopic(), resourceDoc.getAuthor(), resourceDoc.getEdition(), resourceDoc.getPublisher(),
                resourceDoc.getPublicationDate(), resourceDoc.getResourceType(), resourceDoc.getLibraryId(),
                resourceDoc.getIsOnline(), resourceDoc.getLocation() );
    }

    public static ResourceDocument toResource(OnlineResource resource) {
        return new ResourceDocument(resource.getUuid(), resource.getISBN(), resource.getTitle(),
                resource.getTopic(), resource.getAuthor(), resource.getEdition(), resource.getPublisher(),
                resource.getPublicationDate(), resource.getResourceType(), resource.getLibraryId(),
                resource.getIsOnline(), resource.getLocation(), null,
                null);
    }

}
