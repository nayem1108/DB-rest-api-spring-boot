package com.springboot.testapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.testapp.Model.Blog;

public interface BlogRepository extends CrudRepository<Blog, Integer>{
    public Blog findById(int id);
}
