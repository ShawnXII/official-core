package com.official.foundation.service.product;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.product.Specification;
import com.official.foundation.facade.product.SpecificationFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class SpecificationService extends BaseService<Specification, Long>implements SpecificationFacadeService {

}
