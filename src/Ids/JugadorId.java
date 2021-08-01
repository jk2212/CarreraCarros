
package Ids;

import java.util.UUID;


public class JugadorId {

    private UUID Id;

    public JugadorId(UUID id) {
        this.Id = id;
    }

    public String getId() {
        return Id.toString();
    }

}
