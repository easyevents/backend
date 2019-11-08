package com.numitorum.ee.service

import com.numitorum.ee.exception.ServiceException
import com.numitorum.ee.model.RegistrationData
import com.numitorum.ee.model.User
import com.numitorum.ee.repo.RoleRepository
import com.numitorum.ee.repo.UserRepository
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class UserService(var userRepository: UserRepository, var roleRepository: RoleRepository) {

//    @Transactional
//    fun login(login: String, password: String): UserData {
//        try {
//            val user = userRepository.findByLoginAndPassword(login, password)
//            val token = UUID.randomUUID().toString()
//            user.token = token
//            userRepository.save(user)
//            return UserData(login = login, token = token)
//        } catch (e: DataAccessException) {
//            throw ServiceException() // e
//        }
//    }

    fun findByToken(token: String): User { // user dto
        val user = userRepository.findByToken(token)
        // map
        return user
    }

    @Transactional
    fun createUser(registrationData: RegistrationData): String {
        val user = User(registrationData.login, registrationData.password)
        try {
            val role = roleRepository.findByName(registrationData.role)
            user.roles = mutableListOf(role)
            userRepository.save(user)
            return user.id.toString()
        } catch (e: DataAccessException) {
            throw ServiceException()
        }
    }
}
