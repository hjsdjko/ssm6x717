package com.entity.model;

import com.entity.KaoqinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 考勤信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 17:52:40
 */
public class KaoqinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考勤标题
	 */
	
	private String kaoqinbiaoti;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 考勤时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoqinshijian;
		
	/**
	 * 考勤状态
	 */
	
	private String kaoqinzhuangtai;
		
	/**
	 * 考勤详情
	 */
	
	private String kaoqinxiangqing;
		
	/**
	 * 员工账号
	 */
	
	private String yuangongzhanghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：考勤标题
	 */
	 
	public void setKaoqinbiaoti(String kaoqinbiaoti) {
		this.kaoqinbiaoti = kaoqinbiaoti;
	}
	
	/**
	 * 获取：考勤标题
	 */
	public String getKaoqinbiaoti() {
		return kaoqinbiaoti;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：考勤时间
	 */
	 
	public void setKaoqinshijian(Date kaoqinshijian) {
		this.kaoqinshijian = kaoqinshijian;
	}
	
	/**
	 * 获取：考勤时间
	 */
	public Date getKaoqinshijian() {
		return kaoqinshijian;
	}
				
	
	/**
	 * 设置：考勤状态
	 */
	 
	public void setKaoqinzhuangtai(String kaoqinzhuangtai) {
		this.kaoqinzhuangtai = kaoqinzhuangtai;
	}
	
	/**
	 * 获取：考勤状态
	 */
	public String getKaoqinzhuangtai() {
		return kaoqinzhuangtai;
	}
				
	
	/**
	 * 设置：考勤详情
	 */
	 
	public void setKaoqinxiangqing(String kaoqinxiangqing) {
		this.kaoqinxiangqing = kaoqinxiangqing;
	}
	
	/**
	 * 获取：考勤详情
	 */
	public String getKaoqinxiangqing() {
		return kaoqinxiangqing;
	}
				
	
	/**
	 * 设置：员工账号
	 */
	 
	public void setYuangongzhanghao(String yuangongzhanghao) {
		this.yuangongzhanghao = yuangongzhanghao;
	}
	
	/**
	 * 获取：员工账号
	 */
	public String getYuangongzhanghao() {
		return yuangongzhanghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
