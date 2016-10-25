package com.gome.upm.domain.auto;

import java.util.Date;

public class MoAutoshopBuy {
    private Integer id;

    private String skuNo;

    private String term;

    private String pruductUri;

    private Date searchDate;

    private Integer firstPshellStatus;

    private Integer detailPshellStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo == null ? null : skuNo.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getPruductUri() {
        return pruductUri;
    }

    public void setPruductUri(String pruductUri) {
        this.pruductUri = pruductUri == null ? null : pruductUri.trim();
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    public Integer getFirstPshellStatus() {
        return firstPshellStatus;
    }

    public void setFirstPshellStatus(Integer firstPshellStatus) {
        this.firstPshellStatus = firstPshellStatus;
    }

    public Integer getDetailPshellStatus() {
        return detailPshellStatus;
    }

    public void setDetailPshellStatus(Integer detailPshellStatus) {
        this.detailPshellStatus = detailPshellStatus;
    }
}