package model;

import java.io.Serializable;

import javax.persistence.*;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;
import org.icatproject.core.entity.DatafileFormat;

import java.util.Date;


/**
 * The persistent class for the DATAFILE noql database table.
 * 
 */
@Entity
@NoSql(dataFormat=DataFormatType.MAPPED)
public class Datafilenosql implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Field(name="_id")
	protected Long id;

	@Basic
	private String checksum;

	@Basic
	private String create_id;

	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date create_time;

	@Basic
	private Date datafilecreatetime;

	@Basic
	private Date datafilemodtime;

	@Basic
	private String description;

	@Basic
	private String doi;

	@Basic
	private Long filesize;

	@Basic
	private String location;

	@Basic
	private String mod_id;

	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date mod_time;

	private String name;

	private Long datafileformat_id;

	private Long dataset_id;

	public Datafilenosql() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChecksum() {
		return this.checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
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

	public Date getDatafilecreatetime() {
		return this.datafilecreatetime;
	}

	public void setDatafilecreatetime(Date datafilecreatetime) {
		this.datafilecreatetime = datafilecreatetime;
	}

	public Date getDatafilemodtime() {
		return this.datafilemodtime;
	}

	public void setDatafilemodtime(Date datafilemodtime) {
		this.datafilemodtime = datafilemodtime;
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

	public Long getFilesize() {
		return this.filesize;
	}

	public void setFilesize(Long filesize) {
		this.filesize = filesize;
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

	public Long getDatafileformat_id() {
		return this.datafileformat_id;
	}

	public void setDatafileformat_id(Long datafileformat_id) {
		this.datafileformat_id = datafileformat_id;
	}

	public Long getDataset_id() {
		return this.dataset_id;
	}

	public void setDataset_id(Long dataset) {
		this.dataset_id = dataset;
	}

}