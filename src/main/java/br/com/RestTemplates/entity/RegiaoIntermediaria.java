package br.com.RestTemplates.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="regiaoIntermediaria")
public class RegiaoIntermediaria implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560273693983212746L;

	@Id
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn (name = "uf_id")
	@JsonProperty("UF")
	private Uf uf;
	
	
	
}
