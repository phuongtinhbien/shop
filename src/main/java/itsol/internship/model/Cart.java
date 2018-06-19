package itsol.internship.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cart {
    private int cartId;
    private String cartCode;
    private String customerCode;
    private long productDetailId;
    private long quantity;
    private Long status;

    @Basic
    @GeneratedValue
    @Column(name = "CART_ID")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Id
    @Column(name = "CART_CODE")
    public String getCartCode() {
        return cartCode;
    }

    public void setCartCode(String cartCode) {
        this.cartCode = cartCode;
    }

    @Basic
    @Column(name = "CUSTOMER_CODE")
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Basic
    @Column(name = "PRODUCT_DETAIL_ID")
    public long getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(long productDetailId) {
        this.productDetailId = productDetailId;
    }

    @Basic
    @Column(name = "QUANTITY")
    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "STATUS")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return cartId == cart.cartId &&
                productDetailId == cart.productDetailId &&
                quantity == cart.quantity &&
                Objects.equals(cartCode, cart.cartCode) &&
                Objects.equals(customerCode, cart.customerCode) &&
                Objects.equals(status, cart.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cartId, cartCode, customerCode, productDetailId, quantity, status);
    }
}
