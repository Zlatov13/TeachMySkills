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
    public String newName() {
        return "newName/newName";
    }

    @RequestMapping(value = "/servletNewName", method = RequestMethod.POST)
    public String saveNewName(HttpServletRequest req) {
        String name = req.getParameter("name");
        userHandler.create(name);
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
        return "deleteComplited";
    }


    @RequestMapping("/search")
    public String search() {
        return "search";
    }

    @RequestMapping("/servletSearch")
    public ModelAndView searchUserById(HttpServletRequest request){
       long id = Long.parseLong(request.getParameter("id"));
        ModelAndView view = new ModelAndView("person");
        String name = userHandler.search(id).getName();
        view.addObject("Name", name );
        view.addObject("id", Long.toString(id));
        return view;
    }

}
