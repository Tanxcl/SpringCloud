package com.study.common.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @className: ExcelExport
 * @description: Excel工具
 * @author: Txc
 * @date: 2022/7/3 23:52
 **/
public class ExcelUtil {

    /**
     * 通用Excel导出
     * @param request   请求体request
     * @param response  响应体response
     * @param fileName  文件名
     * @param list  数据集合
     * @param order 数据排列的顺序，填写实体类属性名
     * @param title 标题
     */
    public static void exportExcel(HttpServletRequest request, HttpServletResponse response,
                                   String fileName, List<Map<String,String>> list, String[] order, String[] title){

        //创建Excel对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //创建工作表
        HSSFSheet sheet = wb.createSheet();
        //创建行/列
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        //控制行号列号
        int rowNo=1;
        int colNo=0;
        //判断几级表头

        //设计样式

        //写入数据
        for (int i = 0; i < list.size(); i++) {
            row = sheet.createRow(rowNo++);
            int num = 0;
            //第一种Map遍历
            for (int j = 0; j < list.get(i).size(); j++){
                cell = row.createCell(colNo++);
                cell.setCellValue(list.get(i).get(order[num]));
                num++;
            }
            //第二种Map遍历
//            for (Map.Entry<String, String> entry : list.get(i).entrySet()) {
//                cell = row.createCell(colNo++);
//                cell.setCellValue(list.get(i).get(order[num]));
//                num++;
//            }
        }

        //将Excel响应到前端
        exportExcel(request, response, fileName, wb);
    }

    /**
     * 将Excel响应到前端
     */
    public static void exportExcel(HttpServletRequest request,
                                   HttpServletResponse response, String fileName, Workbook wb) {
        try {
            final String userAgent = request.getHeader("USER-AGENT");
            if (userAgent.toLowerCase().indexOf("firefox") > 0) {
                fileName = new String(fileName.getBytes(), "ISO-8859-1");
            } else {
                fileName = URLEncoder.encode(fileName, "UTF-8");
            }
            fileName=fileName.replace("%0d", "").replace("%0a", "");
            OutputStream os = response.getOutputStream();
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((fileName + ".xlsx")));
            wb.write(os);
            os.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
