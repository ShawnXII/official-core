package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.ConfigParams;
import com.official.foundation.facade.system.ConfigParamsFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ConfigParamsService extends BaseService<ConfigParams, Long>implements ConfigParamsFacadeService {

}
