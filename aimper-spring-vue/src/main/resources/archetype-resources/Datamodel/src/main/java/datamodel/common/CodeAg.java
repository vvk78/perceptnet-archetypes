package ${package}.datamodel.common;

import com.aim.aimper.metadata.attributes.StringEntityAttrib;
import com.aim.aimper.metadata.EntityAttribGroup;
import com.aim.aimper.metadata.LookupCode;

/**
 *
 */
public interface CodeAg extends EntityAttribGroup {

    @LookupCode
    StringEntityAttrib CODE = new StringEntityAttrib(true, 10);

}