package br.edu.univas.si5.bd2.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="GESTOR")
public class Manager implements Serializable {

	@Id
	@Column(name="REGISTRO")
	private Integer registry;
	
	@Column(name="NOME")
	private String name;
	
	@Column(name="INICIOMANDATO")
	@Temporal(TemporalType.DATE)
	private Date start;
	
	public Manager() {
	}

	public Integer getRegistry() {
		return registry;
	}

	public void setRegistry(Integer registry) {
		this.registry = registry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Manager [registry=" + registry + ", name=" + name + ", start=" + start + "]";
	}
	
}
