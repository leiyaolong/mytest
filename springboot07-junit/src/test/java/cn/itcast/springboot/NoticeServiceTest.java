package cn.itcast.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeServiceTest
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午4:18:19
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) // 运行主类
@SpringBootTest(classes={Application.class}) // 指定SpringBoot运行的主类
public class NoticeServiceTest {
	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void findAll(){
		System.out.println(noticeService.findAll());
	}
}
