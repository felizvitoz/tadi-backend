package com.tadi.entity;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class BaseEntity {

    @Column(name="created_on")
    private Date createdOn;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updatedBy;

    @Column(name="updated_on")
    private Date updatedOn;
}
