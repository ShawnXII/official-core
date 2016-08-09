package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Params;
import com.official.foundation.facade.system.ParamsFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ParamsService extends BaseService<Params, Long>implements ParamsFacadeService {

}
