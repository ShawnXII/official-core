package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.AuditRecord;
import com.official.foundation.facade.user.AuditRecordFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class AuditRecordService extends BaseService<AuditRecord, Long>implements AuditRecordFacadeService{

}
