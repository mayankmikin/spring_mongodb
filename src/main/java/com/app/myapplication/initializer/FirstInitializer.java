package com.app.myapplication.initializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.app.myapplication.configuration.FirstConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FirstInitializer  implements WebApplicationInitializer
{

//	@Override
//	protected Filter[] getServletFilters() {
//		Filter [] singleton = { new CORSFilter()};
//		return singleton;
//	}
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[] { FirstConfiguration.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return null;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
public void onStartup(ServletContext container) throws ServletException {

	AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
	ctx.register(FirstConfiguration.class);
	ctx.setServletContext(container);

	ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));

	servlet.setLoadOnStartup(1);
	servlet.addMapping("/");
}

}
