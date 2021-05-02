package br.com.RestTemplates.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "municipio")
public class Municipio implements Serializable {	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6357592102692318615L;

	@Id
	private Integer id;
	
	@Column(name =  "nome")
	private String nome;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn (name = "microrregiao_id")
	private Microrregiao microrregiao;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn (name = "regiaoImediata_id")
	@JsonProperty("regiao-imediata")
	private RegiaoImediata regiaoImediata;	
	
	
	
	
}
