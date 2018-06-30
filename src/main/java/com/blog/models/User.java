package com.blog.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by minht on 6/30/2018.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;
    private String avatar;
    private Date createdOn;
    private Date updatedOn;
    private int updatedBy;
    private int createdBy;
    private boolean deleted;
    private int role;
}
