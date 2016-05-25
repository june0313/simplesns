package com.june.simplesns.service.member;

import com.june.simplesns.domain.member.Member;
import com.june.simplesns.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wayne on 2016. 5. 25..
 */
@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	/**
	 *  회원 가입
	 */
	public Long join(Member member) {
		memberRepository.save(member);
		return member.getMemberId();
	}
}
