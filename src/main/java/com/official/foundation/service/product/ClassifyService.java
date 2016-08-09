package com.official.foundation.service.product;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.product.Classify;
import com.official.foundation.facade.product.ClassifyFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ClassifyService extends BaseService<Classify,Long> implements ClassifyFacadeService{

}
