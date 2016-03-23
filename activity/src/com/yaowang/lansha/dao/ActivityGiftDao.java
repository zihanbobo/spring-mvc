package com.yaowang.lansha.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.ActivityGift;
import com.yaowang.lansha.entity.ActivityGiftStock;

/**
 * 活动礼品 
 * @author 
 * 
 */
public interface ActivityGiftDao{
	/**
	 * 新增活动礼品
	 * @param activityGift
	 * @return
	 */
	public ActivityGift save(ActivityGift entity);
	
	/**
	 * 根据ids数组删除活动礼品
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新活动礼品
	 * @param activityGift
	 * @return
	 */
	public Integer update(ActivityGift entity);
	
	/**
	 * 更新活动礼品数量和库存
	 * @param activityGift
	 * @return
	 */
	public Integer updateGiftNumberAndStock(ActivityGiftStock entity);
	/**
	 * 更新抽奖活动礼品数量和库存
	 * @param activityGift
	 * @return
	 */
	public Integer updateLotteryGiftNumberAndStock(ActivityGiftStock entity);
	
	/**
	 * 根据id获取活动礼品
	 * @param id
	 * @return
	 */
	public ActivityGift getActivityGiftById(String id);
		
	/**
	 * 根据ids数组查询活动礼品map
	 * @param ids
	 * @return
	 */
	public Map<String, ActivityGift> getActivityGiftMapByIds(String[] ids);
	
	/**
	 * 获取活动礼品列表
	 * @return
	 */
	public List<ActivityGift> getActivityGiftList(ActivityGift entity);
	
	/**
	 * 获取活动礼品列表
	 * @return
	 */
	public List<ActivityGift> getLotteryActivityGiftList(ActivityGift entity);
	
	/**
	 * 获取活动礼品名列表
	 * @return
	 */
	public List<ActivityGift> getActivityGiftList();
	
	/**
	 * 获取活动礼品列表
	 * @return
	 */
	public List<ActivityGift> getActivityGiftList(ActivityGift entity,Date startTime, Date endTime);
		
	/**
	 * 分页获取活动礼品列表
	 * @param page
	 * @return
	 */
	public List<ActivityGift> getActivityGiftPage(ActivityGift entity, PageDto page);

	/**
	 * @Description: 根据id修改状态
	 * @param id
	 * @param status
	 */
	public void updateStatusById(String id, String status);
	/**
	 * 根据name获取活动礼品
	 * @param name
	 * @return
	 */
	public ActivityGift getActivityGiftByName(String name);
	
}