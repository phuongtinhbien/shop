package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_TYPE", schema = "INTERN", catalog = "")
public class ProductType {
    private long productTypeId;
    private String productTypeCode;
    private String productTypeName;
    private String productTypeContent;
    private Time createDate;
    private String staffCreate;
    private Time updateDate;
    private String staffUpdate;
    private String searchName;

    @Basic
    @GeneratedValue
    @Column(name = "PRODUCT_TYPE_ID")
    public long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(long productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Id
    @Column(name = "PRODUCT_TYPE_CODE")
    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    @Basic
    @Column(name = "PRODUCT_TYPE_NAME")
    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    @Basic
    @Column(name = "PRODUCT_TYPE_CONTENT")
    public String getProductTypeContent() {
        return productTypeContent;
    }

    public void setProductTypeContent(String productTypeContent) {
        this.productTypeContent = productTypeContent;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public Time getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
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
    @Column(name = "UPDATE_DATE")
    public Time getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Time updateDate) {
        this.updateDate = updateDate;
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
    @Column(name = "SEARCH_NAME")
    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductType that = (ProductType) o;
        return productTypeId == that.productTypeId &&
                Objects.equals(productTypeCode, that.productTypeCode) &&
                Objects.equals(productTypeName, that.productTypeName) &&
                Objects.equals(productTypeContent, that.productTypeContent) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(searchName, that.searchName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productTypeId, productTypeCode, productTypeName, productTypeContent, createDate, staffCreate, updateDate, staffUpdate, searchName);
    }
}
