package ru.mikhailov.socialmedia.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mikhailov.socialmedia.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
