package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.SystemTask;
import com.official.foundation.facade.system.SystemTaskFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class SystemTaskService extends BaseService<SystemTask, Long>implements SystemTaskFacadeService{

}
