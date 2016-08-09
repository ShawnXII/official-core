package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Resource;
import com.official.foundation.facade.system.ResourceFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ResourceService extends BaseService<Resource, Long>implements ResourceFacadeService{

}
