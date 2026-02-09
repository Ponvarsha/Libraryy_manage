package in.kce.book.service;

import in.kce.book.bean.BookBean;
import in.kce.book.dao.BookDAO;

public class Administrator {

    public String addBook(BookBean bookBean) {

    if (bookBean == null ||
       bookBean.getBookname() == null || bookBean.getBookname().isEmpty() ||
       bookBean.getIsbn() == null || bookBean.getIsbn().isEmpty() ||
       (bookBean.getBookType() != ' '&&bookBean.getBookType() != 'G' && bookBean.getBookType() != 'T') ||
       bookBean.getCost() <= 0 ||
       bookBean.getAuthor() == null ||
       bookBean.getAuthor().getAuthorName().isEmpty())
    {
       return "INVALID";
    }

       
        int result = new BookDAO().createBook(bookBean);
         
        if(result==1) {
        return "SUCCESS";
        }
        else {
        return "FAILURE";
        }
    }
   
    public BookBean viewBook(String isbn) {
    BookDAO bookDAO = new BookDAO();
    BookBean bookBean = bookDAO.fetchBook(isbn);
    return bookBean;
    }

   
}