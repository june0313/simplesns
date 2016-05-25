package com.june.simplesns.repository.member;

import com.june.configuration.ApplicationContext;
import com.june.simplesns.domain.member.Member;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;


/**
 * Created by wayne on 2016. 5. 25..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationContext.class})
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;

	private Member member;

	@Before
	public void setUp() throws Exception {
		member = new Member();
		member.setId("june0313");
		member.setName("박영준");
		member.setEmail("june0313@gmail.com");
		member.setPassword("1234");
	}

	@Test
	public void testSaveAndFindOne() throws Exception {
		memberRepository.save(member);
		Member result = memberRepository.findOne(member.getMemberId());

		assertThat(result.getMemberId()).isEqualTo(member.getMemberId());
		assertThat(result.getName()).isEqualTo(member.getName());
	}
}