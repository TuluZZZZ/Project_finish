package com.tms.repository;
import com.tms.model.UserInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
  public final EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
  public final EntityManager entityManager= emf.createEntityManager();
  public void save(UserInfo userInfo) {
      entityManager.getTransaction().begin();
      entityManager.persist(userInfo);
      entityManager.getTransaction().commit();
  }
      public List<UserInfo> findAll(){
          Query query= entityManager.createQuery("FROM ");
      }

      public void delete(Integer id){
      entityManager.getTransaction().begin();
      entityManager.remove(entityManager.find(UserInfo.class,id));
      entityManager.getTransaction().commit();
      }

      public UserInfo findById (Integer id){
      entityManager.getTransaction().begin();
      UserInfo userInfo


return entityManager.find(UserInfo.class,id);

      }
  }
