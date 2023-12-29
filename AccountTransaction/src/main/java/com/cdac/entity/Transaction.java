package com.cdac.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "tbl_transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tx_no")
	private int txno;
	
	private String type;
	private double amount;
	private LocalDateTime dateTime;
	
	@ManyToOne
	@JoinColumn(name = "acc_no")
	private Account account;

	public int getTxno() {
		return txno;
	}

	public void setTxno(int txno) {
		this.txno = txno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
