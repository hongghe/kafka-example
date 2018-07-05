package com.hongghe.kafka.domain;

import java.io.Serializable;
import java.util.HashMap;

public class ApiResulte implements Serializable{

    public Integer code;
    public String message;
    public Object data = new HashMap<>();

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
