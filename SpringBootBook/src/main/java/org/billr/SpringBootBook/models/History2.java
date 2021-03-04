package org.billr.SpringBootBook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history2")
public class History2 {
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer historyId;

    private Double jan;
    private Double feb;
    private Double apr;
    private Double may;
    private Double jun;
    private Double jul;
    private Double aug;
    private Double sep;
    private Double oct;      
    private Double nov;
    private Double Xdec;
    private Double mar;

}