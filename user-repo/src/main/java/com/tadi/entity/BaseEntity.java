package com.tadi.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    private Date createdOn;
    private String createdBy;
    private String updatedBy;
    private Date updatedOn;
}
