package com.official.foundation.service;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.official.core.base.entity.Entity;
import com.official.core.base.repository.BaseRepository;
import com.official.core.base.search.support.Searchable;

@Transactional
public abstract class BaseService<M extends Entity<ID>, ID extends java.io.Serializable> {

	protected static final Logger logger = LoggerFactory.getLogger(BaseService.class);

	protected BaseRepository<M, ID> baseRepository;

	@Autowired
	public void setBaseRepository(BaseRepository<M, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}

	public BaseRepository<M, ID> getBaseRepository() {
		return this.baseRepository;
	}
	
	public M save(M m) {
		M m1 = baseRepository.save(m);
		if (logger.isDebugEnabled()) {
			logger.debug("save entity:[" + m1.toString() + "]");
		}
		return m1;
	}

	@Transactional
	public List<M> save(Collection<M> entities) {
		List<M> result = Lists.newArrayList();
		if (entities == null) {
			return result;
		}
		for (M entity : entities) {
			result.add(save(entity));
		}
		if (logger.isDebugEnabled()) {
			logger.debug("save entitys:[" + entities + "]");
		}
		return result;
	}

	public M saveOrUpdate(M m) {
		return save(m);
	}

	public M saveAndFlush(M m) {
		M m1 = save(m);
		this.flush();
		return m1;
	}

	public int delete(ID id) {
		if (logger.isDebugEnabled()) {
			logger.debug("delete entitys id:[" + id + "]");
		}
		try {
			this.baseRepository.delete(id);
			return 1;
		} catch (Exception e) {

		}
		return 0;
	}

	public int delete(M m) {
		if (m == null) {
			return 0;
		}
		return delete(m.getId());
	}

	@Transactional
	public int delete(ID[] ids) {
		if (logger.isDebugEnabled()) {
			logger.debug("delete ids:[" + ids + "]");
		}
		try {
			this.baseRepository.delete(ids);
			return ids.length;
		} catch (Exception e) {

		}
		return 0;
	}

	public M findOne(ID id) {
		return this.baseRepository.findOne(id);
	}

	public boolean exists(ID id) {
		return this.baseRepository.exists(id);
	}

	public long count() {
		return this.baseRepository.count();
	}

	public List<M> findAll() {
		return this.baseRepository.findAll();
	}

	public List<M> findAll(Sort sort) {
		return this.baseRepository.findAll(sort);
	}

	public Page<M> findAll(Pageable pageable) {
		return baseRepository.findAll(pageable);
	}

	public Page<M> findAll(Searchable searchable) {
		return baseRepository.findAll(searchable);
	}

	public List<M> findAll(String definedSql) {
		return baseRepository.findAll(definedSql);
	}

	public List<M> findAll(String definedSql, Object... params) {
		return baseRepository.findAll(definedSql, params);
	}

	public List<M> findAllWithNoPageNoSort(Searchable searchable) {
		searchable.removePageable();
		searchable.removeSort();
		return Lists.newArrayList(baseRepository.findAll(searchable).getContent());
	}

	public List<M> findAllWithSort(Searchable searchable) {
		searchable.removePageable();
		return Lists.newArrayList(baseRepository.findAll(searchable).getContent());
	}

	public Long count(Searchable searchable) {
		return this.baseRepository.count(searchable);
	}

	public void flush() {
		baseRepository.flush();
	}
}
