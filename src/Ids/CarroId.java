
package Ids;
import java.util.UUID;

public class CarroId {
    
    private UUID Id;

    public CarroId(UUID id) {
        this.Id = id;
    }

    public String getId() {
        return Id.toString();
    }
}
