package cn.com.alo7.inf.service;

import org.springframework.data.domain.Page;

import cn.com.alo7.inf.entity.ColumnVideoView;

public interface IColumnVideoViewService {
	Page<ColumnVideoView> findAll(Long columnId,Integer page, Integer size, String sort);
}
