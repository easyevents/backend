package com.numitorum.ee.repo

import com.numitorum.ee.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    /**
     * Find user by login.
     * Login is unique so method must return only one user.
     */
    fun findByLogin(login: String): User

    fun findByLoginAndPassword(login: String, password: String): User

    fun findByToken(token: String): User
}
