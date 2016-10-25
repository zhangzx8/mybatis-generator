package com.gome.upm.domain.auto;

import java.math.BigDecimal;
import java.util.Date;

public class MoAutoshopPrice {
    private Integer id;

    private String skuNo;

    private String term;

    private String productUri;

    private Date searchDate;

    private BigDecimal firstPshellPrice;

    private BigDecimal detailPshellPrice;

    private BigDecimal detailPromPrice;

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

    public String getProductUri() {
        return productUri;
    }

    public void setProductUri(String productUri) {
        this.productUri = productUri == null ? null : productUri.trim();
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    public BigDecimal getFirstPshellPrice() {
        return firstPshellPrice;
    }

    public void setFirstPshellPrice(BigDecimal firstPshellPrice) {
        this.firstPshellPrice = firstPshellPrice;
    }

    public BigDecimal getDetailPshellPrice() {
        return detailPshellPrice;
    }

    public void setDetailPshellPrice(BigDecimal detailPshellPrice) {
        this.detailPshellPrice = detailPshellPrice;
    }

    public BigDecimal getDetailPromPrice() {
        return detailPromPrice;
    }

    public void setDetailPromPrice(BigDecimal detailPromPrice) {
        this.detailPromPrice = detailPromPrice;
    }
}