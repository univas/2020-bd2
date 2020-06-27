package br.edu.univas.si5.bd2.model.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class State implements Serializable {

	@Id
	private Integer ibgeUF;

	@Column(name = "nome")
	private String name;

	@Column(name = "sigla")
	private String initials;

	@OneToMany(mappedBy = "state")
	private Set<City> cities;

	public State() {
	}

	public Integer getIbgeUF() {
		return ibgeUF;
	}

	public void setIbgeUF(Integer ibgeUF) {
		this.ibgeUF = ibgeUF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "State [ibgeUF=" + ibgeUF + ", name=" + name + ", initials=" + initials + "]";
	}
	
}
