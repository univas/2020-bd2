package br.edu.univas.si5.bd2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CIDADE")
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CitySeqGen")
	@SequenceGenerator(name="CitySeqGen", sequenceName="SEQ_CIDADE", allocationSize=1)
	private Integer ibge;

	private Integer area;

	@Column(name="NOME")
	private String name;

	@OneToOne
	@JoinColumn(name="REGISTRO_FK")
	private Manager manager;
	
	@ManyToOne
	@JoinColumn(name="IBGEUF_FK")
	private State state;

	public City() {
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [ibge=" + ibge + ", area=" + area + ", name=" + name + ", manager=" + manager + "]";
	}
}
