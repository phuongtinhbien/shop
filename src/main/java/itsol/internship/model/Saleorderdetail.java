package itsol.internship.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Saleorderdetail {
    private long sodId;
    private String soCode;
    private String productCode;
    private String productName;
    private String sizeSp;
    private String color;
    private String weight;
    private long price;
    private long quantity;
    private long amount;
    private String promotionCode;
    private boolean freeItem;

    @Id
    @GeneratedValue
    @Column(name = "SOD_ID")
    public long getSodId() {
        return sodId;
    }

    public void setSodId(long sodId) {
        this.sodId = sodId;
    }

    @Basic
    @Column(name = "SO_CODE")
    public String getSoCode() {
        return soCode;
    }

    public void setSoCode(String soCode) {
        this.soCode = soCode;
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
    @Column(name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "SIZE_SP")
    public String getSizeSp() {
        return sizeSp;
    }

    public void setSizeSp(String sizeSp) {
        this.sizeSp = sizeSp;
    }

    @Basic
    @Column(name = "COLOR")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "WEIGHT")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "PRICE")
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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
    @Column(name = "AMOUNT")
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "PROMOTION_CODE")
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    @Basic
    @Column(name = "FREE_ITEM")
    public boolean isFreeItem() {
        return freeItem;
    }

    public void setFreeItem(boolean freeItem) {
        this.freeItem = freeItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saleorderdetail that = (Saleorderdetail) o;
        return sodId == that.sodId &&
                price == that.price &&
                quantity == that.quantity &&
                amount == that.amount &&
                freeItem == that.freeItem &&
                Objects.equals(soCode, that.soCode) &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(sizeSp, that.sizeSp) &&
                Objects.equals(color, that.color) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(promotionCode, that.promotionCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sodId, soCode, productCode, productName, sizeSp, color, weight, price, quantity, amount, promotionCode, freeItem);
    }
}
