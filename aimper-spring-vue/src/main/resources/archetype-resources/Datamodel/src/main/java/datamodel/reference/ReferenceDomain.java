package ${package}.datamodel.reference;


public class ReferenceDomain extends Domain {

    public ReferenceDomain(EntitySpace entitySpace) {
        super(entitySpace);
    }

    protected void registerDomainEntities() {
        registerEntity(Example.class);
    }
}
