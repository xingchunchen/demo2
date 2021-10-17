package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo2Application.class, args);
        System.out.println("dev");
    }

    public void master2(){
        System.out.println("master2");
    }
    public void dev2(){
        System.out.println("dev2");
    }

    public void dev3(){
        System.out.println("dev3");
    }

    public void master4(){
        System.out.println("master4");
    }

    public void master5(){
        System.out.println("master5");
    }

    public void master6(){
        System.out.println("master6");
    }

    public void cherrypick_hotfix(){
        System.out.println("cherrypick_hotfix");
    }

    public void master7(){
        System.out.println("master7");
    }


}
