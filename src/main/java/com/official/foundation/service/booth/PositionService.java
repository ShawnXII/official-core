package com.official.foundation.service.booth;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.booth.Position;
import com.official.foundation.facade.booth.PositionFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class PositionService extends BaseService<Position,Long> implements PositionFacadeService{

}
