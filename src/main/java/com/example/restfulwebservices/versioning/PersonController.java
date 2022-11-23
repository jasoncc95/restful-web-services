package com.example.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/v1/person")
    public PersonV1 getPersonV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(value = "/person", params = "version=1")
    public PersonV1 getPersonV1RequestParameter() {
        return new PersonV1("John Doe");
    }

    @GetMapping(value = "/person", params = "version=2")
    public PersonV2 getPersonV2RequestParameter() {
        return new PersonV2(new Name("John", "Doe"));
    }

    @GetMapping(value = "/person", headers = "X-API-VERSION=1")
    public PersonV1 getPersonV1RequestHeader() {
        return new PersonV1("Jason Castillo");
    }

    @GetMapping(value = "/person", headers = "X-API-VERSION=2")
    public PersonV2 getPersonV2RequestHeader() {
        return new PersonV2(new Name("Jason", "Castillo"));
    }

    @GetMapping(value = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonV1RequestAcceptHeader() {
        return new PersonV1("Richard Jackson");
    }

    @GetMapping(value = "/person", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonV2RequestAcceptHeader() {
        return new PersonV2(new Name("Richard", "Jackson"));
    }

}
