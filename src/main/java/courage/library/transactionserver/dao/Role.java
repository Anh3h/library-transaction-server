package courage.library.transactionserver.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
public class Role implements GrantedAuthority {

    private String id;
    @NonNull private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
