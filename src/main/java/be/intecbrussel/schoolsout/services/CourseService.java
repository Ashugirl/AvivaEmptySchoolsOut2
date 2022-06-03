package be.intecbrussel.schoolsout.services;

import be.intecbrussel.schoolsout.data.Course;
import be.intecbrussel.schoolsout.data.User;
import be.intecbrussel.schoolsout.repositories.CourseRepository;

import java.math.BigDecimal;
import java.util.Scanner;

public class CourseService {

    private CourseRepository courseRepository;

    public CourseService() {
        courseRepository = new CourseRepository();

    }

    //Maak een Course met de constructor
    public void createCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of course? ");
        String name = scanner.nextLine();
        System.out.println("Course description? ");
        String description = scanner.nextLine();
        System.out.println("Maximum points for course?");
        BigDecimal maxValue = scanner.nextBigDecimal();

        courseRepository.createOne(new Course(name, description, maxValue));
    }

    //TODO: Delete een course, en delete alle Grades van die Course
    public void deleteCourse(){

    }

    //TODO:Update een Course. Je mag enkel de name, description en maxGradeYouCanGet editten
    public void updateCourse(){

    }

    //TODO:Toon een course op basis van Id
    public void findOneCourseById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the course ID:");
        Course course = courseRepository.getOneById(scanner.nextLong());
        System.out.println(course);

    }

    //TODO: Toon alle Courses
    public void findAllCourses(){
        System.out.println("These are all the courses being given:");
        for(Course course : courseRepository.getAll()){
        System.out.println(course);
        }
    }

    //TODO: Print alle Grades van een Course (hint: gettermethode)
    public void findAllGradesFromCourse(){

    }




}
