package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Categorynews {
    private long categoryNewsId;
    private String categoryNewsCode;
    private String categoryNewsName;
    private Time createdDate;
    private Time updatedDate;
    private String staffCreate;
    private String staffUpdate;
    private boolean status;

    @Basic
    @GeneratedValue
    @Column(name = "CATEGORY_NEWS_ID")
    public long getCategoryNewsId() {
        return categoryNewsId;
    }

    public void setCategoryNewsId(long categoryNewsId) {
        this.categoryNewsId = categoryNewsId;
    }

    @Id
    @Column(name = "CATEGORY_NEWS_CODE")
    public String getCategoryNewsCode() {
        return categoryNewsCode;
    }

    public void setCategoryNewsCode(String categoryNewsCode) {
        this.categoryNewsCode = categoryNewsCode;
    }

    @Basic
    @Column(name = "CATEGORY_NEWS_NAME")
    public String getCategoryNewsName() {
        return categoryNewsName;
    }

    public void setCategoryNewsName(String categoryNewsName) {
        this.categoryNewsName = categoryNewsName;
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
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
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
    @Column(name = "STAFF_UPDATE")
    public String getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(String staffUpdate) {
        this.staffUpdate = staffUpdate;
    }

    @Basic
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorynews that = (Categorynews) o;
        return categoryNewsId == that.categoryNewsId &&
                status == that.status &&
                Objects.equals(categoryNewsCode, that.categoryNewsCode) &&
                Objects.equals(categoryNewsName, that.categoryNewsName) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(staffUpdate, that.staffUpdate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(categoryNewsId, categoryNewsCode, categoryNewsName, createdDate, updatedDate, staffCreate, staffUpdate, status);
    }
}
