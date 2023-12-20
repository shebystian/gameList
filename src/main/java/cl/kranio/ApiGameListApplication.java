package cl.kranio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(info = @Info(title = "Microservicio gameList", version = "1.2.3", description = "APIs Swagger Microservicio gamelist", license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0.html"), contact = @Contact(url = "https://kranio.io", name = "MS-GameList", email = "sebastian@kranio.io")), security = {
		@SecurityRequirement(name = "non-Security") }, servers = {
				@Server(description = "url ambiente local", url = "http://localhost:8080") })

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableAsync
public class ApiGameListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGameListApplication.class, args);
	}

}
