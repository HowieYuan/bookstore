package com.howie.bookstore.model;

/**
 * Created with IntelliJ IDEA
 *
 * @Author  yuanhaoyue swithaoy@gmail.com
 * @Description  读者顾客
 * @Date 2019-01-02 
 */

public class Reader {
	/**
	 * id
	 */
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 电话
	 */
	private String tel;

	/**
	 * 购买数量
	 */
	private Integer purchaseSum;

	public Reader() {
	}

	public Reader(Integer id, String name, String gender, Integer age, String tel,
				  Integer purchaseSum) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.purchaseSum = purchaseSum;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getPurchaseSum() {
		return this.purchaseSum;
	}

	public void setPurchaseSum(Integer purchaseSum) {
		this.purchaseSum = purchaseSum;
	}

}
