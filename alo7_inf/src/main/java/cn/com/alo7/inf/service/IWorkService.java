package cn.com.alo7.inf.service;

import cn.com.alo7.inf.entity.Work;

public interface IWorkService {
	
	/**
	 * 查询单个work
	 * @param id
	 * @return
	 */
	Work findById(Long id);
}
