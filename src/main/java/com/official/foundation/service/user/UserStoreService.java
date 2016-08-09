package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.UserStore;
import com.official.foundation.facade.user.UserStoreFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class UserStoreService  extends BaseService<UserStore, Long>implements UserStoreFacadeService{

}
