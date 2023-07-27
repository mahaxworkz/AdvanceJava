package com.xworkz.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

 
 @Table(name = "vehicle")
 @Entity
@NamedQuery(name="findName" ,query="select dto from VehicleDto dto where dto.name=:n")
 @NamedQuery(name="findconsumeAndPower" ,query="select dto from VehicleDto dto where dto.consumes=:c and dto.power=:p")
 @NamedQuery( name="updateType" , query = "update VehicleDto dto set dto.type =:t where dto.name=:n")
 @NamedQuery( name="updateById" , query = "update VehicleDto dto set dto.launchedin =:l ,dto.power =:p where dto.id=:i")
 @NamedQuery( name="deleteByLaunch" ,query = "delete from VehicleDto dto where dto.launchedin =:l")

public class VehicleDto {
	@Id
	private int id;
	@NotEmpty
	@NotBlank
	@Size(min=3 , max=15)
	private String name;
	
	@NotEmpty
	@NotBlank
	@Size(min=3 , max=15)
	private String type;
	@NotEmpty
	@NotBlank
	@Size(min=3 , max=15)
	private String consumes;
	private float power;
	private int launchedin;
	
	
	
	public VehicleDto() {
		System.out.println("default");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConsumes() {
		return consumes;
	}
	public void setConsumes(String consumes) {
		this.consumes = consumes;
	}
	public float getPower() {
		return power;
	}
	public void setPower(float power) {
		this.power = power;
	}
	public int getLaunchedin() {
		return launchedin;
	}
	public void setLaunchedin(int launchedin) {
		this.launchedin = launchedin;
	}
	public VehicleDto(int id, @NotEmpty @NotBlank String name, @NotEmpty @NotBlank String type,
			@NotEmpty @NotBlank String consumes, float power, int launchedin) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.consumes = consumes;
		this.power = power;
		this.launchedin = launchedin;
	}
	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", name=" + name + ", type=" + type + ", consumes=" + consumes + ", power="
				+ power + ", launchedin=" + launchedin + "]";
	}

	

}
