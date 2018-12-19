package ${package}.service.reference;

import com.perceptnet.commons.utils.resource.ResourceMessage;
import com.perceptnet.commons.utils.resource.ResourceString;

/**
 * This exception is targeted to be a base class for all business logic exception thrown from service layer
 * and indicating problems in data or in business logic.
 * <p>
 * We deliberately decided to use unchecked exceptions for this purpose -- like it is done .Net.
 * <p>
 * Created by VKorovkin on 17.03.2015.
 */

public class BusinessLogicException extends RuntimeException {

    private final ResourceMessage message;

    private Object data;

    protected BusinessLogicException() {
        this.message = null;
    }

    public BusinessLogicException(ResourceString message) {
        this(new ResourceMessage(message));
    }

    public BusinessLogicException(ResourceString message, Object... args) {
        this(new ResourceMessage(message, args));
    }

    public BusinessLogicException(Object data, ResourceString message, Object... args) {
        this(message, args);
        this.data = data;
    }

    public BusinessLogicException(ResourceString message, Throwable cause, Object... args) {
        this(new ResourceMessage(message, args), cause);
    }

    public BusinessLogicException(ResourceMessage message) {
        super();
        this.message = message;
    }

    public BusinessLogicException(ResourceMessage message, Throwable cause) {
        super(cause);
        this.message = message;
    }

    public BusinessLogicException(Object data, ResourceMessage message) {
        this(message);
        this.data = data;
    }

    public BusinessLogicException(Object data, ResourceMessage message, Throwable cause) {
        this(message, cause);
        this.data = data;
    }

    public ResourceMessage getResourceMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }


    @Override
    public String getMessage() {
        return message == null ? "" : message.toString();
    }

}