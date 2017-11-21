//package com.ufinity.piao.controller;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
///**
// * For a non Spring-Boot Spring application though, it is a little more tricky,
// * if it is a programmatic configuration of web.xml, then the configuration is
// * along these lines:
// * 
// **/
//
//public class CustomWebAppInitializer implements WebApplicationInitializer {
//	@Override
//	public void onStartup(ServletContext container) {
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//		rootContext.register(CustomWebSecurityConfigurerAdapter.class);
//		ContextLoaderListener contextLoaderListener = new ContextLoaderListener(rootContext);
//		container.addListener(contextLoaderListener);
//		// container.setInitParameter("contextInitializerClasses",
//		// "com.ufinity.piao.controller.DemoApplicationContextInitializer");
//		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
//		webContext.register(MvcConfiguration.class);
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
//		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", dispatcherServlet);
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
//	}
//}