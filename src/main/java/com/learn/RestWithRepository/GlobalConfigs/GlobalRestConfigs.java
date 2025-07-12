package com.learn.RestWithRepository.GlobalConfigs;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learn.RestWithRepository.CustomDTOs.Response;

@ControllerAdvice
@Configuration
public class GlobalRestConfigs {

  // for global exception handeling
  @ExceptionHandler
  public ResponseEntity<Response<String>> handleAllExceptions(Exception exception) {
    Response<String> response = new Response<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST.value());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
  }

  // // for global CORS
  // @Bean
  // public WebMvcConfigurer corsConfigurer() {
  //   System.out.println("Cors Bean execution");
  //   return new WebMvcConfigurer() {
  //     @Override
  //     public void addCorsMappings(@NonNull CorsRegistry registry) {
  //       registry.addMapping("/**")
  //       .allowedOrigins("http://localhost:5173")
  //       .allowedMethods("*")
  //       .allowedHeaders("*")
  //       .allowCredentials(true);
  //     }
  //   };
  // }
}
