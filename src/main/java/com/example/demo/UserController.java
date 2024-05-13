package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/app/")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResponseEntity<?> findAll(@RequestBody @Validated UserVO userVO, BindingResult bindingResult) {

        log.info("userVO 파라미터: {}", userVO);

        ResponseDTO responseDTO = new ResponseDTO();


        if(bindingResult.hasErrors()) {
            responseDTO.setResultCode("validationFail");
            return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
        }


        responseDTO.setResultCode("Success");
        responseDTO.setRes(userService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
