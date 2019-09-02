//package dao;
//
//import bean.PersonEntity;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class PersonDao {
//    //搭配PersonEntity映射Collection
//    public static void main(String[] args) {
//    Configuration conf = new Configuration().configure();
//    SessionFactory sf=conf.buildSessionFactory();
//    Session sess=sf.openSession();
//    Transaction tx =sess.beginTransaction();
//    PersonEntity person=new PersonEntity();
//    person.setAge(20);
//    person.setName("org.Chris");
//    Map scores=new HashMap<>();
//    scores.put("Java",100f);
//    scores.put("SQL",59.99f);
//    person.setScores(scores);
//        /*與上面四行意思相同
//         *persion.getScores().put("Java",59.9f);
//         *persion.getScores().put("SQL",80f);
//         * */
//    person.getSchools().add("大學");
//    person.getSchools().add("中學");
//    sess.save(person);
//    tx.commit();
//    sess.close();
//    sf.close();
//}
//}
