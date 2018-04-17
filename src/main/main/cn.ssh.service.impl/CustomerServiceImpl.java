package cn.ssh.service.impl;


import cn.ssh.dao.inter.CustomerDao;
import cn.ssh.model.Customer;
import cn.ssh.service.inter.CustomerService;



public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;

	@Override
	public Customer getCustomerByKey(Integer key) {
		return dao.getCustomerByKey(key);
	}

	public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	
	

}
