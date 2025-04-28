package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="HibernateAnnotations",name="cricketer")
public class cricketer {
	
	@Id
	int cric_id;
	@Column
	String cric_name;
	@Column
	String country;
	@Column
	int matches;
	@Column
	int runs;
	@Column
	int wickets;
	public int getcric_id() {
		return cric_id;
	}
	public void setcric_id(int cric_id) {
		this.cric_id = cric_id;
	}
	public String getcric_name() {
		return cric_name;
	}
	public void setcric_name(String cric_name) {
		this.cric_name = cric_name;
	}
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country = country;
	}
	public int getmatches() {
		return matches;
	}
	public void setmatches(int matches) {
		this.matches = matches;
	}
	public int getruns() {
		return runs;
	}
	public void setruns(int runs) {
		this.runs = runs;
	}
	public int getwickets() {
		return wickets;
	}
	public void setwickets(int wickets) {
		this.wickets =wickets;
	}
	
}

