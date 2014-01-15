package br.com.maker.dailyhealth.entity;

import java.util.Date;
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
@Table(name = "EVENTO")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EVENTO")
	private Long id;

	@Column(name = "DATA_EVENTO")
	private Date date;

	@Column(name = "LOCAL")
	private String local;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EVENTO_MEDICAMENTO", joinColumns = @JoinColumn(name = "ID_MEDICAMENTO"), inverseJoinColumns = @JoinColumn(name = "ID_EVENTO"))
	private List<Medicamento> medicamentos;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REGISTRO_EVENTO", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_EVENTO"))
	private List<Registro> registros;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EVENTO_SINTOMA", joinColumns = @JoinColumn(name = "ID_SINTOMA"), inverseJoinColumns = @JoinColumn(name = "ID_EVENTO"))
	private List<Sintoma> sintomas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}
	
}
