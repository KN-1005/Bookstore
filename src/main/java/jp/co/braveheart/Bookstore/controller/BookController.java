package jp.co.braveheart.Bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jp.co.braveheart.Bookstore.entity.Book;
import jp.co.braveheart.Bookstore.service.impl.BookServiceImpl;

@Controller
public class BookController {

    @Autowired
    BookServiceImpl service;

    /**
     * ホーム画面アクセス
     * @param model
     * @return
     */
    @GetMapping("/")
    public String home(Model model) {
        Iterable<Book> list = service.find();
        model.addAttribute("list", list);
        return "home";
    }
}
