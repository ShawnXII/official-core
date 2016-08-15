package com.official.foundation.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.official.core.base.search.support.SearchOperator;
import com.official.core.base.search.support.Searchable;
import com.official.foundation.domain.po.product.Specification;
import com.official.foundation.facade.product.SpecificationFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class SpecificationService extends BaseService<Specification, Long>implements SpecificationFacadeService {

	@Override
	public boolean checkTitle(String title) {
		Searchable searchable=Searchable.newSearchable();
		searchable.addSearchFilter("title", SearchOperator.eq, title);
		List<Specification> list=this.findAllWithNoPageNoSort(searchable);
		if(list!=null&&list.size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Specification> searchSpec(Specification specification) {
		Searchable searchable=Searchable.newSearchable();
		if(specification!=null){
			if(specification!=null&&specification.getStoreId()>0){
				searchable.addSearchFilter("storeId", SearchOperator.eq, specification.getStoreId());
			}
		}
		return this.findAllWithNoPageNoSort(searchable);
	}
	
}
