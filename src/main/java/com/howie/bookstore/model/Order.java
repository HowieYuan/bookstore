package com.howie.bookstore.model;
/**
 * Created with IntelliJ IDEA
 *
 * @Author  yuanhaoyue swithaoy@gmail.com
 * @Description  订单
 * @Date 2019-01-02 
 */

public class Order {

	private Integer id;

	/**
	 * 订单id
	 */
	private String orderId;

	/**
	 * 购买人id
	 */
	private Integer purchaserId;

	/**
	 * 书本id
	 */
	private Integer bookId;

	/**
	 * 书本数量
	 */
	private Integer bookNum;

	/**
	 * 金额
	 */
	private String amount;

	/**
	 * 付款方式
	 */
	private String paymentMethod;

	/**
	 * 快递公司
	 */
	private String express;

	/**
	 * 地址
	 */
	private String adress;

	/**
	 * 交易时间
	 */
	private String date;

	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 读者信息
	 */
	private Reader reader;
	/**
	 * 书名
	 */
	private String bookName;

	public Order() {
	}

	public Order(Reader reader) {
		this.reader = reader;
	}

	public Order(Integer id, String orderId, Integer purchaserId, Integer bookId,
				 Integer bookNum, String amount, String paymentMethod, String express,
				 String adress, String date, String status, String bookName) {
		this.id = id;
		this.orderId = orderId;
		this.purchaserId = purchaserId;
		this.bookId = bookId;
		this.bookNum = bookNum;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.express = express;
		this.adress = adress;
		this.date = date;
		this.status = status;
		this.bookName = bookName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getPurchaserId() {
		return this.purchaserId;
	}

	public void setPurchaserId(Integer purchaserId) {
		this.purchaserId = purchaserId;
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getBookNum() {
		return this.bookNum;
	}

	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getExpress() {
		return this.express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = (date.split("\\."))[0];
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
