package controller;


import dao.UserDao;
import dao.UserDaoImpl;
import domain.User;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    private Logger logger = Logger.getLogger(MainController.class);

    public UserDao dao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        dao = new UserDaoImpl();
        model.addAttribute("list",dao.list());
        return "list";
    }
}