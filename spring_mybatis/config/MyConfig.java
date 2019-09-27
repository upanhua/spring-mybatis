package spring_mybatis.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import spring_mybatis.annotation.MyScan;

import javax.sql.DataSource;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 9:39
 */
@Configuration
@ComponentScan("spring_mybatis")
@MyScan
public class MyConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/heima");
        return driverManagerDataSource;
    }

}
