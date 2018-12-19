package ${package}.datamodel.reference;

import com.aim.aimper.metadata.Entity;
import com.aim.aimper.metadata.attributes.PlainIntegerEntityAttribute;
import ${package}.datamodel.common.Base${ParentName}Entity;
import ${package}.datamodel.common.NameAg;
import ${package}.datamodel.common.CodeAg;

/**
 *
 */
public interface Example extends Entity, Base${ParentName}Entity, NameAg, CodeAg {

    PlainIntegerEntityAttribute WEIGHT = new PlainIntegerEntityAttribute(false);

//    /**
//     * The country, this city belongs to
//     */
//    ChildRef COUNTRY = new ChildRef(false, Country.class, AbstractReference.DeleteAction.Cascade);

}
