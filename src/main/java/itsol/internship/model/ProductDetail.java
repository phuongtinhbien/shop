package itsol.internship.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_DETAIL", schema = "INTERN", catalog = "")
public class ProductDetail {
    private long productDetailId;
    private String productCode;
    private long productPriceId;
    private String imgCode;
    private String colorCode;
    private String productSize;
    private Long weight;
    private String supplier;

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_DETAIL_ID")
    public long getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(long productDetailId) {
        this.productDetailId = productDetailId;
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
    @Column(name = "PRODUCT_PRICE_ID")
    public long getProductPriceId() {
        return productPriceId;
    }

    public void setProductPriceId(long productPriceId) {
        this.productPriceId = productPriceId;
    }

    @Basic
    @Column(name = "IMG_CODE")
    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    @Basic
    @Column(name = "COLOR_CODE")
    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Basic
    @Column(name = "PRODUCT_SIZE")
    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    @Basic
    @Column(name = "WEIGHT")
    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "SUPPLIER")
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetail that = (ProductDetail) o;
        return productDetailId == that.productDetailId &&
                productPriceId == that.productPriceId &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(imgCode, that.imgCode) &&
                Objects.equals(colorCode, that.colorCode) &&
                Objects.equals(productSize, that.productSize) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(supplier, that.supplier);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productDetailId, productCode, productPriceId, imgCode, colorCode, productSize, weight, supplier);
    }
}
