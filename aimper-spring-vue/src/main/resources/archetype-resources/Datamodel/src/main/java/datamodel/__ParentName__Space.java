package ${package}.datamodel;

import com.aim.aimper.dommetadata.BaseEntitySpace;
import ${package}.datamodel.reference.ReferenceDomain;

public class ${ParentName}Space extends BaseEntitySpace {
      public static final ${ParentName}Space instance = new ${ParentName}Space();

      private ${ParentName}Space() {
          super();
      }

      protected void registerDomains() {
          super.registerDomains();
          registerDomain(new ReferenceDomain(this));

      }
}