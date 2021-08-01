
package Ids;

import java.util.UUID;


public class JuegoId {

    private UUID Id;

    public JuegoId(UUID id) {
        this.Id = id;
    }

    public String getId() {
        return Id.toString();
    }

}
