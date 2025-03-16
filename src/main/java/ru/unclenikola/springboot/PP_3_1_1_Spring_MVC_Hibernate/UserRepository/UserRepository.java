package ru.unclenikola.springboot.PP_3_1_1_Spring_MVC_Hibernate.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.unclenikola.springboot.PP_3_1_1_Spring_MVC_Hibernate.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> id(Long id);
}
