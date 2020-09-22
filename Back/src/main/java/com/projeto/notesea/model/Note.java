package com.projeto.notesea.model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "nota")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private Integer id;
	
	
	@Column(name = "nome")
	@Getter private String nome;
	
	
	
	@Column(name = "descricao")
	@Getter @Setter 
	private String descrição;
	
	
	@ManyToOne
	@Getter @Setter 
	private User fk_idusuario;
	
}
