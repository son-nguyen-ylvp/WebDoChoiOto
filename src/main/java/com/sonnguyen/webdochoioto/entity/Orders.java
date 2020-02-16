package com.sonnguyen.webdochoioto.entity;
// Generated Feb 16, 2020 6:59:26 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "db_ban_hang_oto")
public class Orders implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Users users;
	private byte[] status;
	private Date orderDate;
	private int totalPrice;
	private Set<ProductOrdersDetails> productOrdersDetailses = new HashSet<ProductOrdersDetails>(0);

	public Orders() {
	}

	public Orders(Users users, Date orderDate, int totalPrice) {
		this.users = users;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}

	public Orders(Users users, byte[] status, Date orderDate, int totalPrice,
			Set<ProductOrdersDetails> productOrdersDetailses) {
		this.users = users;
		this.status = status;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.productOrdersDetailses = productOrdersDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "users_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "status")
	public byte[] getStatus() {
		return this.status;
	}

	public void setStatus(byte[] status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", nullable = false, length = 26)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "total_price", nullable = false)
	public int getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<ProductOrdersDetails> getProductOrdersDetailses() {
		return this.productOrdersDetailses;
	}

	public void setProductOrdersDetailses(Set<ProductOrdersDetails> productOrdersDetailses) {
		this.productOrdersDetailses = productOrdersDetailses;
	}

}