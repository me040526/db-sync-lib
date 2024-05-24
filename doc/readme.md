# 数据库对象同步类库（DBSyncLib）

DBSyncLib 是一个 Java 类库，提供了在不同数据库之间同步数据库对象（如表、约束、索引、触发器和外键）的功能。

## 功能特点

- 数据库对象模型的抽象化。
- 同步任务的调度和执行。
- 支持多种同步模式（全量、增量等）。
- 冲突解决机制，确保数据同步的一致性。
- 通过 JDBC 驱动程序支持多种数据库类型的数据库连接管理。

## 开始使用

### 先决条件

- 已安装 Java 8 或更高版本。
- 使用 Maven 构建项目。
- 目标数据库的 JDBC 驱动程序。

### 安装

在您的 Maven 项目中添加以下依赖项：

```xml
<dependency>
    <groupId>com.gtsoft</groupId>
    <artifactId>db-sync-lib</artifactId>
    <version>1.0.0</version>
</dependency>