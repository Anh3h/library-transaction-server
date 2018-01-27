package courage.library.transactionserver.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "library")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LibraryDocument {

    private String uuid;
    @NonNull private String name;
    private String address;
    private List<UserDocument> users;
    private String logo;

    public LibraryDocument(String name, String address, String logo) {
        this.name = name;
        this.address = address;
        this.logo = logo;
        this.logo = null;
    }
    public LibraryDocument(String name, String address, UserDocument users, String logo) {
        this.name = name;
        this.address = address;
        this.users.add( users );
        this.logo = logo;
    }

    public LibraryDocument(String name, String address, List<UserDocument> users, String logo) {
        this.name = name;
        this.address = address;
        this.users = users;
        this.logo = logo;
    }
}
