package model;

import java.io.Serializable;

import javax.persistence.*;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;

import java.util.Date;


/**
 * The persistent class for the DATAFILE noql database table.
 * 
 */
@Entity
@NoSql(dataFormat=DataFormatType.MAPPED)
public class Datasetnosql implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Field(name="_id")
	protected Long id;

	@Basic
	private String create_id;

	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date create_time;

	@Basic
	private String description;

	@Basic
	private String doi;

	@Basic
	private String location;

	@Basic
	private String mod_id;

	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date mod_time;

	private String name;

	private Long investigation_id;
	
	private Long sample_id;
	
	private Long type_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	private boolean complete;
	
	public Datasetnosql() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreate_Id() {
		return this.create_id;
	}

	public void setCreate_Id(String createId) {
		this.create_id = createId;
	}

	public Date getCreate_Time() {
		return this.create_time;
	}

	public void setCreate_Time(Date createTime) {
		this.create_time = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoi() {
		return this.doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMod_Id() {
		return this.mod_id;
	}

	public void setMod_Id(String modId) {
		this.mod_id = modId;
	}

	public Date getMod_Time() {
		return this.mod_time;
	}

	public void setMod_Time(Date modTime) {
		this.mod_time = modTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String create_id) {
		this.create_id = create_id;
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

	public Long getInvestigation_id() {
		return investigation_id;
	}

	public void setInvestigation_id(Long investigation_id) {
		this.investigation_id = investigation_id;
	}

	public Long getSample_id() {
		return sample_id;
	}

	public void setSample_id(Long sample_id) {
		this.sample_id = sample_id;
	}

	public Long getType_id() {
		return type_id;
	}

	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}