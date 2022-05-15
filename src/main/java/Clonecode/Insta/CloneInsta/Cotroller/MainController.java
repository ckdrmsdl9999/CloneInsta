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

}
