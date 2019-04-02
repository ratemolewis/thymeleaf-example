package com.zalego.io.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ACCEPTED,
        reason = "wrong email or password!!!!!!!!")
public class AuthorisedAccess extends RuntimeException {
}
