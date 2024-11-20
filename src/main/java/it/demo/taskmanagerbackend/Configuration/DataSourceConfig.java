package it.demo.taskmanagerbackend.Configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


@Configuration
public class DataSourceConfig {

    @Bean(name="customDataSource")
    public DataSource dataSourceConfig() {
        String jdbcUrl ="jdbc:mysql://localhost:3306/";
        String databaseName="taskmanager";
        String databaseUser="root";
        String databasePassword="root";

        try(Connection con = DriverManager.getConnection(jdbcUrl, databaseUser, databasePassword)) {
            Statement stmt = con.createStatement();

            //Creazione Database se non esiste
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + databaseName);
        } catch (SQLException e) {
            throw new RuntimeException("Errore Durante la creazione del Database.", e);
        }

        return DataSourceBuilder.create()
                .url(jdbcUrl+databaseName)
                .username(databaseUser)
                .password(databasePassword)
                .build();
    }

}
