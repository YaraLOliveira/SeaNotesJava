package com.projeto.notesea.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.notesea.model.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
	//Objeto de acesso a dados ou Data Access Object - DAO
}
