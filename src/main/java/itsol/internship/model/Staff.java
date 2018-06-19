package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Staff {
    private int staffId;
    private String staffCode;
    private String name;
    private String email;
    private String password;
    private Time createdDate;
    private Time updatedDate;
    private String staffUpdate;
    private String hashString;
    private boolean lockStatus;
    private Integer numLoginFail;
    private String searchName;
    private String avatar;
    private Timestamp lastTimeAccess;
    private String roleCode;
    private String staffCreate;

    @Basic
    @GeneratedValue
    @Column(name = "STAFF_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Id
    @Column(name = "STAFF_CODE")
    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "STAFF_UPDATE")
    public String getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(String staffUpdate) {
        this.staffUpdate = staffUpdate;
    }

    @Basic
    @Column(name = "HASH_STRING")
    public String getHashString() {
        return hashString;
    }

    public void setHashString(String hashString) {
        this.hashString = hashString;
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
    @Column(name = "NUM_LOGIN_FAIL")
    public Integer getNumLoginFail() {
        return numLoginFail;
    }

    public void setNumLoginFail(Integer numLoginFail) {
        this.numLoginFail = numLoginFail;
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
    @Column(name = "AVATAR")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "LAST_TIME_ACCESS")
    public Timestamp getLastTimeAccess() {
        return lastTimeAccess;
    }

    public void setLastTimeAccess(Timestamp lastTimeAccess) {
        this.lastTimeAccess = lastTimeAccess;
    }

    @Basic
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "STAFF_CREATE")
    public String getStaffCreate() {
        return staffCreate;
    }

    public void setStaffCreate(String staffCreate) {
        this.staffCreate = staffCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId == staff.staffId &&
                lockStatus == staff.lockStatus &&
                Objects.equals(staffCode, staff.staffCode) &&
                Objects.equals(name, staff.name) &&
                Objects.equals(email, staff.email) &&
                Objects.equals(password, staff.password) &&
                Objects.equals(createdDate, staff.createdDate) &&
                Objects.equals(updatedDate, staff.updatedDate) &&
                Objects.equals(staffUpdate, staff.staffUpdate) &&
                Objects.equals(hashString, staff.hashString) &&
                Objects.equals(numLoginFail, staff.numLoginFail) &&
                Objects.equals(searchName, staff.searchName) &&
                Objects.equals(avatar, staff.avatar) &&
                Objects.equals(lastTimeAccess, staff.lastTimeAccess) &&
                Objects.equals(roleCode, staff.roleCode) &&
                Objects.equals(staffCreate, staff.staffCreate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(staffId, staffCode, name, email, password, createdDate, updatedDate, staffUpdate, hashString, lockStatus, numLoginFail, searchName, avatar, lastTimeAccess, roleCode, staffCreate);
    }
}
