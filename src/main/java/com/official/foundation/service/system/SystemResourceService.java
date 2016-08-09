package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.SystemResource;
import com.official.foundation.facade.system.SystemResourceFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class SystemResourceService extends BaseService<SystemResource, Long>implements SystemResourceFacadeService{

}
