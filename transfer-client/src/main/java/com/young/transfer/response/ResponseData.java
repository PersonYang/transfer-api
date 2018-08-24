package com.young.transfer.response;

import java.io.Serializable;

/**
 * Created by young on 2018/8/23.
 */
public class ResponseData implements Serializable {

    private Integer code=0;
    private String message="success";

    private Object object;

    public static ResponseData ok(){
        ResponseData responseData = new ResponseData();
        return responseData;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
