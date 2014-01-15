package br.com.maker.dailyhealth.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ATIVIDADE")
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ATIVIDADE")
	private Long id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "ID_ATIVIDADE_TIPO")
	private AtividadeTipo atividadeTipo;

	@ManyToMany
	@JoinTable(name = "REGISTRO_ATIVIDADE", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_ATIVIDADE"))
	private List<Registro> registros;

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

	public AtividadeTipo getAtividadeTipo() {
		return atividadeTipo;
	}

	public void setAtividadeTipo(AtividadeTipo atividadeTipo) {
		this.atividadeTipo = atividadeTipo;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

}
