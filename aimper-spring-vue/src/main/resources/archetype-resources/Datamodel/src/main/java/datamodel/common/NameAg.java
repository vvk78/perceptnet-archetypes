package ${package}.datamodel.common;

import com.aim.aimper.metadata.attributes.StringEntityAttrib;
import com.aim.aimper.metadata.EntityAttribGroup;
import com.aim.aimper.metadata.LookupName;

/**
 *
 */
public interface NameAg extends EntityAttribGroup {

    @LookupName
    StringEntityAttrib NAME = new StringEntityAttrib(true, -1);

}