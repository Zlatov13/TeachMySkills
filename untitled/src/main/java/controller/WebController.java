package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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
    public String create() {
        return "create/createUser";
    }

    @RequestMapping(value = "/servletNewName", method = RequestMethod.POST)
    public String createUser(HttpServletRequest req) {
        String name = req.getParameter("name");
        userHandler.create(name);
        return "create/createUserComplited";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete/delete";
    }

    @RequestMapping("/servletDelete")
    public String deletePerson(HttpServletRequest req) {
        long id = Long.parseLong(req.getParameter("id"));
        userHandler.delete(id);
        return "deleteComplited";
    }

    @RequestMapping("/search")
    public String search() {
        return "search/search";
    }

    @RequestMapping("/servletSearch")
    public ModelAndView searchUserById(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("id"));
        ModelAndView view = new ModelAndView("search/searchComplited");
        String name = userHandler.search(id).getName();
        view.addObject("Name", name);
        view.addObject("id", Long.toString(id));
        return view;
    }

    @RequestMapping("/edit")
    public String edit() {
        return "edit/edit";
    }

    @RequestMapping("/servletEdit")
    public ModelAndView editById(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("id"));
        ModelAndView view = new ModelAndView("edit/editUserById");
        String name = userHandler.search(id).getName();
        view.addObject("Name", name);
        view.addObject("id", Long.toString(id));
        return view;

    }
    @RequestMapping("/editUser")
    public String editComplited(HttpServletRequest request) {
        String name = request.getParameter("name");
        Long id = Long.parseLong(request.getParameter("id"));
        userHandler.edit(id, name);
        return "edit/editComplited";
    }
}


