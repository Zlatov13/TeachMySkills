package com.example.springDataJPA.controller;

import com.example.springDataJPA.servise.HandlerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {

    @Autowired
    private HandlerUser handlerUser;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/create")
    public String create(){
        return "create/createUser";
    }

    @RequestMapping("/createUserNext")
    public String createComplitted(HttpServletRequest req)
    { String name = req.getParameter("name");
        handlerUser.createUser(name);
        return "create/createUserComplited";
    }

    @RequestMapping("/search")
    public String search(){
        return "search/search";
    }
    @RequestMapping("/searchUserById")
    public ModelAndView searchUserById(HttpServletRequest request){
        long id = Long.parseLong(request.getParameter("id"));
        ModelAndView view = new ModelAndView("search/searchComplited");
        view.addObject("Name",  handlerUser.searchById(id).getName());
        view.addObject("id", Long.toString(id));
        return view;
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete/delete";
    }

    @RequestMapping("/deleteUserById")
    public String deleteUserById(HttpServletRequest request){
        long id = Long.parseLong(request.getParameter("id"));
        handlerUser.deleteUser(id);
        return "delete/deleteComplited";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "edit/edit";
    }

@RequestMapping("/editUserById")
    public ModelAndView editUserById(HttpServletRequest request){
    long id = Long.parseLong(request.getParameter("id"));
       ModelAndView view = new ModelAndView("edit/editUserById");
    view.addObject("Name",  handlerUser.searchById(id).getName());
    view.addObject("id", Long.toString(id));
    return view;
}

@RequestMapping("/change")
    public String changeEditUser(HttpServletRequest request){
    String name = request.getParameter("name");
    System.out.println(name);
    Long id = Long.parseLong(request.getParameter("id"));
    System.out.println(id);
    handlerUser.editUserById(id, name);
    return "edit/editComplited";
}
}
