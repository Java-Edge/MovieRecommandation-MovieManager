package com.javaedge.service;

import com.javaedge.common.Page;
import com.javaedge.po.Category;
import com.javaedge.po.Movie;
import com.javaedge.po.NewMovie;
import com.javaedge.po.Query;

import java.util.List;

public interface MovieService {

    // 查询客户列表
    public Page<NewMovie> findMovieList(Query query);

    public NewMovie getMovieById(Integer id);

    public void deleteMovie(Integer id);

    public List<Category> selectCategory();

    public void updateMovie(Movie movie, String[] categoryIds);

    public void addMovie(Movie movie, String[] categoryIds);

}
