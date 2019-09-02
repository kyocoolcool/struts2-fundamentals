//package lee;
//
//import org.crazyit.app.domain.*;
//import org.crazyit.app.dto.*;
//import javax.persistence.*;
//import javax.persistence.criteria.*;
//import java.util.*;
//
///**
// * Description:
// * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
// * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
// * <br/>This program is protected by copyright laws.
// * <br/>Program Name:
// * <br/>Date:
// * @author  Yeeku.H.Lee kongyeeku@163.com
// * @version  1.0
// */
//public class CriteriaQueryTest
//{
//	final static EntityManagerFactory emf = Persistence
//		.createEntityManagerFactory("query_pu");
//	public static void main(String[] args)
//	{
//		CriteriaQueryTest criteriaTest = new CriteriaQueryTest();
//		criteriaTest.query();
//		criteriaTest.paramQuery();
////		criteriaTest.update();
//		criteriaTest.multiselect();
//		criteriaTest.queryDto();
//		criteriaTest.queryTuple();
//		criteriaTest.multiRootQuery();
//		emf.close();
//	}
//	private void query()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Student> root = criteria.from(Student.class);
//		// ������䲻�Ǳ���ģ�������ѯĬ�ϻ��ѯΨһ��Rootʵ��
//		criteria.select(root);
//		// ʹ��builder���ɲ�ѯ����
//		Predicate pred = builder.greaterThan(root.get(Student_.name), "a"); // ��
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ����
//		criteria.where(pred);
//		List<Student> list = em.createQuery(criteria)
//			.getResultList();
//		System.out.println("=====��������ѯ��ȡ����ѧ����¼=====");
//		for(Student s : list)
//		{
//			System.out.println(s.getName());
//			Set<Enrolment> enrolments = s.getEnrolments();
//			System.out.println("=====��ȡ-" + s.getName()
//				+ "-��ѡ�μ�¼=====");
//			for(Enrolment e : enrolments)
//			{
//				System.out.println(e.getCourse().getName());
//			}
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void paramQuery()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Student> root = criteria.from(Student.class);
//		// ������䲻�Ǳ���ģ�������ѯĬ�ϻ��ѯΨһ��Rootʵ��
//		criteria.select(root);
//		// ����һ������
//		ParameterExpression<String> nameParam = builder
//			.parameter(String.class);
//		// ʹ��builder�����ɲ�ѯ����,��ѯ����ʹ��nameParam����
//		Predicate pred = builder.greaterThan(root.get(Student_.name), nameParam);
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ����
//		criteria.where(pred);
//		List<Student> list = em.createQuery(criteria)
//			// ΪnameParam���ò���
//			.setParameter(nameParam, "a")
//			.getResultList();
//		System.out.println("=====��������������ѯ��ȡѧ����¼=====");
//		for(Student s : list)
//		{
//			System.out.println(s.getName());
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void update()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaUpdate
//		CriteriaUpdate<Student> update = builder
//			.createCriteriaUpdate(Student.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Student> root = update.from(Student.class);
//		// ����Ҫ���µ���ֵ���൱������update��set�Ӿ䣩
//		update.set(root.get(Student_.name), "������");
//		// ʹ��builer����������,
//		Predicate pred = builder.greaterThan(
//			root.get(Student_.studentNumber), 20050230);
//		// ʹ��CriteriaUpdate��where()��������������൱������where�Ӿ䣩
//		update.where(pred);
//		int result = em.createQuery(update)
//			.executeUpdate();
//		System.out.printf("=====����%d��ѧ����¼���޸�=====%n", result);
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void multiselect()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<Object[]> criteria = builder.createQuery(Object[].class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Student> root = criteria.from(Student.class);
//		// ʹ��multiselect���ò�ѯ���Ժ�ʵ������
//		criteria.multiselect(root.get(Student_.name), root);
//		// ��������ͬ���������
//		//criteria.select(builder.array(root.get(Student_.name), root));
//		// ʹ��builder���ɲ�ѯ����
//		Predicate pred = builder.greaterThan(root.get(Student_.name), "a");
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ����
//		criteria.where(pred);
//		List<Object[]> list = em.createQuery(criteria)
//			.getResultList();
//		System.out.println("=====��ѯ���Ժ�ʵ������=====");
//		for(Object[] row : list)
//		{
//			System.out.println(row[0] + "->" + row[1]);
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void queryDto()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<EnrolmentDto> criteria = builder
//			.createQuery(EnrolmentDto.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Enrolment> root = criteria.from(Enrolment.class);
//		// ����ѯ���������Է�װ��EnrolmentDto����
//		criteria.select(builder.construct(EnrolmentDto.class,
//			root.get(Enrolment_.year), root.get(Enrolment_.semester)));
//		// ʹ��builder���ɲ�ѯ����
//		Predicate pred = builder.gt(
//			root.get(Enrolment_.enrolmentId), 2);
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ����
//		criteria.where(pred);
//		List<EnrolmentDto> list = em.createQuery(criteria)
//			.getResultList();
//		System.out.println("=====����ѯ�Ķ�����Է�װ��DTO=====");
//		for(EnrolmentDto dto : list)
//		{
//			System.out.println(dto.getYear() + "->" + dto.getSem());
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void queryTuple()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<Tuple> criteria = builder
//			.createQuery(Tuple.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Enrolment> root = criteria.from(Enrolment.class);
//		// ����Ҫ��ѯ��2������
//		Path<Integer> yearPath = root.get(Enrolment_.year);
//		Path<Integer> semesterPath = root.get(Enrolment_.semester);
//		// ��ѯ������Ի�ʵ�壬��ѯ�õ��Ľ������Ԫ����Tuple
//		criteria.multiselect(yearPath, semesterPath);
//		// ʹ��builder���ɲ�ѯ����
//		Predicate pred = builder.gt(
//			root.get(Enrolment_.enrolmentId), 2);
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ����
//		criteria.where(pred);
//		List<Tuple> list = em.createQuery(criteria)
//			.getResultList();
//		System.out.println("=====����ѯ�Ķ�����Է�װ��Tuple=====");
//		for(Tuple tuple : list)
//		{
//			// ͨ��Ԫ������ȡ�����Ե�ֵ
//			System.out.println(tuple.get(yearPath) + "->"
//				+ tuple.get(semesterPath));
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//	private void multiRootQuery()
//	{
//		// ��EntityManager������
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// ����CriteriaBuilder
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		// ����CriteriaQuery����������Ͳ��������������ѯ���ؽ�������Ԫ������
//		CriteriaQuery<Tuple> criteria = builder
//			.createQuery(Tuple.class);
//		// ����Ҫ��ѯ�ĸ�ʵ����
//		Root<Student> stuRoot = criteria.from(Student.class);
//		Root<Enrolment> enrolRoot = criteria.from(Enrolment.class);
//		// ��ѯ������Ի�ʵ�壬��ѯ�õ��Ľ������Ԫ����Tuple
//		criteria.multiselect(stuRoot, enrolRoot);
//		// ʹ��builder���ɲ�ѯ������ʵ����������������
//		Predicate pred = builder.equal(
//			enrolRoot.get(Enrolment_.student), stuRoot);
//		// ʹ��CriteriaQuery��where()������Ӳ�ѯ������ʵ����������������
//		criteria.where(pred);
//		List<Tuple> list = em.createQuery(criteria)
//			.getResultList();
//		System.out.println("=====����ѯ�Ķ��Rootʵ���װ��Tuple=====");
//		for(Tuple tuple : list)
//		{
//			// ͨ��Ԫ������ȡ��Rootʵ��
//			System.out.println(tuple.get(stuRoot) + "->"
//				+ tuple.get(enrolRoot));
//		}
//		em.getTransaction().commit();
//		em.close();
//	}
//
//}
