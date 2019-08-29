package co.happyMeal.comicBlog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping("/trythis")
    @ResponseBody
    public String run() {
        return "yes! This work!";
    }
}
