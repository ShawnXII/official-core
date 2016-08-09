package com.official.foundation.service.product;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.product.Property;
import com.official.foundation.facade.product.PropertyFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class PropertyService extends BaseService<Property, Long>implements PropertyFacadeService {

}
