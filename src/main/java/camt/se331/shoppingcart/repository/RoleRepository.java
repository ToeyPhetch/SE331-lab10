package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dto on 26/4/2016.
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
