package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.LanshaUserBand;

/**
 * yw_user_band 
 * @author 
 * 
 */
public interface LanshaUserBandDao{
	/**
	 * 新增yw_user_band
	 * @param ywUserBand
	 * @return
	 */
	public LanshaUserBand save(LanshaUserBand entity);
	
	/**
	 * 根据ids数组删除yw_user_band
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新yw_user_band
	 * @param ywUserBand
	 * @return
	 */
	public Integer update(LanshaUserBand entity);
	
	/**
	 * 根据id获取yw_user_band
	 * @param id
	 * @return
	 */
	public LanshaUserBand getLanshaUserBandById(String id);
		
	/**
	 * 根据ids数组查询yw_user_bandmap
	 * @param ids
	 * @return
	 */
	public Map<String, LanshaUserBand> getLanshaUserBandMapByIds(String[] ids);
	
	/**
	 * 获取yw_user_band列表
	 * @return
	 */
	public List<LanshaUserBand> getLanshaUserBandList(LanshaUserBand entity);
		
	/**
	 * 分页获取yw_user_band列表
	 * @param page
	 * @return
	 */
	public List<LanshaUserBand> getLanshaUserBandPage(LanshaUserBand entity, PageDto page);

	/**
	 * @Description: 根据openId获取第三方登录信息
	 * @param openId
	 * @return
	 */
	public LanshaUserBand getUserBandByOpenId(String openId);
	
}