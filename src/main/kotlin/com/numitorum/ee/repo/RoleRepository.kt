package com.numitorum.ee.repo

import com.numitorum.ee.model.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role, Long> {
    /**
     * Find role by name.
     * Name is unique so method must return only one role.
     */
    fun findByName(name: String): Role
}
