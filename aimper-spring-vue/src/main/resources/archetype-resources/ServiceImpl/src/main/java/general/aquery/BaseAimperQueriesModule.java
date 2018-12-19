package ${package}.general.aquery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aim.aimper.persistence.ParamValuePair;
import com.aim.aimper.persistence.Qh;
import com.aim.aimper.persistence.VariableExpression;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

import static com.aim.aimper.persistence.Qh.variable;

public class BaseAimperQueriesModule {

    public static final Logger QUERY_LOG = LoggerFactory.getLogger("${artifactId}.queries");

    public static final VariableExpression<String> NAME_VAR = variable("name", String.class);
    public static final VariableExpression<Timestamp> LAST_CHANGE_AT = variable("name", String.class);

    public static final VariableExpression<Date> DATE_VAR = variable("date", Date.class);
    public static final VariableExpression<Date> DATE_FROM_VAR = variable("dateFrom", Date.class);
    public static final VariableExpression<Date> DATE_TO_VAR = variable("dateTo", Date.class);


    protected static void traceQry(Object container, Object qry) {
        QUERY_LOG.trace(container.getClass().getName() + ":\n" + qry);
    }

    protected static void traceQry(String name, Object qry) {
        QUERY_LOG.trace(name + ":\n" + qry);
    }

    /**
     * Stands for "Create Search Pattern" for ilike text search with
     *
     * @param strParam
     * @return
     */
    public static String csp(String strParam) {
        if (strParam == null) {
            return null;
        }
        strParam = strParam.trim();
        if (strParam.isEmpty()) {
            return null;
        }
        String[] words = strParam.split(" ");
        StringBuilder buff = new StringBuilder(strParam.length() + 5);
        buff.append("%");
        for (String word : words) {
            buff.append(word);
            buff.append("%");
        }
        return buff.toString();
    }

    /**
     * "Like String Pattern"
     */
    public static String lkp(String str) {
        if (str == null) {
            return null;
        }
        String result = str.trim();
        if (result.isEmpty()) {
            return null;
        }
        result = result.replaceAll("\\?", "_").replaceAll("\\*", "%");
        return result;
    }

    public static <T> T firstOrNull(Collection<T> c) {
        return c == null || c.isEmpty() ? null : c.iterator().next();
    }

    public static Timestamp nowTs() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static ParamValuePair<Timestamp> pvLastChangeNow() {
        return Qh.pv(LAST_CHANGE_AT, nowTs());
    }

}