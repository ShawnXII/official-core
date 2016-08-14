package com.official.foundation.service.user;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.official.foundation.dao.user.AccountRepository;
import com.official.foundation.domain.po.user.Account;
import com.official.foundation.facade.user.AccountFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class AccountService extends BaseService<Account, Long>implements AccountFacadeService{
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account getAccountByUsername(String username) {
		if(StringUtils.isBlank(username)){
			return null;
		}
		List<Account> list=accountRepository.findAccountByUsername(username);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Account register(Account account) {
		//初始化参数
		if(account!=null){
			account.setState(0);
			account.setDeleteStatus(false);
			account.setCreateTime(new Date());
			return this.saveOrUpdate(account);
		}
		return null;
	}

	@Override
	public Account updateAccount(Account account) {
		if(account!=null){
			account.setUpdateTime(new Date());
			return this.saveOrUpdate(account);
		}
		return null;
	}
	
	
}
