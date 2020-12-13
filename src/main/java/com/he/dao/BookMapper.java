package com.he.dao;

import com.he.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(Books books);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryAllBook();
}
