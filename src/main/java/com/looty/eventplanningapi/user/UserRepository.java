package com.looty.eventplanningapi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The {@link User} repository
 *
 * @author stever410 (ngotanduc410@gmail.com)
 * @since 7/20/23
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
