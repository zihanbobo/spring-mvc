package com.yaowang.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.entity.SysMcodeDetail;

/**
 * sys_mcode_detail 
 * @author 
 * 
 */
public interface SysMcodeDetailDao{
	/**
	 * 新增sys_mcode_detail
	 * @param sysMcodeDetail
	 * @return
	 */
	public SysMcodeDetail save(SysMcodeDetail sysMcodeDetail);
	
	/**
	 * 根据ids数组删除sys_mcode_detail
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新sys_mcode_detail
	 * @param sysMcodeDetail
	 * @return
	 */
	public Integer update(SysMcodeDetail sysMcodeDetail);
	
	/**
	 * 获取微代码
	 * @param listId
	 * @param thisId
	 * @return
	 */
	public SysMcodeDetail getSysMcodeDetail(String listId, String thisId);
	/**
	 * 获取微代码
	 * @param listId
	 * @param content
	 * @return
	 */
	public SysMcodeDetail getSysMcodeDetailByContent(String listId, String content);
	
	/**
	 * 根据id获取sys_mcode_detail
	 * @param id
	 * @return
	 */
	public SysMcodeDetail getSysMcodeDetailById(String id);
		
	/**
	 * 根据ids数组查询sys_mcode_detailmap
	 * @param ids
	 * @return
	 */
//	public Map<String, SysMcodeDetail> getSysMcodeDetailMapByIds(String[] ids);

	public List<SysMcodeDetail> getSysMcodeDetailList(String listId);
	/**
	 * 获取sys_mcode_detail列表
	 * @return
	 */
	public List<SysMcodeDetail> getSysMcodeDetailList(String listId, SysMcodeDetail detail);
		
	/**
	 * 分页获取sys_mcode_detail列表
	 * @param page
	 * @return
	 */
	public List<SysMcodeDetail> getSysMcodeDetailPage(String listId, PageDto page);

	/**
	 * 返回map
	 * @param listId
	 * @return
	 */
	public Map<String, SysMcodeDetail> getSysMcodeDetailMap(String listId);
	
	/**
	 * 根据微代码名称获取值
	 * @param listId
	 * @return
	 */
	public Map<String, String> getMcodeContentToThisId(String listId);

	public Map<String, String> getMcodeThisIdToContent(String listId);
}