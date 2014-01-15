package br.com.maker.dailyhealth.entity;

import java.sql.Timestamp;
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
@Table(name = "REGISTRO")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REGISTRO")
	private Long id;

	@Column(name = "DATA_CRIACAO")
	private Timestamp dataCriacao;

	@Column(name = "LOCAL")
	private String local;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REGISTRO_EVENTO", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_EVENTO"))
	private List<Evento> eventos;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REGISTRO_REFEICAO", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_REFEICAO"))
	private List<Refeicao> refeicoes;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REGISTRO_ATIVIDADE", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_ATIVIDADE"))
	private List<Atividade> atividades;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Timestamp dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
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

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

}
