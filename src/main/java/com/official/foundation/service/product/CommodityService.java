package com.official.foundation.service.product;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.official.core.base.search.support.SearchOperator;
import com.official.core.base.search.support.Searchable;
import com.official.core.util.BeanUtils;
import com.official.foundation.domain.po.product.Commodity;
import com.official.foundation.facade.product.CommodityFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class CommodityService extends BaseService<Commodity, Long>implements CommodityFacadeService {

	@Override
	public Map<String, Object> searchCommodity(Commodity commodity, Integer pageIndex, Integer pageSize) {
		Searchable searchable = Searchable.newSearchable();
		searchable.addSearchFilter("deleteStatus", SearchOperator.eq, Boolean.FALSE);
		if (commodity != null) {
			if (StringUtils.isNotBlank(commodity.getTitle())) {
				searchable.addSearchFilter("title", SearchOperator.like, commodity.getTitle());
			}
		}
		pageIndex = pageIndex < 0 ? 0 : pageIndex;
		pageSize = (pageSize < 0 || pageSize > 200) ? 200 : pageSize;
		searchable.setPage(pageIndex, pageSize);
		Page<Commodity> page = this.findAll(searchable);
		return BeanUtils.PageToMap(page);
	}

}
