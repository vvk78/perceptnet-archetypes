package ${package}.datamodel.reference;

import com.aim.aimper.metadata.Domain;
import com.aim.aimper.metadata.EntitySpace;

public class ReferenceDomain extends Domain {

    public ReferenceDomain(EntitySpace entitySpace) {
        super(entitySpace);
    }

    protected void registerDomainEntities() {
        registerEntity(Example.class);
    }
}
