package itsol.internship.Impl;

import itsol.internship.model.CategoryNews;
import itsol.internship.repository.CategoryNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class CategoryNewsRepositoryImpl implements CategoryNewsRepository, CrudRepository<CategoryNews, String> {

    @Autowired
    CategoryNewsRepository categoryNews;
    public  void a(){
        findAll();
    }

}
