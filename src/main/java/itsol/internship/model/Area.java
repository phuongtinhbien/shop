package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Area {
    private long areaId;
    private String areaCode;
    private Long province;
    private String provinceName;
    private Long district;
    private String districtName;
    private Time createdDate;
    private String staffCreate;
    private Time updateDate;
    private String staffUpdate;
    private Long precinct;
    private String precinctName;

    @Basic
    @GeneratedValue
    @Column(name = "AREA_ID")
    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    @Id
    @Column(name = "AREA_CODE")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "PROVINCE")
    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    @Basic
    @Column(name = "PROVINCE_NAME")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "DISTRICT")
    public Long getDistrict() {
        return district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    @Basic
    @Column(name = "DISTRICT_NAME")
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
    @Column(name = "PRECINCT")
    public Long getPrecinct() {
        return precinct;
    }

    public void setPrecinct(Long precinct) {
        this.precinct = precinct;
    }

    @Basic
    @Column(name = "PRECINCT_NAME")
    public String getPrecinctName() {
        return precinctName;
    }

    public void setPrecinctName(String precinctName) {
        this.precinctName = precinctName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return areaId == area.areaId &&
                Objects.equals(areaCode, area.areaCode) &&
                Objects.equals(province, area.province) &&
                Objects.equals(provinceName, area.provinceName) &&
                Objects.equals(district, area.district) &&
                Objects.equals(districtName, area.districtName) &&
                Objects.equals(createdDate, area.createdDate) &&
                Objects.equals(staffCreate, area.staffCreate) &&
                Objects.equals(updateDate, area.updateDate) &&
                Objects.equals(staffUpdate, area.staffUpdate) &&
                Objects.equals(precinct, area.precinct) &&
                Objects.equals(precinctName, area.precinctName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(areaId, areaCode, province, provinceName, district, districtName, createdDate, staffCreate, updateDate, staffUpdate, precinct, precinctName);
    }
}
