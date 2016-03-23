package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.YwGameType;

/**
 * yw_game_type 
 * @author 
 * 
 */
public interface YwGameTypeDao{
	/**
	 * 新增yw_game_type
	 * @param ywGameType
	 * @return
	 */
	public YwGameType save(YwGameType entity);
	
	/**
	 * 根据ids数组删除yw_game_type
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 根据id获取yw_game_type
	 * @param id
	 * @return
	 */
	public YwGameType getYwGameTypeById(String id);
		
	/**
	 * 根据ids数组查询yw_game_typemap
	 * @param ids
	 * @return
	 */
	public Map<String, YwGameType> getYwGameTypeMapByIds(String[] ids);
	
	/**
	 * 获取yw_game_type列表
	 * @return
	 */
	public List<YwGameType> getYwGameTypeList();
		
	/**
	 * 分页获取yw_game_type列表
	 * @param entity TODO
	 * @param page
	 * @return
	 */
	public List<YwGameType> getYwGameTypeList(YwGameType entity, PageDto page);
	/**
	 * 批量更新状态
	 * @param ids
	 * @param status
	 * @return
	 */
	public Integer updateStatus(String[] ids, Integer status);
	/**
	 * 更新
	 * @param entity
	 * @return
	 * @creationDate. 2015-12-4 下午3:16:17
	 */
	public Integer update(YwGameType entity);
	
}