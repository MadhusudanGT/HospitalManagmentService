package com.HospitalManagment.HM.repository;

import com.HospitalManagment.HM.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    @Query(value = "delete  from t_user_roles where users_id= :user_id", nativeQuery = true)
    void deleteRelation(@Param("user_id") Long user_id);
//    @Query("from User where email= :email")
//   User  findByEmail(@Param("email") String email);
}