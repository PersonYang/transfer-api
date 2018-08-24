package com.young.transfer.request;

import java.io.Serializable;

/**
 * Created by young on 2018/8/23.
 */
public class RequestData implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
