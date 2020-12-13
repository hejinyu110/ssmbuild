package com.he.service;

import com.he.dao.BookMapper;
import com.he.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //service 调用 dao 组合dao
    private BookMapper bookMapper;
    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(Books books) {
        return bookMapper.deleteBook(books);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
