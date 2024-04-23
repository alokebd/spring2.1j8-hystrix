package com.ait.tech.rentcloud.model.customer;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "customer")
@Data
public class Customer {
  	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipcode;
   
    //NOTE One2Many mappedBy = "customer" should work but as it is not saving customer ID, joinColum  is used in parent (Customer) and 
    //child (Loyality) side.
    @OneToMany(fetch = FetchType.LAZY, 
    		cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH }, orphanRemoval = true)
    @JoinColumn(name = "fk_customer_id", referencedColumnName = "id")
    private List<Loyality> loyalities;

}
