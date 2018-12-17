package ${package}.datamodel;

import ${package}.datamodel.reference.ReferenceDomain;

public class ${ParentName}Space extends BaseEntitySpace {
      public static final ${parentName}Space instance = new ${parentName}Space();

      private ${ParentName}Space() {
          super();
      }

      protected void registerDomains() {
          super.registerDomains();
          registerDomain(new ReferenceDomain(this));

      }
}