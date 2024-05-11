package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongzuoanpaiDao;
import com.entity.GongzuoanpaiEntity;
import com.service.GongzuoanpaiService;
import com.entity.vo.GongzuoanpaiVO;
import com.entity.view.GongzuoanpaiView;

@Service("gongzuoanpaiService")
public class GongzuoanpaiServiceImpl extends ServiceImpl<GongzuoanpaiDao, GongzuoanpaiEntity> implements GongzuoanpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuoanpaiEntity> page = this.selectPage(
                new Query<GongzuoanpaiEntity>(params).getPage(),
                new EntityWrapper<GongzuoanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuoanpaiEntity> wrapper) {
		  Page<GongzuoanpaiView> page =new Query<GongzuoanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuoanpaiVO> selectListVO(Wrapper<GongzuoanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuoanpaiVO selectVO(Wrapper<GongzuoanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuoanpaiView> selectListView(Wrapper<GongzuoanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuoanpaiView selectView(Wrapper<GongzuoanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
