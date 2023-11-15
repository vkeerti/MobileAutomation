package com.quiktrak.utilities;

import com.itextpdf.text.Font;
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

public class PDFResultReport {

	public static Paragraph paragraph = null;
	public static Paragraph paragraph1 = null;
	public static PdfPTable table = null;
	public static PdfPTable table1 = null;
	public static PdfPTable table2 = null;
	public static Font bfBold12;
	public static Font summaryColor;
	public static Font bf12;
	public static Font Fontcolor;
	public static Font Fontcolor1;
	public static Document doc = null;
	public static Document document = null;
	public static PdfWriter docWriter;
	public static PdfWriter docWriter1;
	public static long testCaseStartTime;
	public static long testCaseStopTime;
	public static long testCaseElapsedTime;
	public static String strCaseStartTime;
	public static String strCaseStopTime;
	public static File suiteFolder;
	protected static File testFolder;
	private static File suiteFile;
	public static String suiteFilePath;
	public static PDFHeaderFooterPageEvent event;
	public static String suiteName;
	public static String testCaseReportsFolder = "PDFreport";
	public static String snapShotsFolder = "Snapshots";
	public static String filePath;
	public static List<String> testCaseStartTimeList = new ArrayList<String>();
	public static List<Integer> failCount = new ArrayList<Integer>();
	public static List<Integer> passCount = new ArrayList<Integer>();
	public static List<String> testCaseEndTimeList = new ArrayList<String>();
	public static List<String> testCaseNameList = new ArrayList<String>();
	public static List<String> testCaseDescriptionList = new ArrayList<String>();
	public static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	public static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
	public static final SimpleDateFormat DATE_FORMAT_NOW = new SimpleDateFormat("yyyyMMddHHmmss");
	public static long testStepTempTime;
	public static List<String> testStepElapsedTimeList = new ArrayList<String>();
	public static List<String> testCaseElapsedTimeList = new ArrayList<String>();
	public static File snapShotFolder;
	public static List<String> snapShotPathList = new ArrayList<String>();
	public static Map<String, String> statusMap = new HashMap<String, String>();
	public static List<String> stepCount = new ArrayList<String>();
	public static List<String> stepDescription = new ArrayList<String>();
	public static List<String> stepPrequisite = new ArrayList<String>();
	public static List<String> stepExpected = new ArrayList<String>();
	public static List<String> stepActual = new ArrayList<String>();
	public static List<String> stepStatus = new ArrayList<String>();
	public static List<String> objectEvidence = new ArrayList<String>();
	public static List<String> testCaseName = new ArrayList<String>();
	public static List<String> testCaseDesc = new ArrayList<String>();
	public static List<String> requirementID = new ArrayList<String>();
	public static List<String> cemli = new ArrayList<String>();
	public static List<String> businessProcess = new ArrayList<String>();
	public static List<String> testCaseName1 = new ArrayList<String>();
	public static List<String> testCaseDesc1 = new ArrayList<String>();
	public static List<String> testCaseStartTimeList1 = new ArrayList<String>();
	public static List<String> testCaseEndTimeList1 = new ArrayList<String>();
	public static int l = 2;
	public static int iter;
	public static void createPDFfile(String pdfFilename) {
		try {
			doc = new Document(PageSize.A4);
			DecimalFormat df = new DecimalFormat("0.00");
			bfBold12 = new Font(FontFamily.TIMES_ROMAN, 9, Font.BOLD, new BaseColor(0, 0, 0));
			summaryColor = new Font(FontFamily.TIMES_ROMAN, 9, Font.BOLD);
			summaryColor.setColor(BaseColor.BLUE);
			bf12 = new Font(FontFamily.TIMES_ROMAN, 9, Font.BOLD);
			Fontcolor = new Font(FontFamily.TIMES_ROMAN, 9, Font.BOLD);
			Fontcolor.setColor(8,141,30);
			// Fontcolor.setColor(BaseColor.GREEN);
			Fontcolor1 = new Font(FontFamily.TIMES_ROMAN, 9, Font.BOLD);
			Fontcolor1.setColor(BaseColor.RED);
			String path = testFolder + "//" + pdfFilename + ".pdf";
			docWriter = PdfWriter.getInstance(doc,new FileOutputStream(path));
			// doc.setMargins(36, 36, 75, 10);
			doc.setMargins(36,36,65,10);
			doc.setMarginMirroring(false);
			event = new PDFHeaderFooterPageEvent();
			docWriter.setPageEvent(event);
			doc.open();
			filePath = testFolder + "//" + pdfFilename + ".xls";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void generatePDFLogo() throws MalformedURLException, IOException, DocumentException {
		Image imgCG = Image.getInstance("C://Data//PDFReportData//QLogo2.png");
		float width1 = imgCG.getWidth()-75 ;
		float height1 = imgCG.getHeight()-75;
		imgCG.scaleAbsolute(width1,height1);
		imgCG.setAbsolutePosition(370f,790f);
		doc.add(imgCG);

	}


	public static void createTestRunReport(String testScriptName, String environmentName) throws Exception {
		try {
			generatePDFLogo();
			Paragraph header = new Paragraph();
			header.add("" + "\n");
			header.add(new Chunk("Company Name : QUIKTRAK" + "\n", FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.RED.brighter())));
			header.add(new Chunk("Test Script Name: ", FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLUE)));
			header.add(new Chunk(testScriptName + "\n", FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.BLACK)));
			//header.add(new Chunk("Company Name : " +"Quick TraK" + "\n", FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.RED.brighter())));

			event.setHeader(header);
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			paragraph1 = new Paragraph("", FontFactory.getFont(
					FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.BLACK));
			paragraph1.setAlignment(paragraph.ALIGN_LEFT);
			paragraph1 = new Paragraph("", FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.BLACK));
			doc.add(paragraph1);

			paragraph1 = new Paragraph("Test Script Information:", FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD,BaseColor.BLUE));
			paragraph1.setAlignment(paragraph.ALIGN_LEFT);

			float[] columnWidths = { 5f, 9f };
			table1 = new PdfPTable(columnWidths);
			table1.setHorizontalAlignment(Element.ALIGN_LEFT);
			table1.setWidthPercentage(50f);

			insertCell(table1,"Application Name",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"RQ Mobile App",Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Test Script Name",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,testScriptName,Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Test Script Type",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"Automation",	Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Environment",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,environmentName,Element.ALIGN_LEFT,1,bf12);
			/*insertCell(table1,"RunName",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,runName,Element.ALIGN_LEFT,1,bf12);*/
			insertCell(table1,"Execution Date",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,sysDate(),Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Android(Version)",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"13.0",Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Report Type",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"Post Execution Report",Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Build Version",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"4.1.0.44 (137)",Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Enabler",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"82032",Element.ALIGN_LEFT,1,bf12);
			insertCell(table1,"Product ID",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,"68782",Element.ALIGN_LEFT,1,bf12);
			InetAddress ipAddr = InetAddress.getLocalHost();
/*
			insertCell(table1,"System ID",Element.ALIGN_LEFT,1,summaryColor);
			insertCell(table1,ipAddr.getHostAddress(),Element.ALIGN_LEFT,1,bf12);
*/
			paragraph1.setIndentationLeft(3);
			paragraph1.add(table1);
			doc.add(paragraph1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public static void addStepDetails(String stepDesc, String stepExpResult, String stepActualResult,String stepResult, String objEvidence,AppiumDriver driver) throws AWTException {
		stepDescription.add(stepDesc);
		stepExpected.add(stepExpResult);
		stepActual.add(stepActualResult);
		stepStatus.add(stepResult);
		objectEvidence.add(objEvidence);
		long l = System.currentTimeMillis() - testStepTempTime;
		int i = 0;
		int j = (int) (l / 1000L);
		String str = String.valueOf(j);
		if (j >= 60) {
			i = j / 60;
			j %= 60;
			str = String.valueOf(j);
		}
		if (j <= 9)
			str = "0" + String.valueOf(j);
		testStepElapsedTimeList.add(sysTime());
		testStepTempTime = System.currentTimeMillis();
		// captureSnapShot(driver);
		fullScreenCapture(objEvidence,stepResult,driver);
	}

	public static void knowTestCaseStatus(String testScriptName) {
		try {
			int i = 0;
			int m = 0;
			int j = 0;
			for (int n = 0; n < stepStatus.size(); n++) {
				if ((((String) stepStatus.get(n)).trim().equalsIgnoreCase("pass")) && (stepDescription.get(n) != "")) {
					m++;
					passCount.add(m);
				} else if ((((String) stepStatus.get(n)).trim().equalsIgnoreCase("fail"))) {
					j++;
					i++;
					failCount.add(j);
				}
			}
			if (i > 0) {
				statusMap.put(testScriptName,"Fail");
			} else {
				statusMap.put(testScriptName,"Pass");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void generatePDFStepdetails(String testScriptName) throws Exception {
		try {
			int i = 0;
			int j = 0;
			int k = 0;
			int m = 0;
			int loop = 0;
			boolean st = true;
			testCaseNameList.add(testScriptName);
			for (int n = 0; n < stepStatus.size(); n++) {
				m = n + 1;

				if ((stepDescription.get(n) != "") && (stepExpected.get(n) != "") && (stepActual.get(n) != "")) {
					j++;
					System.out.println("Legth "+n+":"+stepPrequisite.size());

					if ((n <= stepPrequisite.size() - 1)) {
						if(!objectEvidence.get(n).equalsIgnoreCase("N")) {
							if ((st) || (snapShotPathList.get(n) != "")) {
								doc.newPage();
								st = false;
							}
						}else {
							if ((st) || (snapShotPathList.get(n) != "")) {
								st = false;
							}
						}
					}
					if ((n >=stepPrequisite.size() - 1)) {
						if(objectEvidence.get(n).equalsIgnoreCase("Y")) {
							if ((st) || (snapShotPathList.get(n) != "")) {
								doc.newPage();
								st = true;
							}
						}else if(objectEvidence.get(n).equalsIgnoreCase("N") && objectEvidence.get(n+1).equalsIgnoreCase("N")) {
							if ((st) || (snapShotPathList.get(n) != "")) {
								if(objectEvidence.get(n+3).equalsIgnoreCase("N")) {
									doc.newPage();
									st = true;
								}else {
									st = true;
								}
							}
						}
						else if(objectEvidence.get(n).equalsIgnoreCase("N") && objectEvidence.get(n+1).equalsIgnoreCase("Y") ) {
							if ((st) || (snapShotPathList.get(n) != "")) {
								//doc.newPage();
								st = false;
							}
						}
						else {
							if ((st) || (snapShotPathList.get(n) != "")) {
								st = false;
							}
						}
					}
					if (l == docWriter.getPageNumber()) {
						l++;
					}

					createParagraph(" ");
					float[] columnWidths = { 1f, 2f, 2f, 2f };
					table2 = new PdfPTable(columnWidths);
					table2.setWidthPercentage(99f);
					PdfPCell cell = new PdfPCell();
					cell.setColspan(8);
					cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
					table2.addCell(cell);

					createHeader1(table2,"Step No","Status","Objective Evidence","Exe Time",bfBold12);
					String s = sdf1.format(new Date());
					String t = Long.toString(testStepTempTime);
					int st1=1;
					if (loop != stepPrequisite.size()) {
						insertCell(table2,stepPrequisite.get(n),Element.ALIGN_CENTER,0,bf12);
						loop++;
					} else {
						iter++;
						insertCell(table2,Integer.toString(iter),Element.ALIGN_CENTER,0,bf12);
					}
					if (((String) stepStatus.get(n)).trim().equalsIgnoreCase("pass")) {
						insertCell(table2,stepStatus.get(n),Element.ALIGN_CENTER,0,Fontcolor);
					} else {
						insertCell(table2,stepStatus.get(n),Element.ALIGN_CENTER,0,Fontcolor1);
						i++;
					}
					insertCell(table2,objectEvidence.get(n),Element.ALIGN_CENTER,0,	bf12);
					insertCell(table2,testStepElapsedTimeList.get(n),Element.ALIGN_CENTER,0,bf12);
					insertCell(table2,"Description:",Element.ALIGN_LEFT,4,bfBold12);
					insertCell(table2,stepDescription.get(n),Element.ALIGN_LEFT,4,bf12);
					insertCell(table2,"Expected:",Element.ALIGN_LEFT,4,	bfBold12);
					insertCell(table2,stepExpected.get(n),Element.ALIGN_LEFT,4,bf12);
					insertCell(table2,"Actual:",Element.ALIGN_LEFT,4,bfBold12);
					insertCell(table2,stepActual.get(n),Element.ALIGN_LEFT,	4,bf12);
					paragraph.add(table2);
					doc.add(paragraph);
				}
				AddImagetoPDF(1,snapShotFolder + "//" + snapShotPathList.get(n),doc,m);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			snapShotPathList.clear();
			testCaseName.clear();
			testCaseDesc.clear();
			stepCount.clear();
			stepDescription.clear();
			stepExpected.clear();
			stepActual.clear();
			passCount.clear();
			failCount.clear();
			stepStatus.clear();
			objectEvidence.clear();
			testCaseStartTimeList.clear();
			testCaseEndTimeList.clear();
			testStepElapsedTimeList.clear();
			try {
				if (doc != null) {
					doc.close();
				}
				if (docWriter != null) {
					docWriter.close();
				}
				paragraph.clear();
			} catch (Exception localException) {
				localException.printStackTrace();
			}
		}
	}

	public static void createParagraph(String inputString) throws Exception {
		try {
			paragraph = new Paragraph(inputString, FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.BLACK));
			paragraph.setAlignment(paragraph.ALIGN_LEFT);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createTable() {
		try {
			float[] columnWidths = { 3f, 2f, 2f, 2f, 2f, 1.5f, 2f };
			table = new PdfPTable(columnWidths);
			table.setWidthPercentage(99f);
			PdfPCell cell = new PdfPCell();
			cell.setColspan(7);
			cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(cell);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addSummaryReport(String testScriptName, String testScriptDesc, String reqID, String celi,String bProcess) {
		try {
			testCaseName.add(testScriptName);
			testCaseDesc.add(testScriptDesc);
			requirementID.add(reqID);
			cemli.add(celi);
			businessProcess.add(bProcess);
			testCaseName1.add(testScriptName);
			testCaseDesc1.add(testScriptDesc);
			long l = System.currentTimeMillis() - testStepTempTime;
			int i = 0;
			int j = (int) (l / 1000L);
			String str = String.valueOf(j);
			if (j >= 60) {
				i = j / 60;
				j %= 60;
				str = String.valueOf(j);
			}
			if (j <= 9)
				str = "0" + String.valueOf(j);
			testCaseElapsedTimeList.add(i + ":" + str);
			testStepTempTime = System.currentTimeMillis();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void generatePDFSummaryReport(String testScriptName) throws Exception {
		try {
			int m;
			knowTestCaseStatus(testScriptName);
			paragraph = new Paragraph("SUMMARY REPORT:", FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD,BaseColor.RED));
			paragraph.setAlignment(paragraph.ALIGN_LEFT);
			doc.add(Chunk.NEWLINE); // Do not comment this
			createTable();
			createHeader(table,"Test Case Name","Dealer Name","Client Name","Business Process","Script Status","Start Time","End Time","",summaryColor);
			String s = sdf1.format(new Date());
			for (int k = 0; k < testCaseName.size(); k++) {
				String t = Long.toString(testStepTempTime);
				m = k + 1;
				insertCell(table,testCaseName.get(k),Element.ALIGN_CENTER,0,bf12);
				insertCell(table,requirementID.get(k),Element.ALIGN_CENTER,0,Fontcolor);
				insertCell(table,cemli.get(k),Element.ALIGN_CENTER,0,Fontcolor);
				insertCell(table,businessProcess.get(k),Element.ALIGN_CENTER,0,bf12);
				if ((statusMap.get(testScriptName) != null)&& (((String) statusMap.get(testScriptName)).trim().equalsIgnoreCase("Pass"))) {
					insertCell(table,"PASS",Element.ALIGN_CENTER,0,Fontcolor);
				} else if ((statusMap.get(testScriptName) != null)
						&& (((String) statusMap.get(testScriptName)).trim().equalsIgnoreCase("Fail"))) {
					insertCell(table,"FAIL",Element.ALIGN_CENTER,0,Fontcolor1);
				}
				insertCell(table,testCaseStartTimeList.get(0),Element.ALIGN_CENTER,0,bf12);
				insertCell(table,testCaseEndTimeList.get(0),Element.ALIGN_CENTER,0,	bf12);
			}
			insertCell(table,"RQ Mobile Feature:",Element.ALIGN_LEFT,7,bfBold12);
			insertCell(table,testCaseDesc.get(0),Element.ALIGN_LEFT,7,bf12);
			paragraph.add(table);
			doc.add(paragraph);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertCell(PdfPTable table, String inputString, int align, int colspan, Font bfBold12) {
		try {
			PdfPCell cell = new PdfPCell(new Phrase(inputString.trim(), bfBold12));
			cell.setHorizontalAlignment(align);
			cell.setColspan(colspan);
			if ((inputString.trim().equalsIgnoreCase("Description:"))|| (inputString.trim().equalsIgnoreCase("Expected:"))|| (inputString.trim().equalsIgnoreCase("Actual:"))|| (inputString.trim().equalsIgnoreCase("Objective/Acceptance Criteria of script:"))) {
				cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
			}
			if (inputString.trim().equalsIgnoreCase("")) {
				cell.setMinimumHeight(10f);
			}
			table.addCell(cell);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createHeader(PdfPTable table, String testCaseName, String ReqID, String celm, String bPross,String testResult, String startTime, String endTime, String Param8, Font bfBold12) {
		try {

			insertCell(table,testCaseName,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,ReqID,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,celm,Element.ALIGN_CENTER,	1,bfBold12);
			insertCell(table,bPross,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,testResult,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(	table,startTime,Element.ALIGN_CENTER,1,bfBold12);
			if (Param8 != "") {
				insertCell(table,Param8,Element.ALIGN_CENTER,1,bfBold12);
			}
			insertCell(table,endTime,Element.ALIGN_CENTER,1,bfBold12);
			table.setHeaderRows(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createHeader1(PdfPTable table, String stepNo, String stepResult, String objEvidence,
									 String exeTime, Font bfBold12) {
		try {
			insertCell(table,stepNo,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,stepResult,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,objEvidence,Element.ALIGN_CENTER,1,bfBold12);
			insertCell(table,exeTime,Element.ALIGN_CENTER,1,bfBold12);
			table.setHeaderRows(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void AddImagetoPDF(int indentatin, String imagePath, Document doc, int m) throws DocumentException,
			MalformedURLException, IOException {
		try {

			Image img = Image.getInstance(imagePath);
			if (img != null) {
				float scaler = ((doc.getPageSize().getWidth() - doc.leftMargin() - doc.rightMargin() - indentatin) / img.getWidth()) * 50;
				img.scalePercent(scaler);
				if ((stepDescription.get(m - 1) != "") && (stepExpected.get(m - 1) != "")&& (stepActual.get(m - 1) != "")) {
					createParagraph("Screen Attachment: Step No " + Integer.toString(iter));
					doc.add(paragraph);
					doc.add(img);
				} else {
					doc.newPage();
					doc.add(new Paragraph(" "));
					doc.add(new Paragraph(" "));
					doc.add(new Paragraph(" "));
					doc.add(img);
					l++;
				}
			}
		} catch (Exception e) {

		}
	}
	public static void captureTestCaseStartTime() {
		testCaseStartTime = System.currentTimeMillis();
		strCaseStartTime = sdf.format(new Date());
		testCaseStartTimeList.add(strCaseStartTime);
		testCaseStartTimeList1.add(strCaseStartTime);
		testStepTempTime = testCaseStartTime;
	}
	public static void captureTestCaseEndTime() {
		testCaseStopTime = System.currentTimeMillis();
		strCaseStopTime = sdf.format(new Date());
		testCaseEndTimeList.add(strCaseStopTime);
		testCaseEndTimeList1.add(strCaseStopTime);
		calculateElapsedTime();
	}

	public static void calculateElapsedTime() {
		testCaseElapsedTime = testCaseStopTime - testCaseStartTime;
		int i = 0;
		int j = (int) (testCaseElapsedTime / 1000L);
		String str = String.valueOf(j);
		if (j >= 60) {
			i = j / 60;
			j %= 60;
			str = String.valueOf(j);
		}
		if (j <= 9)
			str = "0" + String.valueOf(j);
		testCaseElapsedTimeList.add(String.valueOf(i) + ":" + str);
	}

	public static String sysTime() {
		Calendar cal = Calendar.getInstance();
		String time = sdf.format(cal.getTime());
		cal.clear();
		return time;
	}

	public static String sysDate() {
		Calendar cal = Calendar.getInstance();
		String date = sdf1.format(cal.getTime());
		cal.clear();
		return date;
	}
	public static void fullScreenCapture(String objEvidence, String stepResult,AppiumDriver driver) throws AWTException {
		try {
			//Robot robot = new Robot();
			String format = "png";
			String fileName = "SnapShot_" + DATE_FORMAT_NOW.format(new Date()) + ".png";
			//Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			File source=driver.getScreenshotAs(OutputType.FILE);
			String destination = snapShotFolder+ "//" + fileName;
			FileUtils.copyFile(source, new File(destination));
			//BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
			if (((objEvidence == "Y") && (stepResult.equalsIgnoreCase("Pass")))) {
				//ImageIO.write(screenFullImage,format,new File(snapShotFolder + "//" + fileName));
				snapShotPathList.add(fileName);
			}else if(((objEvidence == "N")||(objEvidence == "Y") && (stepResult.equalsIgnoreCase("Fail")))) {
				//ImageIO.write(screenFullImage,format,new File(snapShotFolder + "//" + fileName));
				//snapShotPathList.add(fileName);
			}
			else {
				snapShotPathList.add("");
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	public static void generateSuiteResultFolder(String scriptPath) {
		File localFile = new File(scriptPath + "/" + "ExecutionResults");
		System.out.println(System.getProperty("user.dir"));
		if (!localFile.exists())
			localFile.mkdir();
		suiteFolder = new File(localFile + "/" + suiteName + "_" + DATE_FORMAT_NOW.format(new Date()));
		if (!suiteFolder.exists())
			suiteFolder.mkdir();
		testFolder = new File(suiteFolder + "/" + testCaseReportsFolder);
		snapShotFolder = new File(suiteFolder + "/" + snapShotsFolder);
		if (!testFolder.exists())
			testFolder.mkdir();
		if (!snapShotFolder.exists())
			snapShotFolder.mkdir();
	}


}
