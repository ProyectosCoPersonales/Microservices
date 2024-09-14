package com.jordancode.UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jordancode.UserService.Model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
