package com.sc.xxb.util;

import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.awt.Color;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.PicturesManager;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.hwpf.model.FieldsDocumentPart;
import org.apache.poi.hwpf.usermodel.*;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;


/**
 * 实现java用poi实现对word读取和修改操作
 *
 * @author fengcl
 */
public class WordHelper {

    /**
     * 实现对word读取和修改操作
     *
     * @param filePath word模板路径和名称
     * @param map      待填充的数据，从数据库读取
     */
    public static void readwriteWord(String filePath, String toFilePath, Map<String, String> map) {
        //读取word模板
//        String fileDir = new File(base.getFile(),"http://www.cnblogs.com/http://www.cnblogs.com/../doc/").getCanonicalPath();
        System.out.println(filePath + "filePath");
        System.out.println(toFilePath + "toFilePath");
        FileInputStream in = null;
        try {
            in = new FileInputStream(new File(filePath));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        HWPFDocument hdt = null;
        try {
            hdt = new HWPFDocument(in);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        Fields fields = hdt.getFields();
        Iterator<Field> it = fields.getFields(FieldsDocumentPart.MAIN).iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getType());
        }

        //读取word文本内容
        Range range = hdt.getRange();
        //System.out.println(range.text());
        //替换文本内容
        for (Map.Entry<String, String> entry : map.entrySet()) {
            range.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(toFilePath, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            hdt.write(ostream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //输出字节流
        try {
            out.write(ostream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ostream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//======================输出文件流下载方式：==========================　　


    /**
     * 实现对word读取和修改操作
     *
     * @param response 响应,设置生成的文件类型,文件头编码方式和文件名,以及输出
     * @param filePath word模板路径和名称
     * @param map      待填充的数据，从数据库读取
     */
    public static void readwriteWord(HttpServletResponse response, String filePath, Map<String, String> map) {
        //读取word模板文件
//        String fileDir = new File(base.getFile(),"http://www.cnblogs.com/http://www.cnblogs.com/../doc/").getCanonicalPath();
//        FileInputStream in = new FileInputStream(new File(fileDir+"/laokboke.doc"));
        FileInputStream in;
        HWPFDocument hdt = null;
        try {
            in = new FileInputStream(new File(filePath));
            hdt = new HWPFDocument(in);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        Fields fields = hdt.getFields();
        Iterator<Field> it = fields.getFields(FieldsDocumentPart.MAIN).iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getType());
        }

        //替换读取到的word模板内容的指定字段
        Range range = hdt.getRange();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            range.replaceText("$" + entry.getKey() + "$", entry.getValue());
        }

        //输出word内容文件流，提供下载
        response.reset();
        response.setContentType("application/x-msdownload");
        String fileName = "" + System.currentTimeMillis() + ".doc";
        response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
        OutputStream servletOS = null;
        try {
            servletOS = response.getOutputStream();
            hdt.write(ostream);
            servletOS.write(ostream.toByteArray());
            servletOS.flush();
            servletOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void wordToPdf() {

        ActiveXComponent app = null;
        String wordFile = "C:/test/1523464734340.doc";
        String pdfFile = "C:/test/2教育消费分期彭州412.pdf";
        System.out.println("开始转换...");
        // 开始时间
        long start = System.currentTimeMillis();
        try {
            // 打开word
            app = new ActiveXComponent("Word.Application");
            // 设置word不可见,很多博客下面这里都写了这一句话，其实是没有必要的，因为默认就是不可见的，如果设置可见就是会打开一个word文档，对于转化为pdf明显是没有必要的
            app.setProperty("Visible", false);
            // 获得word中所有打开的文档
            Dispatch documents = app.getProperty("Documents").toDispatch();
            System.out.println("打开文件: " + wordFile);
            // 打开文档
            Dispatch document = Dispatch.call(documents, "Open", wordFile, false, true).toDispatch();
            // 如果文件存在的话，不会覆盖，会直接报错，所以我们需要判断文件是否存在
            File target = new File(pdfFile);
            if (target.exists()) {
                target.delete();
            }
            System.out.println("另存为: " + pdfFile);
            // 另存为，将文档报错为pdf，其中word保存为pdf的格式宏的值是17
            Dispatch.call(document, "SaveAs", pdfFile, 17);
            // 关闭文档
            Dispatch.call(document, "Close", false);
            // 结束时间
            long end = System.currentTimeMillis();
            System.out.println("转换成功，用时：" + (end - start) + "ms");
        } catch (Exception e) {
            System.out.println("转换失败" + e.getMessage());
        } finally {
            // 关闭office
            app.invoke("Quit", 0);
        }

    }

    static final int wdFormatPDF = 17;// PDF 格式
    static ActiveXComponent app = null;

    public static void wordToPDF(String sfileName, String toFileName) {

        System.out.println("启动Word...");
        long start = System.currentTimeMillis();

        Dispatch doc = null;
        System.out.println("启动app");
        try {
            if (app == null) {
                ComThread.Release();
                app = new ActiveXComponent("Word.Application");
                app.setProperty("Visible", new Variant(false));
            }
            System.out.println("app启动完成");
            Dispatch docs = app.getProperty("Documents").toDispatch();

            // String path =  this.getSession().getServletContext().getRealPath("/")+"attachment/";
//            String sfileName = path+"/doc/"+ docFileName + ".doc";
//            String toFileName = path+"/pdf/"+ docFileName + ".pdf";
//            String sfileName = "E:/test/1523464734340.doc";;
//            String toFileName = "E:/test/2教育消费分期彭州412.pdf";

            doc = Dispatch.call(docs, "Open", sfileName).toDispatch();
            System.out.println("打开文档..." + sfileName);
            System.out.println("转换文档到PDF..." + toFileName);
            File tofile = new File(toFileName);
            if (tofile.exists()) {
                tofile.delete();
            }
            Dispatch.call(doc,
                    "SaveAs",
                    toFileName, // FileName
                    wdFormatPDF);
            long end = System.currentTimeMillis();
            System.out.println("转换完成..用时：" + (end - start) + "ms.");


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("========Error:文档转换失败：" + e.getMessage());
        } finally {
            Dispatch.call(doc, "Close", false);
            System.out.println("关闭文档");
//            if (app != null)
//                app.invoke("Quit", new Variant[] {});
        }
        //如果没有这句话,winword.exe进程将不会关闭


    }

    public static void writeFile(String content, String path) {
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        org.jsoup.nodes.Document doc = Jsoup.parse(content);
        content = doc.html();
        try {
            File file = new File(path);
            fos = new FileOutputStream(file);
            bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
            bw.write(content);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fos != null)
                    fos.close();
            } catch (IOException ie) {
            }
        }
    }

    //word 转 html
    public static void convert2Html(String fileName, String outPutFile)
            throws TransformerException, IOException,
            ParserConfigurationException {

        HWPFDocument wordDocument = new HWPFDocument(new FileInputStream(fileName));//WordToHtmlUtils.loadDoc(new FileInputStream(inputFile));
        //兼容2007 以上版本
//        XSSFWorkbook  xssfwork=new XSSFWorkbook(new FileInputStream(fileName));
        WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
                DocumentBuilderFactory.newInstance().newDocumentBuilder()
                        .newDocument());
        wordToHtmlConverter.setPicturesManager(new PicturesManager() {
            public String savePicture(byte[] content,
                                      PictureType pictureType, String suggestedName,
                                      float widthInches, float heightInches) {
                return "test/" + suggestedName;
            }
        });
        wordToHtmlConverter.processDocument(wordDocument);
        //save pictures
        List pics = wordDocument.getPicturesTable().getAllPictures();
        if (pics != null) {
            for (int i = 0; i < pics.size(); i++) {
                Picture pic = (Picture) pics.get(i);
                System.out.println();
                try {
                    pic.writeImageContent(new FileOutputStream("D:/test/"
                            + pic.suggestFullFileName()));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        Document htmlDocument = wordToHtmlConverter.getDocument();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DOMSource domSource = new DOMSource(htmlDocument);
        StreamResult streamResult = new StreamResult(out);


        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer serializer = tf.newTransformer();
        serializer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        serializer.setOutputProperty(OutputKeys.INDENT, "yes");
        serializer.setOutputProperty(OutputKeys.METHOD, "HTML");
        serializer.transform(domSource, streamResult);
        out.close();
        writeFile(new String(out.toByteArray()), outPutFile);
    }


    public static void main(String[] args) {
//        Map<String,String> map =new HashMap<String,String>();
//        map.put("学员","黄雪峰");
//        map.put("学校","电子科技大学");
//        WordHelper.readwriteWord("D:\\backup\\1教育消费分期彭州411.doc",map);


//        try {
//            WordHelper.convert2Html("E:/test/1523464734340.doc","E:/test/1523464734340.html");
//        } catch (TransformerException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }
    }
}