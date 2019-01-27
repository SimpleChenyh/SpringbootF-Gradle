package com.chenyh.config;


import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

@Configuration
@Component
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL resource = classLoader.getResource("sharding-jdbc.yaml");
        return YamlShardingDataSourceFactory.createDataSource(new File(resource.getFile()));
    }


}
