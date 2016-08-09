package com.official.foundation.service.product;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.product.Brand;
import com.official.foundation.facade.product.BrandFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class BrandService extends BaseService<Brand,Long> implements BrandFacadeService{

}
