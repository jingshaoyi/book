package com.test.demo.service;

import com.test.demo.dao.BookDAO;
import com.test.demo.pojo.Book;
import com.test.demo.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;
    @Autowired
    CategoryService categoryService;
    //查询
    public List<Book> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookDAO.findAll(sort);
    }
    //添加
    public void addOrUpdate(Book book) {
        bookDAO.save(book);
    }
    //删除
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }
    //条件查询
   public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookDAO.findAllByCategory(category);
    }
    //搜索查询
    public List<Book> Search(String keywords) {
        return bookDAO.findAllByTitleLikeOrAuthorLike('%' + keywords + '%', '%' + keywords + '%');
    }
}
