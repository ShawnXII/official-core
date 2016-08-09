package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Accessory;
import com.official.foundation.facade.system.AccessoryFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class AccessoryService extends BaseService<Accessory, Long>implements AccessoryFacadeService{

}
