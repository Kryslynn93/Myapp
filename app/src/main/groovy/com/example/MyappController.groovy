package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/myapp")
class MyappController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}