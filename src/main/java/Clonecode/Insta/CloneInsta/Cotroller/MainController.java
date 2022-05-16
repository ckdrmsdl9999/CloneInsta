package Clonecode.Insta.CloneInsta.Cotroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class MainController {

@RequestMapping("/main")
    public String main(){
    return "index";
}

@RequestMapping("/login")
    public String login(){
        return "login";
}

    @RequestMapping("/new_post")
    public String new_post(){
        return "new_post";
    }

    @RequestMapping("/follow")
    public String follow(){
        return "follow";
    }

    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }

}
