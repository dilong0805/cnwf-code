package com.landon.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("user")
public class IndexController {

    @GetMapping("{name}")
    public Object index(@PathVariable("name") String name) {
        return STR."Welcome User \{name}";
    }
}
