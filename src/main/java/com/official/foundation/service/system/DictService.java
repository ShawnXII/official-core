package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Dict;
import com.official.foundation.facade.system.DictFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class DictService extends BaseService<Dict, Long>implements DictFacadeService {

}
