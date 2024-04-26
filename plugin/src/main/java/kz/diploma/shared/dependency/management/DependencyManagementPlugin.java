package kz.diploma.shared.dependency.management;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DependencyManagementPlugin implements Plugin<Project> {

	public void apply(Project project){
		project.getProject().getPluginManager().apply("idea");
		project.getProject().getPluginManager().apply("java");
		project.getProject().getPluginManager().apply("org.springframework.boot");
		project.getProject().getPluginManager().apply("io.spring.dependency-management");
	}

}
