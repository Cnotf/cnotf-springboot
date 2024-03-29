package com.gwq.cnotf.entity.ds2;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:23 2019/06/14
 */
@Entity
@Table(name = "vue_custom", schema = "vuemail", catalog = "")
//忽略属性
@JsonIgnoreProperties({"phone","address"})
//自定义命名格式规则
@JsonNaming(PropertyNamingStrategy.LowerCaseStrategy.class)
public class VueCustomEntity {

    //定义json组 用以只显示某些属性
    public interface CustomEnglishNameView {};
    public interface CustomChineseNameView {};
    private long id;
    @JsonView(CustomEnglishNameView.class)
    private String customEnglishName;
    @JsonView(CustomChineseNameView.class)
    private String customChineseName;
    @JsonIgnore
    private String phone;
    private String address;
    private String customStatus;
    //json别名
    @JsonProperty("gwq_flag")
    private String deleteFlag;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Custom_english_name")
    public String getCustomEnglishName() {
        return customEnglishName;
    }

    public void setCustomEnglishName(String customEnglishName) {
        this.customEnglishName = customEnglishName;
    }

    @Basic
    @Column(name = "Custom_chinese_name")
    public String getCustomChineseName() {
        return customChineseName;
    }

    public void setCustomChineseName(String customChineseName) {
        this.customChineseName = customChineseName;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Custom_status")
    public String getCustomStatus() {
        return customStatus;
    }

    public void setCustomStatus(String customStatus) {
        this.customStatus = customStatus;
    }

    @Basic
    @Column(name = "Delete_flag")
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VueCustomEntity that = (VueCustomEntity) o;
        return id == that.id &&
                Objects.equals(customEnglishName, that.customEnglishName) &&
                Objects.equals(customChineseName, that.customChineseName) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(customStatus, that.customStatus) &&
                Objects.equals(deleteFlag, that.deleteFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, customEnglishName, customChineseName, phone, address, customStatus, deleteFlag);
    }
}
