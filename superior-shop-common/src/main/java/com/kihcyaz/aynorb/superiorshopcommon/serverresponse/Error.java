package com.kihcyaz.aynorb.superiorshopcommon.serverresponse;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Error implements Serializable {

    private static final long serialVersionUID = 1L;

    private String field;

    private Integer id;

    private String msg;

    private Integer vmId = 1;

    public Error(String field, Integer id, String msg) {
        this.field = field;
        this.id = id;
        this.msg = msg;
    }
}
