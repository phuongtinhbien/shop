package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Product {
    private long productId;
    private String productCode;
    private String productName;
    private String productTypeCode;
    private boolean status;
    private String staffCreate;
    private Time createdDate;
    private String staffUpdate;
    private Time updatedDate;
    private String searchName;
    private String shortDescription;
    private String detailDescription;

    @Basic
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Id
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
    @Column(name = "PRODUCT_TYPE_CODE")
    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    @Basic
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STAFF_CREATE")
    public String getStaffCreate() {
        return staffCreate;
    }

    public void setStaffCreate(String staffCreate) {
        this.staffCreate = staffCreate;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Time getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Time createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "STAFF_UPDATE")
    public String getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(String staffUpdate) {
        this.staffUpdate = staffUpdate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "SEARCH_NAME")
    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    @Basic
    @Column(name = "SHORT_DESCRIPTION")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "DETAIL_DESCRIPTION")
    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId &&
                status == product.status &&
                Objects.equals(productCode, product.productCode) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productTypeCode, product.productTypeCode) &&
                Objects.equals(staffCreate, product.staffCreate) &&
                Objects.equals(createdDate, product.createdDate) &&
                Objects.equals(staffUpdate, product.staffUpdate) &&
                Objects.equals(updatedDate, product.updatedDate) &&
                Objects.equals(searchName, product.searchName) &&
                Objects.equals(shortDescription, product.shortDescription) &&
                Objects.equals(detailDescription, product.detailDescription);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productCode, productName, productTypeCode, status, staffCreate, createdDate, staffUpdate, updatedDate, searchName, shortDescription, detailDescription);
    }
}
