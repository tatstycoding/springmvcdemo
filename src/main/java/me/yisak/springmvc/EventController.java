package me.yisak.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    //@RequestMapping(value = "/events", method = HttpMethod.GET)
    @GetMapping("/events")
    public String events(Model model){
        model.addAttribute("events", eventService.getEvents());

            return "events"; // 뷰의 이름 "events"
    }



}
