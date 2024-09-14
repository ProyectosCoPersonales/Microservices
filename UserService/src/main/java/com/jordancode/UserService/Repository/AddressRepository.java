package com.jordancode.UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jordancode.UserService.Model.Address;
import com.jordancode.UserService.Model.User;

public interface AddressRepository extends JpaRepository<Address,Long>{
    Address findByOwner(User owner);
}
