package com.gg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}
	@Id@GeneratedValue
	private int id;
   
}
