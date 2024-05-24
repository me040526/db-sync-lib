package com.gtsoft;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ddlutils.Platform;
import org.apache.ddlutils.PlatformFactory;
import org.apache.ddlutils.io.DatabaseIO;
import org.apache.ddlutils.model.Database;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 创建一个DataSource实例
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@172.19.1.202:1521:ORCL"); // 替换为你的实际数据库连接 URL
        dataSource.setUsername("SCOTT"); // 替换为你的数据库用户名
        dataSource.setPassword("Ceshi123"); // 替换为你的数据库密码

        // 创建一个Platform实例
        Platform platform = PlatformFactory.createNewPlatformInstance(dataSource);

        Database database = platform.readModelFromDatabase("test", "ORCL", "ZJQ002", null);

        System.out.printf("Database name: %s\n", database.getName());
        System.out.printf("Tables count: %d\n", database.getTableCount());

        new DatabaseIO().write(database, System.out);
    }
}