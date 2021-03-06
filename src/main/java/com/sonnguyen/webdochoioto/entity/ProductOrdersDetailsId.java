package com.sonnguyen.webdochoioto.entity;
// Generated Feb 29, 2020 11:40:05 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductOrdersDetailsId generated by hbm2java
 */
@Embeddable
public class ProductOrdersDetailsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ordersId;
	private int productId;

	public ProductOrdersDetailsId() {
	}

	public ProductOrdersDetailsId(int ordersId, int productId) {
		this.ordersId = ordersId;
		this.productId = productId;
	}

	@Column(name = "orders_id", nullable = false)
	public int getOrdersId() {
		return this.ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	@Column(name = "product_id", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductOrdersDetailsId))
			return false;
		ProductOrdersDetailsId castOther = (ProductOrdersDetailsId) other;

		return (this.getOrdersId() == castOther.getOrdersId()) && (this.getProductId() == castOther.getProductId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrdersId();
		result = 37 * result + this.getProductId();
		return result;
	}

}
