package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Customeraddress {
    private int customerAddressId;
    private String customerCode;
    private String fullName;
    private String phoneNumber;
    private String detailAddress;
    private String areaCode;
    private boolean lockStatus;
    private Time createdDate;
    private Time updatedDate;
    private String personUpdate;
    private Boolean primaryAddress;

    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ADDRESS_ID")
    public int getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(int customerAddressId) {
        this.customerAddressId = customerAddressId;
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
    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "PHONE_NUMBER")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "DETAIL_ADDRESS")
    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Basic
    @Column(name = "AREA_CODE")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "LOCK_STATUS")
    public boolean isLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(boolean lockStatus) {
        this.lockStatus = lockStatus;
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
    @Column(name = "PERSON_UPDATE")
    public String getPersonUpdate() {
        return personUpdate;
    }

    public void setPersonUpdate(String personUpdate) {
        this.personUpdate = personUpdate;
    }

    @Basic
    @Column(name = "PRIMARY_ADDRESS")
    public Boolean getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customeraddress that = (Customeraddress) o;
        return customerAddressId == that.customerAddressId &&
                lockStatus == that.lockStatus &&
                Objects.equals(customerCode, that.customerCode) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(detailAddress, that.detailAddress) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(personUpdate, that.personUpdate) &&
                Objects.equals(primaryAddress, that.primaryAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerAddressId, customerCode, fullName, phoneNumber, detailAddress, areaCode, lockStatus, createdDate, updatedDate, personUpdate, primaryAddress);
    }
}
