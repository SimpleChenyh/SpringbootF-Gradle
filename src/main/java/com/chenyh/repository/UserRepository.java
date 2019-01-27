package com.chenyh.repository;

import com.chenyh.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM `user` where id = :userId", nativeQuery = true)
    List<Object> customizeNativeSQL(@Param("userId") Integer userId);


}
