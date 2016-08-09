package com.official.foundation.service.user;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.user.Comment;
import com.official.foundation.facade.user.CommentFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class CommentService extends BaseService<Comment, Long>implements CommentFacadeService{

}
