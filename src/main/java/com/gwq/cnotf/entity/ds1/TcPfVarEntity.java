package com.gwq.cnotf.entity.ds1;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:23 2019/06/14
 */
@Entity
@Table(name = "TC_PF_VAR", schema = "NEWRISK", catalog = "")
public class TcPfVarEntity {
    private int id;
    private String pfId;
    private String calmodel;
    private String confidencelevel;
    private String yldType;
    private String attenuationrate;
    private Long times;
    private String chgDate;
    private String endDate;
    private BigInteger isValid;
    private Timestamp timeMark;
    private String createPrsn;
    private Timestamp createTime;
    private String mdfyPrsn;
    private Timestamp mdfyTime;
    private BigInteger checked;
    private String checkId;
    private String checkName;
    private Timestamp checkTime;
    private String sta;
    private BigInteger deleted;
    private Long historicaldays;
    private Long holdingperiod;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PF_ID")
    public String getPfId() {
        return pfId;
    }

    public void setPfId(String pfId) {
        this.pfId = pfId;
    }

    @Basic
    @Column(name = "CALMODEL")
    public String getCalmodel() {
        return calmodel;
    }

    public void setCalmodel(String calmodel) {
        this.calmodel = calmodel;
    }

    @Basic
    @Column(name = "CONFIDENCELEVEL")
    public String getConfidencelevel() {
        return confidencelevel;
    }

    public void setConfidencelevel(String confidencelevel) {
        this.confidencelevel = confidencelevel;
    }

    @Basic
    @Column(name = "YLD_TYPE")
    public String getYldType() {
        return yldType;
    }

    public void setYldType(String yldType) {
        this.yldType = yldType;
    }

    @Basic
    @Column(name = "ATTENUATIONRATE")
    public String getAttenuationrate() {
        return attenuationrate;
    }

    public void setAttenuationrate(String attenuationrate) {
        this.attenuationrate = attenuationrate;
    }

    @Basic
    @Column(name = "TIMES")
    public Long getTimes() {
        return times;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    @Basic
    @Column(name = "CHG_DATE")
    public String getChgDate() {
        return chgDate;
    }

    public void setChgDate(String chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "END_DATE")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "IS_VALID")
    public BigInteger getIsValid() {
        return isValid;
    }

    public void setIsValid(BigInteger isValid) {
        this.isValid = isValid;
    }

    @Basic
    @Column(name = "TIME_MARK")
    public Timestamp getTimeMark() {
        return timeMark;
    }

    public void setTimeMark(Timestamp timeMark) {
        this.timeMark = timeMark;
    }

    @Basic
    @Column(name = "CREATE_PRSN")
    public String getCreatePrsn() {
        return createPrsn;
    }

    public void setCreatePrsn(String createPrsn) {
        this.createPrsn = createPrsn;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "MDFY_PRSN")
    public String getMdfyPrsn() {
        return mdfyPrsn;
    }

    public void setMdfyPrsn(String mdfyPrsn) {
        this.mdfyPrsn = mdfyPrsn;
    }

    @Basic
    @Column(name = "MDFY_TIME")
    public Timestamp getMdfyTime() {
        return mdfyTime;
    }

    public void setMdfyTime(Timestamp mdfyTime) {
        this.mdfyTime = mdfyTime;
    }

    @Basic
    @Column(name = "CHECKED")
    public BigInteger getChecked() {
        return checked;
    }

    public void setChecked(BigInteger checked) {
        this.checked = checked;
    }

    @Basic
    @Column(name = "CHECK_ID")
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "CHECK_NAME")
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    @Basic
    @Column(name = "CHECK_TIME")
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "STA")
    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    @Basic
    @Column(name = "DELETED")
    public BigInteger getDeleted() {
        return deleted;
    }

    public void setDeleted(BigInteger deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "HISTORICALDAYS")
    public Long getHistoricaldays() {
        return historicaldays;
    }

    public void setHistoricaldays(Long historicaldays) {
        this.historicaldays = historicaldays;
    }

    @Basic
    @Column(name = "HOLDINGPERIOD")
    public Long getHoldingperiod() {
        return holdingperiod;
    }

    public void setHoldingperiod(Long holdingperiod) {
        this.holdingperiod = holdingperiod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TcPfVarEntity that = (TcPfVarEntity) o;
        return id == that.id &&
                Objects.equals(pfId, that.pfId) &&
                Objects.equals(calmodel, that.calmodel) &&
                Objects.equals(confidencelevel, that.confidencelevel) &&
                Objects.equals(yldType, that.yldType) &&
                Objects.equals(attenuationrate, that.attenuationrate) &&
                Objects.equals(times, that.times) &&
                Objects.equals(chgDate, that.chgDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(timeMark, that.timeMark) &&
                Objects.equals(createPrsn, that.createPrsn) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(mdfyPrsn, that.mdfyPrsn) &&
                Objects.equals(mdfyTime, that.mdfyTime) &&
                Objects.equals(checked, that.checked) &&
                Objects.equals(checkId, that.checkId) &&
                Objects.equals(checkName, that.checkName) &&
                Objects.equals(checkTime, that.checkTime) &&
                Objects.equals(sta, that.sta) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(historicaldays, that.historicaldays) &&
                Objects.equals(holdingperiod, that.holdingperiod);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, pfId, calmodel, confidencelevel, yldType, attenuationrate, times, chgDate, endDate, isValid, timeMark, createPrsn, createTime, mdfyPrsn, mdfyTime, checked, checkId, checkName, checkTime, sta, deleted, historicaldays, holdingperiod);
    }
}
