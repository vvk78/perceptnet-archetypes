package ${package}.general.dto;

import com.perceptnet.abstractions.Identifiable;

/**
 * created by vkorovkin (vkorovkin@gmail.com) on 15.11.2018
 */
public class ErrorDto  {
    private String header;
    private String message;
    private int code;
    private String exceptionClass;
    private String exceptionDetails;
    private Object data;

    /**
     * It must exist for proper json parsing
     */
    public ErrorDto() {
    }

    public ErrorDto(String header, String message) {
        this.header = header;
        this.message = message;
    }

    public ErrorDto(String header, String message, String exceptionClass, String exceptionDetails) {
        this.header = header;
        this.message = message;
        this.exceptionClass = exceptionClass;
        this.exceptionDetails = exceptionDetails;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public ErrorDto setCode(int code) {
        this.code = code;
        return this;
    }

    public String getExceptionClass() {
        return exceptionClass;
    }

    public void setExceptionClass(String exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    public String getExceptionDetails() {
        return exceptionDetails;
    }

    public void setExceptionDetails(String exceptionDetails) {
        this.exceptionDetails = exceptionDetails;
    }

    public Object getData() {
        return data;
    }

    public ErrorDto setData(Object data) {
        this.data = data;
        return this;
    }
}