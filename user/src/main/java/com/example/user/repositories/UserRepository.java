package com.example.user.repositories;

import com.example.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <UserModel, UUID>  {

}
