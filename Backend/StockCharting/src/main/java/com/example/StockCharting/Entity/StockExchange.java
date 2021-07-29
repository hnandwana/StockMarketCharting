package com.example.StockCharting.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "StockExchange")
@NamedQuery(name = "StockExchange.findByname", query = "SELECT s FROM StockExchange s WHERE s.name = :name")
public class StockExchange {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String details;
	public StockExchange(long id, String name, String details, List<Companystockexchangemap> compstockmap) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.compstockmap = compstockmap;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}

	@OneToMany(mappedBy = "stockexchange")
	private List<Companystockexchangemap> compstockmap=new ArrayList();

	protected StockExchange() {
		super();
	}




	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Companystockexchangemap> getCompstockmap() {
		return compstockmap;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompstockmap(List<Companystockexchangemap> compstockmap) {
		this.compstockmap = compstockmap;
	}
	

}
