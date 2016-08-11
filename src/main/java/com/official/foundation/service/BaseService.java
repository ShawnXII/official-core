package com.official.foundation.service;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.official.core.base.entity.Entity;
import com.official.core.base.search.support.Searchable;
import com.official.core.eclipselink.jpa.dao.BaseDao;
import com.official.core.eclipselink.jpa.dao.impl.MySqlBaseDaoImpl;
import com.official.foundation.facade.BaseFacadeService;

@Transactional
public  class BaseService<M extends Entity<ID>, ID extends java.io.Serializable>
		implements BaseFacadeService<M, ID> {

	protected static final Logger logger = LoggerFactory.getLogger(BaseService.class);
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public BaseDao<M,ID> getBaseDaoBean(){
		return new MySqlBaseDaoImpl<M,ID>(entityManagerFactory);	
	}


	public M save(M entity) {
		return getBaseDaoBean().save(entity);
	}


	public List<M> save(Collection<M> entitys) {
		return getBaseDaoBean().save(entitys);
	}


	public M saveAndFlush(M entity) {
		return getBaseDaoBean().saveAndFlush(entity);
	}


	public int delete(ID id) {
		return getBaseDaoBean().delete(id);
	}


	public int delete(M entity) {
		return getBaseDaoBean().delete(entity);
	}


	public int delete(ID[] ids) {
		return getBaseDaoBean().delete(ids);
	}


	public M findOne(ID id) {
		return getBaseDaoBean().findOne(id);
	}


	public boolean exists(ID id) {
		return getBaseDaoBean().exists(id);
	}


	public long count() {
		return getBaseDaoBean().count();
	}


	public List<M> findAll() {
		return getBaseDaoBean().findAll();
	}


	public List<M> findAll(Sort sort) {
		return  getBaseDaoBean().findAll(sort);
	}


	public Page<M> findAll(Pageable pageable) {
		return getBaseDaoBean().findAll(pageable);
	}


	public Page<M> findAll(Searchable searchable) {
		return getBaseDaoBean().findAll(searchable);
	}


	public List<M> findAll(String definedSql) {
		return this.getBaseDaoBean().findAll(definedSql);
	}


	public List<M> findAll(String definedSql, Object... params) {
		return this.getBaseDaoBean().findAll(definedSql,params);
	}


	public List<M> findAllWithNoPageNoSort(Searchable searchable) {
		return this.getBaseDaoBean().findAllWithNoPageNoSort(searchable);
	}


	public List<M> findAllWithSort(Searchable searchable) {
		return this.getBaseDaoBean().findAllWithSort(searchable);
	}


	public Long count(Searchable searchable) {
		return this.getBaseDaoBean().count();
	}


	public void flush() {
		this.getBaseDaoBean().flush();	
	}	

}
