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
@Table(name = "REFEICAO")
public class Refeicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REFEICAO")
	private Integer id;
	
	@Column(name = "HORARIO")
	private Date horario;
	
	@Column(name = "LOCAL")
	private String local;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REFEICAO_ALIMENTO", joinColumns = @JoinColumn(name = "ID_ALIMENTO"), inverseJoinColumns = @JoinColumn(name = "ID_REFEICAO"))
	private List<Alimento> alimentos;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "REGISTRO_REFEICAO", joinColumns = @JoinColumn(name = "ID_REGISTRO"), inverseJoinColumns = @JoinColumn(name = "ID_REFEICAO"))
	private List<Registro> registros;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	
	
}
