package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Power;
import com.official.foundation.facade.system.PowerFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class PowerService extends BaseService<Power, Long>implements PowerFacadeService{

}
