package itsol.internship.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Position {
    private long positionId;
    private String positionCode;
    private String roleCode;
    private String permissionCode;

    @Basic
    @GeneratedValue
    @Column(name = "POSITION_ID")
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    @Id
    @Column(name = "POSITION_CODE")
    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
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
    @Column(name = "PERMISSION_CODE")
    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return positionId == position.positionId &&
                Objects.equals(positionCode, position.positionCode) &&
                Objects.equals(roleCode, position.roleCode) &&
                Objects.equals(permissionCode, position.permissionCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(positionId, positionCode, roleCode, permissionCode);
    }
}
