package com.aaa.project;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.aaa.project.domain.Board;
import com.aaa.project.domain.Member;
import com.aaa.project.domain.Owner;
import com.aaa.project.mapper.BoardMapper;
import com.aaa.project.mapper.UserMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Test1234 {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper bMapper;
	
	@Setter(onMethod_ = @Autowired)
	private UserMapper uMapper;
	
//	@Test
//	public void testList() {
//		List<Board> replies =bMapper.getList();
//		replies.forEach(board->log.info(board));
//	}
	
//	@Test
//	public void testLogin() {
//		String id = "aaa";
//		String pw = "1231";
//		
//		Member m = new Member();
//		Owner o = new Owner();
//		
//		if( (m = uMapper.login_chk_member(id, pw)) == null) {
//			if( ( o = uMapper.login_chk_owner(id, pw)) == null) {
//				log.info("로그인 실패");
//			} else {
//				log.info("관계자님 어서오세요 : " + o);
//			}
//		}	else {
//			log.info("사용자님 어서오세요 : " + m);
//		}
//	}
	
//	@Test
//	public void testChk_id() {
//		String id = "ccc";
//		String chk = "";
//		
//		chk = uMapper.chk_id(id);
//		
//		if(id.equals(chk))
//			log.info("중복된 아이디가 있습니다.");
//		else
//			log.info("사용 가능합니다.");
//	}
	
//	@Test
//	public void testInsert_Member() {
//		Member m = new Member();
//		m.setId("ccc");
//		m.setPw("1234");
//		m.setMname("테스트c");
//		m.setMtel("12341234");
//		m.setMemail("1234@1234.com");
//		m.setNic("TestC");
//		uMapper.insert_member(m);
//	}
	
//	@Test
//	public void testInsert_Owner() {
//		Owner owner = new Owner();
//		owner.setId("ddd");
//		owner.setPw("1234");
//		owner.setOname("테스트d");
//		owner.setOtel("12341234");
//		owner.setOemail("1234@1234.com");
//		owner.setAddr("구장 주소 d");
//		
//		uMapper.insert_owner(owner);
//	}
	
	
}
