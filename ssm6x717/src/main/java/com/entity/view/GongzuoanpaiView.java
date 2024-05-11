package com.entity.view;

import com.entity.GongzuoanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 17:52:40
 */
@TableName("gongzuoanpai")
public class GongzuoanpaiView  extends GongzuoanpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuoanpaiView(){
	}
 
 	public GongzuoanpaiView(GongzuoanpaiEntity gongzuoanpaiEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuoanpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
