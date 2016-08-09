package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.Store;
import com.official.foundation.facade.user.StoreFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class StoreService  extends BaseService<Store, Long>implements StoreFacadeService{

}
