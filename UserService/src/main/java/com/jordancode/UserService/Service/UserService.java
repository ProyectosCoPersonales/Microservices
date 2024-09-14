package com.jordancode.UserService.Service;

import com.jordancode.UserService.Model.User;

public interface UserService {
    User findUserProfileByJwt(String jwt) throws Exception;
    User findUserByEmail(String email) throws Exception;
    User findUserById(Long userId) throws Exception;

}
