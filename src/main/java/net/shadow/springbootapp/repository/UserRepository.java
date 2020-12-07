package net.shadow.springbootapp.repository;

import net.shadow.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
