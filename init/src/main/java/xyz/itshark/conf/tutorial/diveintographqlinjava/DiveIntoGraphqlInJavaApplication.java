package xyz.itshark.conf.tutorial.diveintographqlinjava;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import xyz.itshark.conf.tutorial.diveintographqlinjava.service.AttendeeService;
import xyz.itshark.conf.tutorial.diveintographqlinjava.service.SpeakerService;
import xyz.itshark.conf.tutorial.diveintographqlinjava.service.TalkService;

@SpringBootApplication
public class DiveIntoGraphqlInJavaApplication {


	@Autowired
	private SpeakerService speakerService;

	@Autowired
	private TalkService talkService;

	@Autowired
	private AttendeeService attendeeService;

	public static void main(String[] args) {
		SpringApplication.run(DiveIntoGraphqlInJavaApplication.class, args);
	}

//	@Bean
//	public ServletRegistrationBean graphQLServlet() {
//		return new ServletRegistrationBean(SimpleGraphQLHttpServlet.newBuilder(buildSchema()).build(),"/graphql");
//	}
//
//	private static GraphQLSchema buildSchema() {
//		return SchemaParser
//				.newParser()
//				.file("graphql/schema.graphqls")
////                .dictionary()
//				.resolvers()
//				.build()
//				.makeExecutableSchema();
//	}

}
