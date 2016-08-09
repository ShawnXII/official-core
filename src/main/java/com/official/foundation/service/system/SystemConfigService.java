package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.SystemConfig;
import com.official.foundation.facade.system.SystemConfigFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class SystemConfigService extends BaseService<SystemConfig, Long>implements SystemConfigFacadeService{

}
