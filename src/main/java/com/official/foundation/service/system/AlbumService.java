package com.official.foundation.service.system;

import org.springframework.stereotype.Service;

import com.official.foundation.domain.po.system.Album;
import com.official.foundation.facade.system.AlbumFacadeService;
import com.official.foundation.service.BaseService;

@Service
public class AlbumService extends BaseService<Album, Long>implements AlbumFacadeService {

}
