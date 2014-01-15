package br.com.maker.dailyhealth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALIMENTO")
public class Alimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ALIMENTO")
	private Long id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "ID_ALIMENTO", referencedColumnName = "ID_ALIMENTO_TIPO")
	private AlimentoTipo alimentoTipo;

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

	public AlimentoTipo getAlimentoTipo() {
		return alimentoTipo;
	}

	public void setAlimentoTipo(AlimentoTipo alimentoTipo) {
		this.alimentoTipo = alimentoTipo;
	}

}
