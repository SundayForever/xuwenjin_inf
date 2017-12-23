package cn.com.alo7.inf.service;

import java.util.List;

import cn.com.alo7.inf.entity.Video;
import cn.com.alo7.inf.entity.Work;

public interface IVideoService {
	
	/**
	 * 通过id相等查询
	 * @param id
	 * @return
	 */
	Video findByIdAndDeleteFlag(Long id,String deleteFlag);
	
	/**
	 * 通过视频Id查询视频对应所有的作品
	 * @param id
	 * @return
	 */
	List<Work> findWorkByVideoId(Long id,Integer size);
}
