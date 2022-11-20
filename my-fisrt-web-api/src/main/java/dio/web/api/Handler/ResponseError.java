package dio.web.api.Handler;

import java.util.Date;

public class ResponseError {
    private Date timeStamp= new Date();
    private String status=  "erro";
    private int statusCode = 400;
    private String error;

    public Date getTimestamp(){
        return timeStamp;
    }
    public String getError() {
        return error;
    }public String getStatus() {
        return status;
    }public int getStatusCode() {
        return statusCode;
    }public Date getTimeStamp() {
        return timeStamp;
    }public void setError(String error) {
        this.error = error;
    }public void setStatus(String status) {
        this.status = status;
    }public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
