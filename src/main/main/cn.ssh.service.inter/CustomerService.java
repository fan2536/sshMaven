package cn.ssh.service.inter;

import cn.ssh.model.Customer;

public interface CustomerService {
	//通过主键得到Customer对象
	public Customer getCustomerByKey(Integer key);

}
