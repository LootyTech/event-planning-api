package com.looty.eventplanningapi.user;

import com.looty.eventplanningapi.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * User model
 *
 * @author stever410 (ngotanduc410@gmail.com)
 * @since 7/20/23
 */
@Entity
@Getter
@Setter
@Table(name = "app_user")
@SQLDelete(sql = "UPDATE app_user SET removed_at = current_timestamp WHERE id = ?")
@Where(clause = "removed_at is null")
public class User extends BaseEntity {
    private String name;

    private String email;

    private String phoneNumber;

    private String auth0Id;
}
