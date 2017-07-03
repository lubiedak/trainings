package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerConfController {

    @RequestMapping(path = "/server/cfg",
            method = RequestMethod.POST,
            produces = "application/json")
    public String greetingPost(@RequestParam(value = "name", required = false, defaultValue = "admin") String name) throws InterruptedException {
        Thread.sleep(2000);
        return "{\"status\": \"Proccesssing succesful. Congrats " + name + "\"}";
    }

    @RequestMapping(path = "login",
            method = RequestMethod.POST,
            produces = "application/json")
    public String login(@RequestParam(value = "usr", required = false, defaultValue = "admin") String user,
                        @RequestParam(value = "pwd", required = false, defaultValue = "admin") String pass){

        return "{\"status\": \"Login succesful. Congrats " + user + "\"}";
    }
}
