package com.official.foundation.dao.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.official.core.base.repository.BaseRepository;
import com.official.foundation.domain.po.user.Account;

public interface AccountRepository extends BaseRepository<Account,Long>{
	
	@Query("from Account acc where acc.username=?1 or (acc.mobile=?1 and acc.mobileState=1) or (acc.email=?1 and acc.emailState=1)")
	public List<Account> findAccountByUsername(String username);
}	