package com.fsn.modle;

//import com.ruoyi.common.core.domain.BaseEntity;
//import org.apache.commons.lang3.builder.ToStringBuilder;
//import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 订单表 ws_order
 *
 * @author ruoyi
 * @date 2019-08-22
 */
public class WsOrder { //extends BaseEntity
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 商品ID
     */
    private Long productId;
    /**
     * 商品编号
     */
    private String productNo;
    /**
     *
     */
    private String productName;
    /**
     * 下单用户账号
     */
    private String purchaseId;
    /**
     * 下单用户Id
     **/
    private Long customerId;
    /**
     * 购买数量
     */
    private Integer mount;
    /**
     * 邮费
     */
    private Integer fare;
    /**
     * 总价格
     */
    private Double sumPrice;
    /**
     * 优惠券
     */
    private Integer coupon;
    /**
     * 积分
     */
    private double score;
    /**
     * 价格,规格Id
     */
    private Long priceId;

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Long getPriceId() {

        return priceId;
    }

    /**
     * 商品价格
     */
    private double price;
    /**
     * 订单状态：订单状态：0->待付款；1->待发货；2->待收货；3->待评价；4->已完成；5->取消订单；6—>售后
     */
    private Integer status;
    /**
     * 所属平台
     */
    private Long addressId;
    private Integer plateForm;
    /**
     * 收件人
     */
    private String person;
    /**
     * 收件地址
     */
    private String address;
    /**
     * 收件电话
     */
    private String tele;

    private Date createTime;
    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 发货时间
     */
    private Date diliveryTime;
    /**
     * 确认收货时间
     */
    private Date confirmTime;
    /**
     * 评论时间
     */
    private Date tickingTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 修改原因
     */
    private String modifyReason;
    /**
     * 物流编号
     */
    private String diliveryId;
    /**
     * 物流公司
     */
    private String diliveryCompany;
    /**
     * 商品购买规格
     */
    private String productSpecs;
    //实付款
    private double realityPrice;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Integer getCoupon() {
        return coupon;
    }

    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getPlateForm() {
        return plateForm;
    }

    public void setPlateForm(Integer plateForm) {
        this.plateForm = plateForm;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDiliveryTime() {
        return diliveryTime;
    }

    public void setDiliveryTime(Date diliveryTime) {
        this.diliveryTime = diliveryTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getTickingTime() {
        return tickingTime;
    }

    public void setTickingTime(Date tickingTime) {
        this.tickingTime = tickingTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyReason() {
        return modifyReason;
    }

    public void setModifyReason(String modifyReason) {
        this.modifyReason = modifyReason;
    }

    public String getDiliveryId() {
        return diliveryId;
    }

    public void setDiliveryId(String diliveryId) {
        this.diliveryId = diliveryId;
    }

    public String getDiliveryCompany() {
        return diliveryCompany;
    }

    public void setDiliveryCompany(String diliveryCompany) {
        this.diliveryCompany = diliveryCompany;
    }

    public String getProductSpecs() {
        return productSpecs;
    }

    public void setProductSpecs(String productSpecs) {
        this.productSpecs = productSpecs;
    }

    public double getRealityPrice() {
        return realityPrice;
    }

    public void setRealityPrice(double realityPrice) {
        this.realityPrice = realityPrice;
    }
}