package com.tts.techtalenttwitter.controllers;

@Controller
public class FollowController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/follow/{username}")
    public String follow(@PathVariable(value="username") String username,
                         HttpServletRequest request) {
}