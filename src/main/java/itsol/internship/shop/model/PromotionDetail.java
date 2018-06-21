package itsol.internship.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PromotionDetail {
    private long promotionDetailId;
    private String productCode;
    private Long quantity;

    @Id
    @GeneratedValue
    @Column(name = "PROMOTION_DETAIL_ID")
    public long getPromotionDetailId() {
        return promotionDetailId;
    }

    public void setPromotionDetailId(long promotionDetailId) {
        this.promotionDetailId = promotionDetailId;
    }

    @Basic
    @Column(name = "PRODUCT_CODE")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "QUANTITY")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionDetail that = (PromotionDetail) o;
        return promotionDetailId == that.promotionDetailId &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(promotionDetailId, productCode, quantity);
    }
}
