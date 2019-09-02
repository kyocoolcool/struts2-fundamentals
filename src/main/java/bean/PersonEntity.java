package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cascade;
import org.hibernate.cfg.Configuration;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="person_inf")
public class PersonEntity {
/*映射是collection
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    //映射List對應 school_inf表 person_id,list_order primary key
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "school_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @Column(name = "school_name")
    @OrderColumn(name = "list_order")
    private List<String> schools = new ArrayList<String>();

    //映射Map對應 score_inf表 person_id,subject_name primary key
    @ElementCollection(targetClass = Float.class)
    @CollectionTable(name = "score_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @MapKeyColumn(name = "subject_name")
    @MapKeyClass(String.class)
    @Column(name = "mark")
    private Map<String, Float> scores = new HashMap<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Map<String, Float> getScores() {
        return scores;
    }

    public void setScores(Map<String, Float> scores) {
        this.scores = scores;
    }
*/


/*映射是單向OneToOne
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    @OneToOne(targetEntity=AddressEntity.class)
    //沒有關連
//    @JoinColumn(name = "address_id",referencedColumnName = "address_id",unique = true)
    //有關連
    @JoinTable(name="person_address",
            joinColumns=@JoinColumn(name="person_id"
                    , referencedColumnName="person_id" , unique=true),
            inverseJoinColumns=@JoinColumn(name="address_id"
                    , referencedColumnName="address_id", unique=true)
    )
    //若設定則可以免掉persist();
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private AddressEntity address;

    public PersonEntity() {
    }

    public PersonEntity(String name, Integer age, AddressEntity address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AddressEntity getAdress() {
        return address;
    }

    public void setAdress(AddressEntity adress) {
        this.address = adress;
    }


    public static void main(String[] args) {
        Configuration conf = new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction tx =sess.beginTransaction();
        PersonEntity person=new PersonEntity();
        person.setAge(20);
        person.setName("com.Chris");
        AddressEntity a =new AddressEntity("Nahui");
        person.setAdress(a);
        sess.persist(a);
        sess.save(person);
        tx.commit();
        sess.close();
        sf.close();
    }
*/

//映射是單向ManyToOne
@Id
@Column(name = "person_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    private String name;
    private Integer age;
    @ManyToOne(targetEntity=AddressEntity.class,cascade = CascadeType.ALL)
    //沒有關連
//    @JoinColumn(name = "address_id",nullable = false)
    //有關連
    @JoinTable(name="person_address",
            joinColumns=@JoinColumn(name="person_id"
                    , referencedColumnName="person_id" , unique=true),
            inverseJoinColumns=@JoinColumn(name="address_id"
                    , referencedColumnName="address_id", unique=true)
    )
    //若設定則可以先insert Address再insert Person避免再增加一條update
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private AddressEntity address;

    public PersonEntity() {
    }

    public PersonEntity(String name, Integer age, AddressEntity address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AddressEntity getAdress() {
        return address;
    }

    public void setAdress(AddressEntity adress) {
        this.address = adress;
    }


    public static void main(String[] args) {
        Configuration conf = new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction tx =sess.beginTransaction();
        PersonEntity person=new PersonEntity();
        PersonEntity person2=new PersonEntity();
        person.setAge(50);
        person.setName("com.Chris");
        person2.setAge(30);
        person2.setName("com.Riven");
        AddressEntity a =new AddressEntity("ha");
        AddressEntity b =new AddressEntity("haha");
        AddressEntity c =new AddressEntity("hahaha");
        person.setAdress(a);
        sess.persist(person);
        sess.save(person);
        person.setAdress(b);
        person2.setAdress(c);
        sess.persist(person2);
        sess.save(person2);
        tx.commit();
        sess.close();
        sf.close();
    }

}
