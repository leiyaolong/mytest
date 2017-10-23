package cn.itcast.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.entity.Notice;

/**
 * NoticeDao
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午3:58:57
 * @version 1.0
 */
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long> {

}
