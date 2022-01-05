# 4) Linkedin Spring Learning Path: Creating your first Spring Boot Microservice - A
## Summary
Code part of course: https://www.linkedin.com/learning/creating-your-first-spring-boot-microservice/


## Topics
1) Spring Data Query Custom Methods.
2) JPA Relationships
3) Paging
4) Sorting
5) Controlling API exposure
6) **@RestResource(exported = false)**: Won't expose this method.\
7) RestController
8) @PathVariable

## Tools
1) spring-data-rest-hal-explorer

## Notes
1) **collectionResourceRel** specifies how to call two or more instances of an entity

## Links
Postman
* http://localhost:8080/packages/search/findByName?name=California%Calm
* ** Paging and sorting:** http://localhost:8080/tours?size=1&page=0&sort=title,asc
* http://localhost:8080/tours/{tourId}/ratings POST, GET
* http://localhost:8080/tours/{tourId}/ratings/average GET