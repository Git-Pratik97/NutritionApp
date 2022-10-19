package com.group_4_trial_1.Nutri_App_user_Trial.repository;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
 * Author : Pratik
 * Version : 1.0
 * Date : 19-10-2022
 * Description : This is UserRepository.
 */

@Repository
/*Repository annotation is used to indicate that the class provides the mechanism
 * for storage, retrieval, search, update and delete operation on objects*/
public interface UserRepository extends JpaRepository<User, Long> {

    // Postgres query -> SELECT user from user_table WHERE user_identification = ?;
    @Query("SELECT u FROM User u WHERE u.userId = ?1")
    Optional<User> findByUserId(String userId);

//    @Query("DELETE from Userdto u WHERE u.userId = ?1")
//    void deleteByuserId(String userId);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<User> findUserByemail(String email);
}
