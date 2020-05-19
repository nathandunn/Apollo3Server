package apollo3serveronly

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.grails.SpringfoxGrailsIntegrationConfiguration


// 1. Enable SpringFox on your project
@EnableSwagger2
//// 2. Import the springfox grails integration configuration
//@Import([springfox.documentation.grails.SpringfoxGrailsIntegrationConfiguration])
@Import([SpringfoxGrailsIntegrationConfiguration])
//@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

//    // 3. **Optionally** define a custom docket or omit this step to use the default
//    // For grails it is preferrable to use use the following settings.
//    @Bean
//    Docket api() {
//        new Docket(DocumentationType.SWAGGER_2)
//            .ignoredParameterTypes(MetaClass)
//            .select()
//            .paths(not(ant("/error")))
//            .build()
//    }
}