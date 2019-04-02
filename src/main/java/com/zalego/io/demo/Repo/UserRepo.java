package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.BaseEntity;
import com.zalego.io.demo.entities.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepo extends JpaRepository<Users,Long> {
    @Override
    Optional<Users>findById(Long aLong);
    Optional<Users>findByUuid(UUID uuid);
    Optional<Users>findByEmailAndPassword(String email,String password);
    Optional<Users>findByEmail(String email);

}
