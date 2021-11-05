package core.shared;

import java.util.UUID;

public abstract class Entity {
    
    public Entity(){
        Id = UUID.randomUUID();
    }
    protected UUID Id;
}
