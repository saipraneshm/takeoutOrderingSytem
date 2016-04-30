package com.cmpe.finalproject.dao.config;

/*******************************************************************************
 * Author: Sai Pranesh
 * Description: This class is responsible to connect to the database using 
 * Hibernate engine. We are using JPA with hibernate engine. This class is a 
 * configuration file and is reading properties from database.properties to
 * find the necessary configuration details.
 *******************************************************************************/
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.cmpe.finalproject.dao.OrderingDao;
import com.cmpe.finalproject.dao.OrderingDaoImpl;
import com.cmpe.finalproject.service.OrderingService;
import com.cmpe.finalproject.service.OrderingImpl;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("com.cmpe")
public class OrderingDaoAndServiceConfig {
	
	//The following configuration values are RDS specific
	String dbName = System.getProperty("RDS_DB_NAME");
    String userName = System.getProperty("RDS_USERNAME");
    String password = System.getProperty("RDS_PASSWORD");
    String hostname = System.getProperty("RDS_HOSTNAME");
    String port = System.getProperty("RDS_PORT");
    String jdbcUrl = "jdbc:mysql://" +
    				hostname + ":"   +
    				port + "/" 	 	 +
    				"profile" 	 	 + 
    				"?user=" 	 	 +
    				userName 	  	 +
    				"&password=" 	 +
    				password;
    
    //This constants are used to refer the values in database.properties
	private static final String PROPERTY_NAME_DATABASE_DRIVER 
										= "database.driverClassName";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD 
    									= "database.password";
    private static final String PROPERTY_NAME_DATABASE_URL 
    									= "database.databaseurl";
    private static final String PROPERTY_NAME_DATABASE_USERNAME 
                                        = "database.username";
 
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT 
    									= "database.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL 
    									= "database.show_sql";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN 
    									= "entitymanager.packages.to.scan";
    
    @Resource
    private Environment env;
    
	@Bean
	public OrderingDao profileDao(){
		return new OrderingDaoImpl(entityManagerFactory().getObject());
	}
	
	//injecting profile service with profile dao.
	@Bean
	public OrderingService profileService(){
		return new OrderingImpl(profileDao());
	}
	
	//setting attributes and using the instance to fetch the use the database instance.
	@Bean
	public  LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean emf =  new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
		emf.setJpaVendorAdapter(jpaVendorAdapter());
		return emf;
	}
	
	//Setting properties for hibernate engine.
	@Bean
	   JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		jpaVendorAdapter.setShowSql(Boolean.getBoolean(env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL)));
		jpaVendorAdapter.setGenerateDdl(true);
		jpaVendorAdapter.setDatabasePlatform(env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
		return jpaVendorAdapter;
		}
	
	//Fetching the database instance using DriverManagerDataSource.
	@Bean
	public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	if(dbName != null){
		dataSource.setUrl(jdbcUrl);
		dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
	}else{
		dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
	    dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
	    dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
	    dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
	}
	return dataSource;
	}
	

}
