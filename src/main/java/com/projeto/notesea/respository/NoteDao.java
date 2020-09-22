package com.projeto.notesea.respository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.projeto.notesea.model.Note; 


@Repository
public interface NoteDao extends JpaRepository<Note, Integer>{
	//Objeto de acesso a dados ou Data Access Object - DAO
}
