package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_PRICE", schema = "INTERN", catalog = "")
public class ProductPrice {
    private long productPriceId;
    private String productCode;
    private long price;
    private String staffCreate;
    private Time updatedDate;
    private String staffUpdate;
    private Time fromDate;
    private Time toDate;
    private Boolean status;

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_PRICE_ID")
    public long getProductPriceId() {
        return productPriceId;
    }

    public void setProductPriceId(long productPriceId) {
        this.productPriceId = productPriceId;
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
    @Column(name = "PRICE")
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
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
    @Column(name = "FROM_DATE")
    public Time getFromDate() {
        return fromDate;
    }

    public void setFromDate(Time fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "TO_DATE")
    public Time getToDate() {
        return toDate;
    }

    public void setToDate(Time toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "STATUS")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPrice that = (ProductPrice) o;
        return productPriceId == that.productPriceId &&
                price == that.price &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(toDate, that.toDate) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productPriceId, productCode, price, staffCreate, updatedDate, staffUpdate, fromDate, toDate, status);
    }
}
