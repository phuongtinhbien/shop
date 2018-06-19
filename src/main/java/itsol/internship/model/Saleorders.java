package itsol.internship.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Saleorders {
    private long soId;
    private String soCode;
    private String customerCode;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private String commment;
    private String staffCreate;
    private String staffApprove;
    private String staffUpdate;
    private Time createdDate;
    private Time updatedDate;
    private Boolean status;
    private String reasonReject;
    private String payment;
    private Time sendDate;
    private Time sendedDate;
    private Long paidMoney;
    private String staffComment;
    private String promotionCode;

    @Basic
    @GeneratedValue
    @Column(name = "SO_ID")
    public long getSoId() {
        return soId;
    }

    public void setSoId(long soId) {
        this.soId = soId;
    }

    @Id
    @Column(name = "SO_CODE")
    public String getSoCode() {
        return soCode;
    }

    public void setSoCode(String soCode) {
        this.soCode = soCode;
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
    @Column(name = "RECEIVER_NAME")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "RECEIVER_PHONE")
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "RECEIVER_ADDRESS")
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Basic
    @Column(name = "COMMMENT")
    public String getCommment() {
        return commment;
    }

    public void setCommment(String commment) {
        this.commment = commment;
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
    @Column(name = "STAFF_APPROVE")
    public String getStaffApprove() {
        return staffApprove;
    }

    public void setStaffApprove(String staffApprove) {
        this.staffApprove = staffApprove;
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
    @Column(name = "STATUS")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "REASON_REJECT")
    public String getReasonReject() {
        return reasonReject;
    }

    public void setReasonReject(String reasonReject) {
        this.reasonReject = reasonReject;
    }

    @Basic
    @Column(name = "PAYMENT")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "SEND_DATE")
    public Time getSendDate() {
        return sendDate;
    }

    public void setSendDate(Time sendDate) {
        this.sendDate = sendDate;
    }

    @Basic
    @Column(name = "SENDED_DATE")
    public Time getSendedDate() {
        return sendedDate;
    }

    public void setSendedDate(Time sendedDate) {
        this.sendedDate = sendedDate;
    }

    @Basic
    @Column(name = "PAID_MONEY")
    public Long getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(Long paidMoney) {
        this.paidMoney = paidMoney;
    }

    @Basic
    @Column(name = "STAFF_COMMENT")
    public String getStaffComment() {
        return staffComment;
    }

    public void setStaffComment(String staffComment) {
        this.staffComment = staffComment;
    }

    @Basic
    @Column(name = "PROMOTION_CODE")
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saleorders that = (Saleorders) o;
        return soId == that.soId &&
                Objects.equals(soCode, that.soCode) &&
                Objects.equals(customerCode, that.customerCode) &&
                Objects.equals(receiverName, that.receiverName) &&
                Objects.equals(receiverPhone, that.receiverPhone) &&
                Objects.equals(receiverAddress, that.receiverAddress) &&
                Objects.equals(commment, that.commment) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(staffApprove, that.staffApprove) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(reasonReject, that.reasonReject) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(sendDate, that.sendDate) &&
                Objects.equals(sendedDate, that.sendedDate) &&
                Objects.equals(paidMoney, that.paidMoney) &&
                Objects.equals(staffComment, that.staffComment) &&
                Objects.equals(promotionCode, that.promotionCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(soId, soCode, customerCode, receiverName, receiverPhone, receiverAddress, commment, staffCreate, staffApprove, staffUpdate, createdDate, updatedDate, status, reasonReject, payment, sendDate, sendedDate, paidMoney, staffComment, promotionCode);
    }
}
