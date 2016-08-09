package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.Account;
import com.official.foundation.facade.user.AccountFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class AccountService extends BaseService<Account, Long>implements AccountFacadeService{

}
