package com.official.foundation.service.product;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.product.Commodity;
import com.official.foundation.facade.product.CommodityFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class CommodityService extends BaseService<Commodity,Long> implements CommodityFacadeService{

}
