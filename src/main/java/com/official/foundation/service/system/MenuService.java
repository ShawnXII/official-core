package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Menu;
import com.official.foundation.facade.system.MenuFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class MenuService extends BaseService<Menu, Long>implements MenuFacadeService {

}
