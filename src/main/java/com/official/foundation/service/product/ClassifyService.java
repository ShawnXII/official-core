package com.official.foundation.service.product;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.official.core.base.search.support.SearchOperator;
import com.official.core.base.search.support.Searchable;
import com.official.foundation.domain.po.product.Classify;
import com.official.foundation.facade.product.ClassifyFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class ClassifyService extends BaseService<Classify, Long>implements ClassifyFacadeService {

	@Override
	public List<Classify> searchClassify(Classify classify) {
		Searchable searchable = Searchable.newSearchable();
		searchable.addSearchFilter("deleteStatus", SearchOperator.eq, Boolean.valueOf(false));
		if (classify != null) {
			String title = classify.getTitle();
			if (StringUtils.isNotBlank(title)) {
				searchable.addSearchFilter("title", SearchOperator.like, title);
			}
			String createBy=classify.getCreateBy();
			if(StringUtils.isNotBlank(createBy)){
				searchable.addSearchFilter("createBy", SearchOperator.eq, createBy);
			}
		}
		searchable.addSort(Direction.DESC, "weight");
		return super.findAllWithSort(searchable);
	}

}
