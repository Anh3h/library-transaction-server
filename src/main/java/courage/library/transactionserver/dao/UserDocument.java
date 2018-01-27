package courage.library.transactionserver.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "user")
@NoArgsConstructor
@Data
public class UserDocument {

    @Id @NonNull private String uuid;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private String email;
    private Date dob;
    private String telephone;
    private String address;
    private LibraryDocument library;
    @NonNull private List<Role> roles;

    public UserDocument(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
