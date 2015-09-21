package model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;

@Entity
@NoSql(dataFormat=DataFormatType.MAPPED)
public class Facilitynosql {
	
	public Facilitynosql() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	@Field(name="_id")
	protected String id;

	@Basic
	private String description;
	
	@Basic
	private int daysuntilrelease;
	
	@Basic
	private String fullname;
	
	@Basic
	private String name;
	
	@Basic
	private String url;
	
	@Basic
	private String create_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date create_time;
	
	@Basic
	private String mod_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date mod_time;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDaysuntilrelease() {
		return daysuntilrelease;
	}

	public void setDaysuntilrelease(int i) {
		this.daysuntilrelease = i;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String string) {
		this.create_id = string;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getMod_id() {
		return mod_id;
	}

	public void setMod_id(String mod_id) {
		this.mod_id = mod_id;
	}

	public Date getMod_time() {
		return mod_time;
	}

	public void setMod_time(Date mod_time) {
		this.mod_time = mod_time;
	}
}
