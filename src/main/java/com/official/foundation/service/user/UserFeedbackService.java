package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.UserFeedback;
import com.official.foundation.facade.user.UserFeedbackFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class UserFeedbackService extends BaseService<UserFeedback, Long>implements UserFeedbackFacadeService{

}
