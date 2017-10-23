package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午3:59:54
 * @version 1.0
 */
public interface NoticeService {

	List<Notice> findAll();

}
