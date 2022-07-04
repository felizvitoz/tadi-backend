package com.tadi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USERS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
public class User extends BaseEntity implements Serializable {

    @Id
    @Column(name="username", nullable=false)
    private String username;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

}