package controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserHandler;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class WebController {
    @Autowired
            private UserHandler userHandler;


    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/newName")
    public String newName() {
        return "newName/newName";
    }

    @RequestMapping(value = "/servletNewName", method = RequestMethod.POST)
    public String saveNewName(HttpServletRequest req) {
        String name = req.getParameter("name");
        userHandler.newName(name);
        return "newName/newNameResult";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete/delete";
    }

    @RequestMapping("/servletDelete")
    public String deletePerson(HttpServletRequest req) {
        long id = Long.parseLong(req.getParameter("id"));
        userHandler.delete(id);
        return "delete/deleteAnd";
    }


    @RequestMapping("/search")
    public String search() {

        return "search";
    }

    @RequestMapping("/servletSearch")
    public String searchPerson(HttpServletRequest req, Model mo) {
        long id = Long.parseLong(req.getParameter("id"));
        userHandler.search(id);
        String name = userHandler.user.getName();
        mo.addAttribute("Name", name);
      return "person";
    }

}
