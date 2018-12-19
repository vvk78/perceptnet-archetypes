package ${package}.general.rest;

import com.perceptnet.wmcrm.general.dto.ErrorDto;
import com.google.common.base.Throwables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ExceptionAdvice {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorDto handleException(HttpMessageNotReadableException e, HttpServletRequest request) {
        logException(e, request);
        return new ErrorDto("Incorrect data", "Incorrect data in request");
    }

    /**
     * Generic handler for any non-specifically dealt with exceptions
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorDto handleException(Exception e, HttpServletRequest request) {
        logException(e, request);
        return new ErrorDto("Internal server error",
                "Internal server error: " + e.getMessage(),
                e.getClass().getName(), Throwables.getStackTraceAsString(e));
    }

    private void logBusinessLogicException(Exception e, HttpServletRequest request, String msg) {
        String format = "Business exception for the request to {}: {}";
        if (log.isDebugEnabled()) {
            log.warn(format, request.getRequestURI(), (msg == null ? e : msg), e);
        } else {
            log.warn(format, request.getRequestURI(), (msg == null ? e : msg));
        }
    }

    private void logException(Exception e, HttpServletRequest request) {
        log.error("Unhandled exception caught by the web service layer for the request to {}: {}", request.getRequestURI(), e, e);
    }


}