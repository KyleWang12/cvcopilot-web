package com.cvcopilot.repository;

import com.cvcopilot.models.userAuth.ERole;
import com.cvcopilot.models.userAuth.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
