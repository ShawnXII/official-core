package com.official.foundation.service.product;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.official.core.base.search.support.SearchOperator;
import com.official.core.base.search.support.Searchable;
import com.official.core.util.BeanUtils;
import com.official.foundation.domain.po.product.Classify;
import com.official.foundation.facade.product.ClassifyFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ClassifyService extends BaseService<Classify,Long> implements ClassifyFacadeService{

	@Override
	public  Map<String, Object> searchClassify(Classify classify, Integer pageIndex, Integer pageSize) {
		Searchable searchable=Searchable.newSearchable();
		searchable.addSearchFilter("deleteStatus", SearchOperator.eq,Boolean.valueOf(false));
		if(classify!=null){
			String title=classify.getTitle();
			if(StringUtils.isNotBlank(title)){
				searchable.addSearchFilter("title", SearchOperator.like, title);
			}
		}
		pageIndex=pageIndex<0?0:pageIndex;
		pageSize=(pageSize<1||pageSize>200)?20:pageSize;
		searchable.setPage(pageIndex, pageSize);
		searchable.addSort(Direction.DESC, "weight");
		Page<Classify> page=super.findAll(searchable);
		return BeanUtils.PageToMap(page);
	}
	
	
}
