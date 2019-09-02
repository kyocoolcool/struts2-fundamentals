package lee;
import org.hibernate.Transaction;
import org.hibernate.Session;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;

import org.crazyit.app.domain.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class HqlQuery
{
	public static void main(String[] args)
		throws Exception
	{
		HqlQuery mgr = new HqlQuery();
		mgr.findPersons();
//		mgr.findPersonsByHappenDate();
//		mgr.findPersonProperty();
	}
	private void findPersons()
	{
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
//		List<Person> pl = sess.createQuery("select distinct p from Person p "
//			+ "join p.myEvents where title = :eventTitle", Person.class)
//			.setParameter("eventTitle" , "很高兴的事情")
//			.getResultList();
		List<Person> pl = sess.createQuery("select  p from Person p join p.myEvents", Person.class)
//				.setParameter("eventTitle" , "很高兴的事情")
				.getResultList();
		for(Person p : pl)
		{
			System.out.println(p.getName());
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
	private void findPersonsByHappenDate()throws Exception
	{
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2005-01-01");
		System.out.println("ϵͳ��ʼͨ�����ڲ�����" + start);
		List<Person> pl = sess.createQuery("select distinct p from Person p "
			+ "inner join p.myEvents event where event.happenDate "
			+ "between :firstDate and :endDate", Person.class)
			.setParameter("firstDate" , start)
			.setParameter("endDate" , new Date())
			.getResultList();
		for (Person p : pl)
		{
			System.out.println(p.getName());
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
	private void findPersonProperty()
	{
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		List<Object[]> pl = sess.createQuery("select distinct p.id,  p.name , p.age "
			+ "from Person p join p.myEvents", Object[].class)
			.getResultList();
		for (Object[] objs : pl)
		{
			System.out.println(Arrays.toString(objs));
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
}