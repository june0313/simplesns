package jpa;

import com.june.simplesns.member.domain.Member;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by wayne on 2016. 5. 16..
 */
public class JpaTest {
	@Test
	public void testJpa() throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simplesns");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {

			tx.begin();
			logic(em);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
		entityManagerFactory.close();
	}

	private void logic(EntityManager em) {
		String id = "id1";
		Member member = new Member();
		member.setId(id);
		member.setName("영준");
		member.setEmail("june0313@gmail.com");
		member.setPassword("1234");

		// 등록
		em.persist(member);

		// 수정
		member.setEmail("june0313@naver.com");

		// 한 건 조회
		Member findMember = em.find(Member.class, id);
		System.out.println("findMember = " + findMember.getName() + ", email = " + findMember.getEmail());

		// 목록 조회
		List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
		System.out.println("members.size = " + members.size());

		// 삭제
		em.remove(member);
	}
}
