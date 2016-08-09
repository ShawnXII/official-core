package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Role;
import com.official.foundation.facade.system.RoleFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class RoleService extends BaseService<Role, Long>implements RoleFacadeService{

}
