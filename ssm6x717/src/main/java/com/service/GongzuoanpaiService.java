package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuoanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuoanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoanpaiView;


/**
 * 工作安排
 *
 * @author 
 * @email 
 * @date 2022-05-13 17:52:40
 */
public interface GongzuoanpaiService extends IService<GongzuoanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuoanpaiVO> selectListVO(Wrapper<GongzuoanpaiEntity> wrapper);
   	
   	GongzuoanpaiVO selectVO(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
   	
   	List<GongzuoanpaiView> selectListView(Wrapper<GongzuoanpaiEntity> wrapper);
   	
   	GongzuoanpaiView selectView(@Param("ew") Wrapper<GongzuoanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuoanpaiEntity> wrapper);
   	

}

