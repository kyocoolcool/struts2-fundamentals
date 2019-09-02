package dao;

import bean.NewsEntity;
//import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewsManager {
//    private static  final Logger LOGGER = Logger.getLogger(NewsManager.class);

    public static void main(String[] args) {
        Configuration conf = new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction tx =sess.beginTransaction();
        NewsEntity n=new NewsEntity();
        n.setTitle("title2019");
        n.setContent("content2");
        sess.save(n);
        tx.commit();
        sess.close();
        sf.close();
    }
}
