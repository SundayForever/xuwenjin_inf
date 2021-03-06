package cn.com.alo7.inf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.com.alo7.inf.common.Constant;
import cn.com.alo7.inf.common.utils.PageUtils;
import cn.com.alo7.inf.entity.ColumnVideoView;
import cn.com.alo7.inf.repository.ColumnVideoViewRepository;
import cn.com.alo7.inf.service.IColumnVideoViewService;

/**
 * 栏目视频
 * 
 * @author mazan
 *
 */
@Service
public class ColumnVideoViewServiceImpl implements IColumnVideoViewService {

	@Autowired
	private ColumnVideoViewRepository columnVideoViewRepository;

	@Override
	public Page<ColumnVideoView> findAll(Long columnId, Integer page, Integer size, String sort) {
		if (null == sort || "".equals(sort)) {
			sort = Constant.SORT_MANUAL;
		}
		// 分页对象
		Pageable pageable = PageUtils.page(page, size, null);
		// 创建查询条件数据对象
		ColumnVideoView columnVideoView = new ColumnVideoView();
		columnVideoView.setSort(sort);
		columnVideoView.setColumnId(columnId);
		// 创建匹配器
		ExampleMatcher matcher = ExampleMatcher.matching();
		Example<ColumnVideoView> ex = Example.of(columnVideoView, matcher);

		Page<ColumnVideoView> pageList = columnVideoViewRepository.findAll(ex, pageable);
		return pageList;
	}

}
