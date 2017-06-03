package com.jbit.entity;

import java.util.Date;


/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods  implements java.io.Serializable {


    // Fields    

     private Long id;
     private String goodsname;
     private Long billstatus;
     private Integer goodsdistrict;
     private Integer goodsprice;
     private Integer goodscount;
     private Date creationtime;


    // Constructors

    /** default constructor */
    public Goods() {
    }

	/** minimal constructor */
    public Goods(String goodsname, Long billstatus, Integer goodsdistrict, Date creationtime) {
        this.goodsname = goodsname;
        this.billstatus = billstatus;
        this.goodsdistrict = goodsdistrict;
        this.creationtime = creationtime;
    }
    
    /** full constructor */
    public Goods(String goodsname, Long billstatus, Integer goodsdistrict, Integer goodsprice, Integer goodscount, Date creationtime) {
        this.goodsname = goodsname;
        this.billstatus = billstatus;
        this.goodsdistrict = goodsdistrict;
        this.goodsprice = goodsprice;
        this.goodscount = goodscount;
        this.creationtime = creationtime;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsname() {
        return this.goodsname;
    }
    
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Long getBillstatus() {
        return this.billstatus;
    }
    
    public void setBillstatus(Long billstatus) {
        this.billstatus = billstatus;
    }

    public Integer getGoodsdistrict() {
        return this.goodsdistrict;
    }
    
    public void setGoodsdistrict(Integer goodsdistrict) {
        this.goodsdistrict = goodsdistrict;
    }

    public Integer getGoodsprice() {
        return this.goodsprice;
    }
    
    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodscount() {
        return this.goodscount;
    }
    
    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Date getCreationtime() {
        return this.creationtime;
    }
    
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
   








}