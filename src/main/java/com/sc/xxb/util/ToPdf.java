package com.sc.xxb.util;

import com.itextpdf.text.*;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.*;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ToPdf {

	private String imgPath = "";
	private String outPath = "";
	public ToPdf(String imgPath,String outPath) {
		this.imgPath = imgPath;
		this.outPath = outPath;
	}

	public ToPdf() {
	}

	public void t()
	{
		//创建一个文档对象
		Document doc = new Document();
		try {
			//定义输出文件的位置
			try {
				PdfWriter.getInstance(doc, new FileOutputStream(outPath));
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			//开启文档
			doc.open();
			//设定字体 为的是支持中文
			//BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			// Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
			//向文档中加入图片
//			for(int i=1;i<2;i++)
//			{
				//取得图片~~~图片格式：
				Image jpg1 = Image.getInstance(imgPath); //原来的图片的路径
				//获得图片的高度
				float heigth=jpg1.getHeight();
				float width=jpg1.getWidth();
				System.out.println("heigth---"+heigth);
				System.out.println("width-----"+width);
				//合理压缩，h>w，按w压缩，否则按w压缩
				//int percent=getPercent(heigth, width);
				//统一按照宽度压缩
				int percent=getPercent2(heigth, width);
				//设置图片居中显示
				jpg1.setAlignment(Image.MIDDLE);
				//直接设置图片的大小~~~~~~~第三种解决方案，按固定比例压缩
				//jpg1.scaleAbsolute(210.0f, 297.0f);
				//按百分比显示图片的比例
				jpg1.scalePercent(percent);//表示是原来图像的比例;
				//可设置图像高和宽的比例
				//jpg1.scalePercent(50, 100);
				doc.add(jpg1);
//			}
			//关闭文档并释放资源
			doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 第一种解决方案
	 * 在不改变图片形状的同时，判断，如果h>w，则按h压缩，否则在w>h或w=h的情况下，按宽度压缩
	 * @param h
	 * @param w
	 * @return
	 */

	public int getPercent(float h,float w)
	{
		int p=0;
		float p2=0.0f;
		if(h>w)
		{
			p2=297/h*100;
		}
		else
		{
			p2=210/w*100;
		}
		p=Math.round(p2);
		return p;
	}
	/**
	 * 第二种解决方案，统一按照宽度压缩
	 * 这样来的效果是，所有图片的宽度是相等的，自我认为给客户的效果是最好的
	 * @param args
	 */
	public int getPercent2(float h,float w)
	{
		int p=0;
		float p2=0.0f;
		p2=530/w*100;
		p=Math.round(p2);
		return p;
	}


	public static void htmlCodeComeFromFile(String filePath, String pdfPath) {
		Document document = new Document();
		try {
			StyleSheet st = new StyleSheet();
			st.loadTagStyle("body", "leading", "16,0");
			PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
			document.open();
			ArrayList p = (ArrayList) HTMLWorker.parseToList(new FileReader(filePath), st);
			for(int k = 0; k < p.size(); ++k) {
				document.add((Element)p.get(k));
			}
			document.close();
			System.out.println("文档创建成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void htmlCodeComeString(String htmlCode, String pdfPath) {
		Document doc = new Document(PageSize.A4);
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(pdfPath));
			doc.open();
			// 解决中文问题
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
			Paragraph t = new Paragraph(htmlCode, FontChinese);
			doc.add(t);
			doc.close();
			System.out.println("文档创建成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 插入图片
	 *
	 * @param ps
	 * @param s
	 * @author WangMeng
	 * @date 2016年6月16日
	 */
	public static void insertImage(PdfStamper ps, AcroFields s)
	{


		try
		{
			List<AcroFields.FieldPosition> list = s.getFieldPositions("甲方");
			Rectangle signRect = list.get(0).position;


			Image image = Image.getInstance("E:/1524061509682.png");
			PdfContentByte under = ps.getOverContent(2);
			float x = signRect.getLeft();
			float y = signRect.getBottom();
			System.out.println(x);
			System.out.println(y);
			image.setAbsolutePosition(x, y);
			image.scaleToFit(signRect.getWidth(), signRect.getHeight());


			under.addImage(image);
		}
		catch (Exception e)
		{
// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	/**
	 * 第三种解决方案，就是直接压缩，不安像素比例，全部压缩到固定值，如210*297
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		//ToPdf pt=new ToPdf("C:\\Users\\hulei\\Desktop\\1.png","C:\\Users\\hulei\\Desktop\\cs.pdf");
		//pt.t();
//		ToPdf.htmlCodeComeFromFile("E:/test/1.html","E:/test/1523464734343.pdf");
		try
		{
			String TemplatePDF = "E:/1524061348398.pdf";
			// 生成的文件路径
			String outFile = "E:/MY.pdf";
//			String TemplatePDF = "e:/F-3.pdf"; //魔板路径
//			String outFile = "e:/test.pdf"; //生成新的pdf的路径
			PdfReader reader = new PdfReader(TemplatePDF);
			PdfStamper ps = new PdfStamper(reader, new FileOutputStream(outFile)); // 生成的输出流

			AcroFields s = ps.getAcroFields();

// 插入图片
			insertImage(ps, s);
			ps.close();
			reader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
