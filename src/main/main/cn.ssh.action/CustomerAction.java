package cn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.ssh.model.Customer;
import cn.ssh.service.inter.CustomerService;

public class CustomerAction extends ActionSupport {
	private Customer customer;
	private CustomerService service;
	private Integer id;
	public String show(){
		System.out.println("进入此方法了吗?");
		customer=service.getCustomerByKey(id);
		return SUCCESS;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerService getService() {
		return service;
	}
	public void setService(CustomerService service) {
		this.service = service;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

}
