package br.com.maker.dailyhealth.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SINTOMA")
public class Sintoma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SINTOMA")
	private Long id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EVENTO_SINTOMA", joinColumns = @JoinColumn(name = "ID_EVENTO"), inverseJoinColumns = @JoinColumn(name = "ID_SINTOMA"))
	private List<Evento> eventos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}
