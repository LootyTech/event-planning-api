package com.looty.eventplanningapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Base entity that defined shared properties across entities
 *
 * @author stever410 (ngotanduc410@gmail.com)
 * @since 7/21/23
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "removed_at")
    private LocalDateTime removedAt;

    /**
     * Sets createdAt before insert
     */
    @PrePersist
    public void setCreationDate() {
        this.createdAt = LocalDateTime.now();
    }

    /**
     * Sets updatedAt before update
     */
    @PreUpdate
    public void setUpdatedDate() {
        this.updatedAt = LocalDateTime.now();
    }
}
