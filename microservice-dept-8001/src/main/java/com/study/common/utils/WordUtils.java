package com.study.common.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @className: WordUtils
 * @description: TODO 使用ftl模板到处Word文件
 * @author: Txc
 * @date: 2022/12/15 13:24
 **/
public class WordUtils {

    //获得数据，系统相关，就不展示了，下面写死一些数据为例
    /*Map<String, Object> map = new HashMap<String, Object>();//将对象存入map中
        map.put("meetingTitle","会议标题");
        map.put("username","会议发起人");
        map.put("takeParkIn","参会人员");
        map.put("allSummary","概要");
        map.put("duration","会议持续时间");
        map.put("place","会议地点");
        map.put("content","会议内容");

        WordUtils.exportMillCertificateWord(request,response,map);*/

    //配置信息,代码本身写的还是很可读的,就不过多注解了
    private static Configuration configuration = null;
    //这里注意的是利用WordUtils的类加载器动态获得模板文件的位置
    private static final String templateFolder = WordUtils.class.getClassLoader().getResource("").getPath()+"/templates/";  //FTL文件所存在的位置
    static {
        configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");
        try {
            configuration.setDirectoryForTemplateLoading(new File(templateFolder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private WordUtils() {
        throw new AssertionError();
    }

    public static void exportMillCertificateWord(HttpServletRequest request, HttpServletResponse response, Map map) throws IOException {
        Template freemarkerTemplate = configuration.getTemplate("test.ftl");
        File file = null;
        InputStream fin = null;
        ServletOutputStream out = null;
        try {
            // 调用工具类的createDoc方法生成Word文档
            file = createDoc(map,freemarkerTemplate);
            fin = new FileInputStream(file);

            response.setCharacterEncoding("utf-8");
            response.setContentType("application/msword");
            // 设置浏览器以下载的方式处理该文件名
            String fileName = "会议详情"+".doc";

            //String fileName = "材质单"+DateUtils.curDateTimeStr14() + ".doc";

            response.setHeader("Content-Disposition", "attachment;filename="
                    .concat(String.valueOf(URLEncoder.encode(fileName, "UTF-8"))));

            out = response.getOutputStream();
            byte[] buffer = new byte[512];  // 缓冲区
            int bytesToRead = -1;
            // 通过循环将读入的Word文件的内容输出到浏览器中
            while((bytesToRead = fin.read(buffer)) != -1) {
                out.write(buffer, 0, bytesToRead);
            }
        } finally { //关闭资源
            if(fin != null) fin.close();
            if(out != null) out.close();
            if(file != null) file.delete(); // 删除临时文件
        }
    }

    private static File createDoc(Map<?, ?> dataMap, Template template) {
        String name =  "f:/test.doc";
        File f = new File(name);
        Template t = template;
        try {
            // 这个地方不能使用FileWriter因为需要指定编码类型否则生成的Word文档会因为有无法识别的编码而无法打开
            Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
            t.process(dataMap, w);
            w.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return f;
    }

}
