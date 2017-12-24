package cn.com.alo7.inf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cn.com.alo7.inf.common.utils.PageUtils;
import cn.com.alo7.inf.entity.VideoView;
import cn.com.alo7.inf.repository.VideoViewRepository;
import cn.com.alo7.inf.service.IVideoViewService;

/**
 * 视频视图实现
 * 
 * @author mazan
 *
 */
@Service
public class VideoViewServiceImpl implements IVideoViewService {

	@Autowired
	private VideoViewRepository videoViewRepository;

	@Override
	public Page<VideoView> findByAlbumIdAndVideoSizeAndSort(Long albumId, Integer videoSize, String sort) {
		Pageable pageable = PageUtils.page(null, videoSize, null);

		// 创建查询条件数据对象
		VideoView videoView = new VideoView();
		videoView.setSort(sort);
		videoView.setAlbumId(albumId);

		// 创建匹配器
		ExampleMatcher matcher = ExampleMatcher.matching();
		Example<VideoView> ex = Example.of(videoView, matcher);

		// 查询分页
		Page<VideoView> pageList = videoViewRepository.findAll(ex, pageable);
		return pageList;
	}
}