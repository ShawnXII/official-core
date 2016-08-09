package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.OperationRecord;
import com.official.foundation.facade.user.OperationRecordFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class OperationRecordService  extends BaseService<OperationRecord, Long>implements OperationRecordFacadeService{

}
