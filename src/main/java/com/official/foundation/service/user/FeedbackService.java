package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.Feedback;
import com.official.foundation.facade.user.FeedbackFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class FeedbackService extends BaseService<Feedback, Long>implements FeedbackFacadeService{

}
