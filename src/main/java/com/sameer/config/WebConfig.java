package com.sameer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	
    	
    	
        //Root path redirects to login
    	
        registry.addViewController("/").setViewName("forward:/Html/Login.html");
        
        // Clean URL mappings
        registry.addViewController("/login").setViewName("forward:/Html/Login.html");
        registry.addViewController("/dashboard").setViewName("forward:/Html/Dashboard/Dashboard.html");
        registry.addViewController("/signup").setViewName("forward:/Html/SignUP.html");
        registry.addViewController("/forgot-password").setViewName("forward:/Html/Forgotpassword.html");
        registry.addViewController("/reset-password").setViewName("forward:/Html/ResetPassword.html");
        registry.addViewController("/profile").setViewName("forward:/Html/Profile.html");
        registry.addViewController("/category").setViewName("forward:/Html/Category.html");
        registry.addViewController("/all-tasks").setViewName("forward:/Html/AllTasks.html");
        registry.addViewController("/employee-list").setViewName("forward:/Html/EmployeeList.html");
        registry.addViewController("/form-task").setViewName("forward:/Html/FormTask.html");
        registry.addViewController("/overdue-tasks").setViewName("forward:/Html/OverdueTasks.html");
        registry.addViewController("/redo-tasks").setViewName("forward:/Html/RedoTasks.html");
        registry.addViewController("/review-approved-task").setViewName("forward:/Html/Review&Approvedtask.html");
        registry.addViewController("/change-password").setViewName("forward:/Html/ChangePassword.html");
        registry.addViewController("/comp-app").setViewName("forward:/Html/CompApp.html");
        registry.addViewController("/all-admin-created-task").setViewName("forward:/Html/AllAdminCreatedTask.html"); 
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // IMPORTANT: Your resources should be in src/main/resources/static/
        // This maps URLs to the static folder
        
        registry.addResourceHandler("/Html/**")
                .addResourceLocations("classpath:/static/Html/")
                .setCachePeriod(0);
        
        registry.addResourceHandler("/Css/**")
                .addResourceLocations("classpath:/static/Css/")
                .setCachePeriod(0);
        
        registry.addResourceHandler("/Images/**")
                .addResourceLocations("classpath:/static/Images/")
                .setCachePeriod(0);
        
        registry.addResourceHandler("/JS/**")
                .addResourceLocations("classpath:/static/JS/")
                .setCachePeriod(0);
        
        // Default handler for root static resources
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .setCachePeriod(0);
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://localhost:8080", "https://127.0.0.1:5500")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
   
}