package com.study.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @className: Genarator
 * @description: generator自动生成代码(Controller、Service、ServiceImpl、Mapper、Entity)
 * @author: Txc
 * @date: 2022/7/3 12:49
 **/
public class Generator {

    /**
     *  注意:{数据库信息}、{文件输出位置}、{模块名称}、{父级包名}、其他配置看自己需要再开启
     **/

    /* 数据库连接信息 */
    private static final DbType dbType = DbType.MYSQL;
    private static final String jdbcDiverClassName = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/testtxc?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static final String userName = "root";
    private static final String passWord = "123456";

    /* 文件输出位置 */
    private static final String outPutFileDir = System.getProperty("user.dir")+"\\microservice-api\\src\\main\\java";
//    private static final String outPutFileDir = "D:\\WorkingSoftware\\WokeSpace\\SpringBootStudy\\src\\main\\java";

    /* 过滤数据库表名前缀(可以一次性设置多个) */
    private static final String[] tablePrefix = {"sys_"};

    /* 过滤字段名前缀(可以一次性设置多个) */
    private static final String[] fieldPrefix = {""};

    /* 导出的数据库名(可以一次性导入多个) */
    private static final String[] tableName = {"sys_user"};

    /* 模块名称 */
    private static final String moduleName = "temporary.";

    /* 表中逻辑删除的字段 */
    private static final String isDel = "";

    /* 类注解信息 作者 */
    private static final String author = "Orange_Code";

    /* 父级包名 */
    private static final String parentPackage = "com.study";

    /* 包名 */
    private static final String controllerPackageName = moduleName + "controller";
    private static final String servicePackageName = moduleName + "service";
    private static final String serviceImplPackageName = moduleName + "service.serviceImpl";
    private static final String mapperPackageName = moduleName + "mapper";
    private static final String entityPackageName = moduleName + "entity";

    /* 设置service接口名 */
    private static final String serviceName = "%sService";

    public static void main(String[] args) {

        /* 数据库配置 */
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(dbType);   //数据库类型
        dataSourceConfig.setDriverName(jdbcDiverClassName); //数据库驱动
        dataSourceConfig.setUrl(url);                       //url
        dataSourceConfig.setUsername(userName);             //数据库用户名
        dataSourceConfig.setPassword(passWord);             //数据库密码

        /* 全局配置 */
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(outPutFileDir);   //文件输出位置
        globalConfig.setFileOverride(true);         //覆盖已生成文件
        globalConfig.setAuthor(author);             //作者名
        globalConfig.setOpen(false);                //生成文件后，是否打开文件夹
//        globalConfig.setDateType(DateType.ONLY_DATE);//设置时间类型
        globalConfig.setBaseResultMap(true);        //在mapper.xml文件中添加实体类与数据库表对应的resultMap
//        globalConfig.setEnableCache(true);          //是否开启二级缓存
        globalConfig.setServiceName(serviceName);   //设置service接口的名字

        /* 包相关配置 */
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(parentPackage);         //父包名
        packageConfig.setController(controllerPackageName);    //Controller 包名
        packageConfig.setService(servicePackageName);          //Service 包名
        packageConfig.setServiceImpl(serviceImplPackageName);  //ServiceImpl 包名
        packageConfig.setMapper(mapperPackageName);            //Mapper 包名
        packageConfig.setXml(mapperPackageName);               //MapperXML 包名
        packageConfig.setEntity(entityPackageName);            //Entity 包名

        /* 模板配置 */
        TemplateConfig templateConfig = new TemplateConfig();
//        templateConfig.setController();
//        templateConfig.setService();
//        templateConfig.setServiceImpl();
//        templateConfig.setMapper();
//        templateConfig.setXml();

        /* 策略配置 */
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude(tableName);                               //需要导出的数据库表
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);        //表名映射类名：下划线转化为首字母大写
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);  //字段映射属性名：下划线转化为首字母大写
        strategyConfig.setEntityLombokModel(true);                          //设置Lombok模式
//        strategyConfig.setRestControllerStyle(true);                        //controller中自动生成@RestController注解
//        strategyConfig.setControllerMappingHyphenStyle(false);              //controller中@RequestMapping驼峰转化为下划线 @RequestMapping("/sysUser") -> @RequestMapping("/sys-user")
        strategyConfig.setEntityTableFieldAnnotationEnable(true);           //是否生成实体时，生成字段注解
//        strategyConfig.setInclude(tableName.toUpperCase().split(","));     //Oracle数据，表名一定要大写，且表名要对应创建的用户，否则不生成代码
//        strategyConfig.setTablePrefix(tablePrefix);                         //过滤数据库表明前缀
//        strategyConfig.setFieldPrefix(fieldPrefix);                          //过滤字段名前缀
        strategyConfig.setSkipView(false);                                  //是否跳过视图
//        strategyConfig.setEntitySerialVersionUID(true);             //实体是否生成 serialVersionUID
        strategyConfig.setEntityTableFieldAnnotationEnable(true);           //是否生成实体时，生成字段注解
//        strategyConfig.setLogicDeleteFieldName(isDel);                    //逻辑删除的字段名

        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setDataSource(dataSourceConfig);      //数据源配置
        autoGenerator.setGlobalConfig(globalConfig);        //全局配置
        autoGenerator.setPackageInfo(packageConfig);        //包相关配置
        autoGenerator.setTemplate(templateConfig);          //模板相关配置
        autoGenerator.setStrategy(strategyConfig);          //数据库表配置 策略配置
//        autoGenerator.setCfg();                             //注入配置
//        autoGenerator.setConfig();                          //配置信息
//        autoGenerator.setTemplateEngine();                  //模板引擎
        autoGenerator.execute();        //开始执行代码生成
    }

}
