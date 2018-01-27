package courage.library.transactionserver.service.mapper;

import courage.library.transactionserver.dao.ResourceDocument;
import courage.library.transactionserver.dto.OfflineResource;

public class OfflineResourceMapper {

    public static OfflineResource toOfflineResource(ResourceDocument resourceDoc) {
        return new OfflineResource(resourceDoc.getUuid(), resourceDoc.getISBN(), resourceDoc.getTitle(),
                resourceDoc.getTopic(), resourceDoc.getAuthor(), resourceDoc.getEdition(), resourceDoc.getPublisher(),
                resourceDoc.getPublicationDate(), resourceDoc.getResourceType(), resourceDoc.getLibraryId(),
                resourceDoc.getIsOnline(), resourceDoc.getLocation(), resourceDoc.getTotalQuantity(),
                resourceDoc.getAvailableQuantity());
    }

    public static ResourceDocument toResource(OfflineResource resource) {
        return new ResourceDocument(resource.getUuid(), resource.getISBN(), resource.getTitle(),
                resource.getTopic(), resource.getAuthor(), resource.getEdition(), resource.getPublisher(),
                resource.getPublicationDate(), resource.getResourceType(), resource.getLibraryId(),
                resource.getIsOnline(), resource.getShelf(), resource.getTotalQuantity(),
                resource.getAvailableQuantity());
    }
}
