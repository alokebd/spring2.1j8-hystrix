package com.ait.tech.rentcloud.model.customer;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "loyalityPoint")
@Data
public class Loyality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int point;
   	private LocalDateTime expireDate;
   	
  	@ManyToOne(cascade = { CascadeType.PERSIST, 
    		CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinColumn(name = "fk_customer_id",  referencedColumnName = "id")
	private Customer customer;

}
