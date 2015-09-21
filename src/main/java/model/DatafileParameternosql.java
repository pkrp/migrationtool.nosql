package model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;
import org.icatproject.core.entity.Comment;

@Entity
@NoSql(dataFormat=DataFormatType.MAPPED)
public class DatafileParameternosql {
	
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
	private String mod_id;

	@Temporal(TemporalType.TIMESTAMP)
	@Basic
	private Date mod_time;

	private Long datafile_id;
	
	private Long parameter_type_id;
	
	private String string_value;

	private Double numeric_value;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime_value;

	private Double rangetop;

	private Double rangebottom;

	private Double error;
	
	public DatafileParameternosql() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getDatafile_id() {
		return datafile_id;
	}

	public void setDatafile_id(Long datafile_id) {
		this.datafile_id = datafile_id;
	}

	public Long getParameter_type_id() {
		return parameter_type_id;
	}

	public void setParameter_type_id(Long parameter_type_id) {
		this.parameter_type_id = parameter_type_id;
	}

	public String getString_value() {
		return string_value;
	}

	public void setString_value(String string_value) {
		this.string_value = string_value;
	}

	public Double getNumeric_value() {
		return numeric_value;
	}

	public void setNumeric_value(Double numeric_value) {
		this.numeric_value = numeric_value;
	}

	public Date getDatetime_value() {
		return datetime_value;
	}

	public void setDatetime_value(Date datetime_value) {
		this.datetime_value = datetime_value;
	}

	public Double getRangetop() {
		return rangetop;
	}

	public void setRangetop(Double rangetop) {
		this.rangetop = rangetop;
	}

	public Double getRangebottom() {
		return rangebottom;
	}

	public void setRangebottom(Double rangebottom) {
		this.rangebottom = rangebottom;
	}

	public Double getError() {
		return error;
	}

	public void setError(Double error) {
		this.error = error;
	}

}
