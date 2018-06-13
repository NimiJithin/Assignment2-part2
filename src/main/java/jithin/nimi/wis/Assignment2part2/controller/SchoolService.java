package jithin.nimi.wis.Assignment2part2.controller;


import jithin.nimi.wis.Assignment2part2.model.Student;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/rest/school")
public class SchoolService {

    public RestTemplate restTemplate;

    @RequestMapping(value = "/students/{id}")
    public Student getStudent(@PathVariable String id) {

        String URL="http://localhost:8080/rest/student/"+id;
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();
        Student student = restTemplate.getForObject(URL,Student.class);
        student.toString();
        return student;
    }


}
