package com.springboot.testapp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.testapp.Model.Blog;
import com.springboot.testapp.Service.BlogService;

@RestController
public class BlogController {
    
    @Autowired
    private BlogService blogService;

    // read data

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs(){
        return this.blogService.getAllBlogs();
    }

    @GetMapping("/blogs/{id}")
    public Blog getBlogByID(@PathVariable("id") int id){
        return this.blogService.getBlogByID(id);
    }

    // create data
    @PostMapping("/blogs")
    public void creatBlog(@RequestBody Blog blog){
        this.blogService.createBlog(blog);
    }


    // delete data 

    @DeleteMapping("/blogs/{id}")
    public void deleteBook(@PathVariable("id") int id){
        blogService.deleteBlogById(id);
    }

    @PutMapping("/blogs/{id}")
    public void updateBlog(@RequestBody Blog blog, @PathVariable("id") int id){
        blogService.updateBlog(blog, id);
    }
}
