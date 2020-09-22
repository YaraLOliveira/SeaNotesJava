package com.projeto.notesea.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.notesea.respository.NoteDao;
import com.projeto.notesea.model.Note;

@RestController
@RequestMapping("/note")
public class NoteController {
	
	// injeção de dependência
	@Autowired(required=true)
	private NoteDao noteDao;

	
	@GetMapping
	public List<Note> get() {
		return noteDao.findAll(); 
	}
	
	@PostMapping
	public void post(@RequestBody Note note) {
		noteDao.save(note);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		noteDao.deleteById(id);
	}

}
