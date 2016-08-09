package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.User;
import com.official.foundation.facade.user.UserFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class UserService extends BaseService<User, Long>implements UserFacadeService{

}
