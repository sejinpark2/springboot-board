package com.example.demo.user;

import com.example.demo.core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Error error) {

        userService.join(requestDTO);

        return ResponseEntity.ok( ApiUtils.success(null) );
    }

    @PostMapping("/check")
    public ResponseEntity<?> check(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Error error) {
        userService.checkEmail(requestDTO.getEmail());
        return ResponseEntity.ok( ApiUtils.success(null) );
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Error error, HttpServletResponse response) {
        String jwt = userService.login(requestDTO);

        // JWT를 쿠키에 저장
        String encodedJwt = URLEncoder.encode(jwt, StandardCharsets.UTF_8);
        Cookie cookie = new Cookie("jwt", encodedJwt);
        cookie.setPath("/"); // 쿠키의 유효 범위 설정
        //cookie.setHttpOnly(true); // JavaScript에서 쿠키에 접근하지 못하도록 설정
        response.addCookie(cookie);
        System.out.println(cookie.getValue());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + jwt);

        // ResponseBody에도 JWT를 포함하여 반환하거나 필요한 응답을 진행합니다.
        return new ResponseEntity<>(jwt,httpHeaders, HttpStatus.OK);
    }
}

