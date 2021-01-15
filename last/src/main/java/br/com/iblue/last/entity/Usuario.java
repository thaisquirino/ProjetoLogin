package br.com.iblue.last.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@Column(name="uuid",unique=true)
	@JsonProperty("uuid")
	
	
	private String uuid;
	
	@Column(name="usuario")
	@JsonProperty ("username")
	private String userName;
	
	@Column(name="email",length=50, unique=true)
	@JsonProperty ("email")
	private String email;
	
	
	@Column(name="password",length=50)
	@JsonProperty("password")
	private String password;
	
	@Column(name="foto",length=250)
	@JsonProperty
	private String foto;
	
	
	{
		uuid = UUID.randomUUID().toString();
	}
	
	
	
	public Usuario() {
		super();
	}



	public Usuario(String uuid, String userName, String email, String password, String foto) {
		super();
		this.uuid = uuid;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.foto = foto;
	}



	@Override
	public String toString() {
		return "Usuario [uuid=" + uuid + ", userName=" + userName + ", email=" + email + ", foto=" + foto + "]";
	}



	public String getUuid() {
		return uuid;
	}



	public void setUuid(String uuid) {
		this.uuid = uuid;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
    

	
	
	
	

}
