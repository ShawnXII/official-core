package com.official.foundation.service.booth;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.booth.Notice;
import com.official.foundation.facade.booth.NoticeFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class NoticeService extends BaseService<Notice,Long> implements NoticeFacadeService{

}
