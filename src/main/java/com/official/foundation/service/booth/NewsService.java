package com.official.foundation.service.booth;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.booth.News;
import com.official.foundation.facade.booth.NewsFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class NewsService extends BaseService<News,Long> implements NewsFacadeService{

}
