package cn.ssh.dao.impl;

import cn.ssh.dao.inter.CustomerDao;
import cn.ssh.model.Customer;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl  extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer getCustomerByKey(Integer key) {
		Session session =this.currentSession();
		return session.load(Customer.class, new Long(key));
	}

}
