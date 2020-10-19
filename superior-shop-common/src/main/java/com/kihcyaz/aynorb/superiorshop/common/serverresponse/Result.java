package com.kihcyaz.aynorb.superiorshop.common.serverresponse;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private String message;

    private List<Error> errors;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
