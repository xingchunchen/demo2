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

    public void cherrypick_hotfix2(){
        System.out.println("cherrypick_hotfix2");
    }

    public void cherrypick4(){
        System.out.println("cherrypick_hotfix2");
    }

    public void cherrypick5(){
        System.out.println("cherrypick5");
    }

    public void cherrypick6(){
        System.out.println("cherrypick6");
    }

    public void cherrypick7(){
        System.out.println("cherrypick7");
    }

    public void cherrypick8(){
        System.out.println("cherrypick8");
    }


}
