package com.saber;

import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.OneToMany;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@ManagedBean
@SessionScoped
public class Data {
    
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
        //Users user = new Users("Jack",25);
        //Users user2 = new Users("Saber",23);
        Users user3 = new Users("Hosico",6);
	public boolean addUser() {
		try {
		session.beginTransaction();
		session.save(user3);
		session.getTransaction().commit();
		
		System.out.println("succeded user creation");
		return true;
		}
		catch (HibernateException e){
			e.printStackTrace();
			System.out.println("failed user creation");
			return false;
		}
	}
        
        public boolean deleteUser(int id){
            try{
                Users user2 = new Users();
                user2.setId(id);
            session.beginTransaction();
            session.delete(user2);
            session.getTransaction().commit();
                System.out.println("Succeded user suppression !");
            return true;
            }catch(HibernateException e){
                e.printStackTrace();
                System.out.println("Failed to delete user !");
                return false;
            }
        }
        
        public Users findUser(int id){
            try{
                Users user3 = new Users();
                session.beginTransaction();
                session.load(user3, 2);
                session.getTransaction().commit();
                System.out.println("Found User name : " + user3.getName() + " With ID : " + user3.getId());
                return user3;
            }catch(HibernateException e){
                e.printStackTrace();
                System.out.println("User not found");
                return null;
            }
        }
        
        public void update(){
            try{
                Users user = findUser(2);
                //session.evict(user);
                session.beginTransaction();
                user.setName("Mohammed");
                session.update(user);
                session.getTransaction().commit();
                System.out.println("Update Success !");
            }catch(HibernateException e){
                e.printStackTrace();
                System.out.println("Update Failed.");
            }
            
        }
        
        public void getResult(){
            try{
                session.beginTransaction();
            SQLQuery query = session.createSQLQuery("select * from users");
                //Query query2 = session.createQuery("select * from users");
           query.addEntity(Users.class);
            //query.addEntity(Numbers.class);
            List<Users> result = query.list();
//            joinClass userR = (joinClass) result.get(0);
//                System.out.println(userR.getId());
//            for(Object object : result){
////                Users user = (Users) result;
////                Numbers number = (Numbers) object[1];
//                Users user = (Users) object;
//                System.out.println(user.getId());
//            }
                System.out.println(result.get(0).getId());
            System.out.println("Result TRUE !");
            }catch(HibernateException e){
                System.out.println("No Result !");
            }
        }
        
        public void join(){
            try{
            session.beginTransaction();
            Query hqlQuery = session.createQuery("from Numbers where numberUserId = 2");
            for(Object o : hqlQuery.list()){
                Numbers u = (Numbers) o;
                System.out.println("User id : "+ u.getNumberUserId()+ " Number : " + u.getNumber());
            }
            //session.getTransaction().commit();
                //System.out.println("User : " + user.getId() + " "+ user.getNumber());
                System.out.println("true");
            }catch(HibernateException e){
                e.printStackTrace();
                System.out.println("false");
            }
            
        }
}
