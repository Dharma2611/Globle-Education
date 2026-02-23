package com.code.Globle.Education.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.Globle.Education.Entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {
	 Optional<Roles> findByName(String name);

}
