package com.dao;

import com.entity.GongzuoanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuoanpaiVO;
import com.entity.view.GongzuoanpaiView;


/**
 * 工作安排
 * 
 * @author 
 * @email 
 * @date 2022-05-13 17:52:40
 */
public interface GongzuoanpaiDao extends BaseMapper<GongzuoanpaiEntity> {
	
	List<GongzuoanpaiVO> selectListVO(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
	
	GongzuoanpaiVO selectVO(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
	
	List<GongzuoanpaiView> selectListView(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);

	List<GongzuoanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
	
	GongzuoanpaiView selectView(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
	

}
