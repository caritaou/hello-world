package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung, Carita Ou
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {
//  @RequestMapping(Array("/Hello"))
  @RequestMapping(value=Array("/"), method = Array(RequestMethod.GET))
//  @RequestMapping(value=Array("/"), method = Array(RequestMethod.GET, RequestMethod.HEAD))
  def Hello(): String="Hello World!"
//  def Hello {
//    println("Hello World")
//  }
}
