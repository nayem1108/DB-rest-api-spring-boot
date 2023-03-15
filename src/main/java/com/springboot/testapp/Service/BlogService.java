package com.springboot.testapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.testapp.Model.Blog;
import com.springboot.testapp.Repository.BlogRepository;

@Component
public class BlogService {
    
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs(){
        List<Blog> blogs = (List<Blog>) this.blogRepository.findAll();
        return blogs;
    }

    public Blog getBlogByID(int id){
        Blog blog = null;
        try {
            blog =  this.blogRepository.findById(id);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return blog;
    }


    public void createBlog(Blog blog){
        blogRepository.save(blog);
    }

    public void deleteBlogById(int id){
        blogRepository.deleteById(id);
    }


    public void updateBlog(Blog blog, int id){
        blogRepository.save(blog);
    }
}
