package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Task;
import com.official.foundation.facade.system.TaskFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class TaskService extends BaseService<Task, Long>implements TaskFacadeService{

}
