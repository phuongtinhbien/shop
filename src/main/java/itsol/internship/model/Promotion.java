package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Promotion {
    private long promotionId;
    private String promotionCode;
    private String promotionContent;
    private Timestamp timeStart;
    private Timestamp timeEnd;
    private String staffCreate;
    private Time createdDate;
    private boolean status;
    private String staffUpdate;
    private Time updatedDate;
    private boolean detailType;
    private String promotionName;
    private String staffApprove;

    @Basic
    @GeneratedValue
    @Column(name = "PROMOTION_ID")
    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    @Id
    @Column(name = "PROMOTION_CODE")
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    @Basic
    @Column(name = "PROMOTION_CONTENT")
    public String getPromotionContent() {
        return promotionContent;
    }

    public void setPromotionContent(String promotionContent) {
        this.promotionContent = promotionContent;
    }

    @Basic
    @Column(name = "TIME_START")
    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    @Basic
    @Column(name = "TIME_END")
    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
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
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
    @Column(name = "DETAIL_TYPE")
    public boolean isDetailType() {
        return detailType;
    }

    public void setDetailType(boolean detailType) {
        this.detailType = detailType;
    }

    @Basic
    @Column(name = "PROMOTION_NAME")
    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Basic
    @Column(name = "STAFF_APPROVE")
    public String getStaffApprove() {
        return staffApprove;
    }

    public void setStaffApprove(String staffApprove) {
        this.staffApprove = staffApprove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Promotion promotion = (Promotion) o;
        return promotionId == promotion.promotionId &&
                status == promotion.status &&
                detailType == promotion.detailType &&
                Objects.equals(promotionCode, promotion.promotionCode) &&
                Objects.equals(promotionContent, promotion.promotionContent) &&
                Objects.equals(timeStart, promotion.timeStart) &&
                Objects.equals(timeEnd, promotion.timeEnd) &&
                Objects.equals(staffCreate, promotion.staffCreate) &&
                Objects.equals(createdDate, promotion.createdDate) &&
                Objects.equals(staffUpdate, promotion.staffUpdate) &&
                Objects.equals(updatedDate, promotion.updatedDate) &&
                Objects.equals(promotionName, promotion.promotionName) &&
                Objects.equals(staffApprove, promotion.staffApprove);
    }

    @Override
    public int hashCode() {

        return Objects.hash(promotionId, promotionCode, promotionContent, timeStart, timeEnd, staffCreate, createdDate, status, staffUpdate, updatedDate, detailType, promotionName, staffApprove);
    }
}
