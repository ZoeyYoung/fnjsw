package fnjsw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/detail/")
public class DetailController {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getUserList(HttpServletRequest request, Model model) {
        return "detail";
    }

}
