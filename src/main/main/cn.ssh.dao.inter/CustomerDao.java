package cn.ssh.dao.inter;

import cn.ssh.model.Customer;

public interface CustomerDao {
	//通过主键得到Customer对象
	public Customer getCustomerByKey(Integer key);

}
